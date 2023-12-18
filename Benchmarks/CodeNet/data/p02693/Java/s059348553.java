import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean flg = false;

        for (int a = A; a<=B; a++) {
            if (a % K == 0) {
                flg = true;
            }
        }

        if (flg) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}