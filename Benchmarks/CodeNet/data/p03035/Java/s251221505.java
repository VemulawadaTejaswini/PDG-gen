import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (12 < A) {
            System.out.println(B);
        } else if (A < 6) {
            System.out.println(0);
        } else {
            System.out.println(B/2);
        }
    }

}