import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int a = in.nextInt();
        int b = in.nextInt();
        String u = in.next();
        if(u.equals(s)) {
            a--;
        }
        else {
            b--;
        }
        System.out.print(a);
        System.out.print(' ');
        System.out.println(b);
    }
}
