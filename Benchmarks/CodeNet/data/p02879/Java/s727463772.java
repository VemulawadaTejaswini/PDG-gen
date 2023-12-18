import java.util.Scanner;
public class Coder144A {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int A = console.nextInt();
        int B = console.nextInt();
        if (A < 1 || A > 9 || B < 1 || B > 9) {
            System.out.println(-1);
        } else {
            System.out.println(A * B);
        }
    }
}