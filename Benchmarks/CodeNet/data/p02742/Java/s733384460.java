import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long ans = 0;
        for (int i = 0; i < W; i++) {
            // 奇数列
            if (i%2 == 0) {
                if (H%2 == 0) {
                    ans += (H/2);
                } else {
                    ans += (H/2)+1;
                }
                // 偶数列
            } else {
                if (H%2 == 0) {
                    ans += (H/2)+1;
                } else {
                    ans += (H/2);
                }
            }
        }
        System.out.println(ans);
    }
}