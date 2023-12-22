import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        long i = 0;
        for (i = 1;; i++) {
            if (C - B * i <= 0 || A - D * 1 <= 0)
                break;
        }

        if (C - B * i <= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}