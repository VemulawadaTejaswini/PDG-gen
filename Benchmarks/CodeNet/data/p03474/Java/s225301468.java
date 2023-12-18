import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        if (s.length() != a + b + 1){
            System.out.println("No");
        }

        String s1 = s.substring(0, a);
        char s2 = s.charAt(a);
        String s3 = s.substring(a+1);

        if (!s1.matches("[0-9]*")) {
            System.out.println("No");
            return;
        }
        if (s2 != '-') {
            System.out.println("No");
            return;
        }

        if (s3.matches("[0-9]*")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}