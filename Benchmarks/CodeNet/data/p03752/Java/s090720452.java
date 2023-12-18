import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n_bld = Integer.parseInt(sc.next());
        int wanted_colors = Integer.parseInt(sc.next());
        long[] h_each = new long[n_bld];
        for(int i=0; i<n_bld; i++){
            h_each[i] = Integer.parseInt(sc.next());
        }
        int visible_n=0;
        int cost=0, min=Integer.MAX_VALUE;
        //int[] h_new = new int[n_bld];
        long highest_former=0;
        for(long bit=0; bit < (1<<n_bld); bit++){
            visible_n=0;
            highest_former=0;
            cost=0;
            for(int i=0; i<n_bld; i++){
                if(h_each[i] > highest_former){
                    highest_former=h_each[i];
                    visible_n++;
                }else if((bit&(1<<i)) > 0){
                    visible_n++;
                    highest_former++;
                    cost += (highest_former - h_each[i]);
                }
            }
            if((visible_n >= wanted_colors) && (cost < min)) min=cost;
        }
        
        
        System.out.println(min);
    }
}