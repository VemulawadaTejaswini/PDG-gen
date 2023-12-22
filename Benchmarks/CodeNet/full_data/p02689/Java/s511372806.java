import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int []v = new int[n + 1];
        int []c = new int[n + 1];
        for(int i = 1; i <= n; ++i) {
            v[i] = sc.nextInt();
        }

        for(int i = 1; i <= m; ++i){
            int a, b; 
            a = sc.nextInt();
            b = sc.nextInt();
            c[a] --;
            if(v[b] < v[a]){
                c[a] ++;
            }
            c[b] --;
            if(v[b] > v[a]){
                c[b] ++;
            }
        }
        int ans = 0;
        for(int i = 1; i <= n; ++i) {
            ans += (c[i] == 0) ? 1 : 0;
        }   
        System.out.println(ans);
    }    
}