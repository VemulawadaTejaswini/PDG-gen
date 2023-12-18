import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(0, s.length() - 1);
            if (s.length() % 2 != 0) {
                continue;
            }
            String former = s.substring(0, s.length() / 2);
            String latter = s.substring(s.length() / 2);
            if (former.equals(latter)) {
                break;
            }
        }
        System.out.println(s.length());
    }

}
