import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String ans = "APPROVED";
        for (int i=0;i<N;i++) {
            int A_n = sc.nextInt();
            if (A_n % 2 == 0) {
                if (A_n % 3 != 0 && A_n % 5 != 0) {
                    ans = "DENIED";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
