
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var n1 = sc.nextInt();
        p(String.valueOf((int)Math.ceil(n1 / 1000.0) * 1000 - n1));
    }

    static void p(String s) { System.out.println(s); }
}
