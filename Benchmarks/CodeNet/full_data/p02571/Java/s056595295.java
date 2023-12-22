import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int length = t.length();

        for (int i = 0; i < t.length(); i++) {
            if (s.substring(0, s.length() - i).contains(t.substring(0, t.length() - i))) {
                length = i;
                break;
            }
        }
        System.out.println(length);
    }
}