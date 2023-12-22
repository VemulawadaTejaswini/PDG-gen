import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char c = s.charAt(s.length() - 1);
        String a = "s";
        if(c == 's') {
            a = "es";
        }

        System.out.println(s + a);
    }
}
