import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] h = new int[N+K+1];
        for(int i=1;i<=N;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int[] ans = new int[N+K+1];
        for(int i=1;i<=N;i++){
            for(int j=i+1;j<=K+i;j++){
                if(ans[j] > 0)
                    ans[j] = Math.min(ans[j], ans[i] + Math.abs(h[i]-h[j]));
                else 
                    ans[j] = ans[i] + Math.abs(h[i]-h[j]);
            }
        }
        System.out.println(ans[N]);
    }
}