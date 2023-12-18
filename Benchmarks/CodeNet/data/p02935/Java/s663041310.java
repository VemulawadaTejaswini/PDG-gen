import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] v = new int[N];

        for(int i = 0; i < N; i++) {
            v[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(v);
        double ans = ((double)(v[0] + v[1]) / 2);
        
       
        for(int i = 2; i < N; i++) {
            ans = ((double)(ans + v[i]) / 2);
        }
        
        System.out.println(ans);
        
    }
}