import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int ans = 0;
        for (int i = 0; i < 2; i++) {
            if ( A > B ) {
                ans += A;
                A--;
            } else {
                ans += B;
                B--;
            }
        }
        
        System.out.println(ans);
    }
}
