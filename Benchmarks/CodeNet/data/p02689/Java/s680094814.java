import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++){
            h[i] = input.nextInt();
        }
        int[] t = new int[n];
        for (int i = 0; i < m; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            t[a-1] = Math.max(t[a-1],h[b-1]);
            t[b-1] = Math.max(t[b-1],h[a-1]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (h[i] > t[i]){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}