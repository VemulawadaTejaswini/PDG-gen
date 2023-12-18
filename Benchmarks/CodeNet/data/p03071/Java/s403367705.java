import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int A = Integer.parseInt(abt[0]);
        int B = Integer.parseInt(abt[1]);

        if (A - B > 1) {
            System.out.println(A + B + 1);
        } else {
            System.out.println(A + B);
        }
    }
}
