import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        if (a+b < 2*a-1) {
            if (2+a-1 < 2*b-1) {
                System.out.println(2*b-1);
            } else {
                System.out.println(2*a-1);
            }
        } else {
            if (a*b < 2*b-1) {
                System.out.println(2*b-1);
            } else {
                System.out.println(a+b);
            }
        }
    }

}
