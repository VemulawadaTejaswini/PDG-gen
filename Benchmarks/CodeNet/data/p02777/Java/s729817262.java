import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String u = scan.next();

        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }
        System.out.print(a);
        System.out.print(' ');
        System.out.println(b);
    }
}
