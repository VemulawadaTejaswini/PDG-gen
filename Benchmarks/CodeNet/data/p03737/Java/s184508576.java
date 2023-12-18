import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String A = a.toUpperCase();
        String B = b.toUpperCase();
        String C = c.toUpperCase();
        System.out.println(A);
        System.out.print(A.charAt(0));
        System.out.print(B.charAt(0));
        System.out.println(C.charAt(0));
    }
}