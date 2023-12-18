import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        if(r - l >= 2019){
            System.out.println(0);
        }else{
            int min = Integer.MAX_VALUE;
            
            for(int i = l; i <= r; i++){
                for(int j = i+1; j <= r; j++){
                     min = Math.min(min, (i*j) % 2019);
                }
            }
            
            System.out.println(min);
        }
    }
}
