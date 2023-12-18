import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = -1;
        for (int i = 1; i <= N; i++) {
            if (Math.floor(i * 1.08) == N) {
                ans = i;
                break;
            }
        }
        
        System.out.println(ans == -1 ? ":(" : ans);
    }
}
