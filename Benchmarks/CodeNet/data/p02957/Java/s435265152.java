import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for (int k = 0; k <= 1000000000; k++) {
            if (Math.abs(A - k) == Math.abs(B - k)) {
                System.out.println(k);
                break;
            }
            if (A > B && k >= A) {
                System.out.println("IMPOSSIBLE");
                break;
            }
            if (B > A && k >= B) {
                System.out.println("IMPOSSIBLE");
                break;
            }
        }
        
    }
}
