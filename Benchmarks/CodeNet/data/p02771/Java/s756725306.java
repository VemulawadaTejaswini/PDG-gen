import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B) {
            if (B != C) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        } else {

        }

        if (B == C) {
            if (C != A) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        } else {

        }

        if (C == A) {
            if (A != B) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        } else {

        }
    }
}