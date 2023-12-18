import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        String str = "";

        while (true) {
            str = str + s.charAt(0);
            if (s.length() > 2) {
                s = s.substring(2);
            } else {
                break;
            }
        }

        System.out.println(str);

    }
}