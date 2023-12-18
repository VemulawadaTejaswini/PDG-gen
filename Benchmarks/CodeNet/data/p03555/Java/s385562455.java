import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s[] = new String[2];
        Scanner sc = new Scanner(System.in);
        s[0] = sc.next();
        s[1] = sc.next();
        if (s[0].charAt(0) != s[1].charAt(2))
            sayNo();
        else if (s[0].charAt(1) != s[1].charAt(1))
            sayNo();
        else if (s[0].charAt(2) != s[1].charAt(0))
            sayNo();
        else
            System.out.println("YES");

    }

    static void sayNo() {
        System.out.println("NO");
    }

}