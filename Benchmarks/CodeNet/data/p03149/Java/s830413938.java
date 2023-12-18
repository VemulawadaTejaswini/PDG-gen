
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();
        String t = s + s2 + s3 + s4;
        if (t.contains("1") && t.contains("9") && t.contains("7") && t.contains("4")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println();
    }

}
