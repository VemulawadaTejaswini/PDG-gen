import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for (int i = 1; i*i < N; i++) {
            int a = ((N-i*i-i+(i-1))/i)*2+1;
            if (0 < a) {
                ans += a;
            } else {
                ans++;
            }               
        }
        System.out.println(ans);
    }
}