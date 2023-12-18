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
        long min = get_min_yey(n_bld, wanted_colors, h_each, 0, 0, 0, 0);
        
        
        System.out.println(min);
    }
    private static long get_min_yey(int num, int desired, long[] h_each, long highest_former, int visible_n, long cost, int pos_now){
        if(visible_n >= desired) return cost;
        if((num - pos_now) < (desired - visible_n)) return Long.MAX_VALUE;
        
        if(h_each[pos_now] > highest_former) return get_min_yey(num, desired, h_each, h_each[pos_now], visible_n+1, cost, pos_now+1);
        long a = get_min_yey(num, desired, h_each, highest_former, visible_n, cost, pos_now+1);     //自分を無視した場合
        long b = get_min_yey(num, desired, h_each, highest_former+1, visible_n+1, cost+highest_former-h_each[pos_now]+1, pos_now+1);     //かさ上げした場合
        return Math.min(a, b);
    }
}