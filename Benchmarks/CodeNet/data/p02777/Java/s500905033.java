import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String u = sc.next();

        a = u.equals(s) ? a - 1 : a;
        b = u.equals(t) ? b - 1 : b;

        System.out.println(a + " " + b);

        sc.close();
    }
}
