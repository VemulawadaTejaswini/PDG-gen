
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        s = sc.next();
        int count = 0;
        char before = 0;
        for (int i = 0; i < s.length(); i++) {
            if (before == s.charAt(i)) {
                count++;
            } else {
                count = 1;
            }
            before = s.charAt(i);
        }
        System.out.println(count);
    }
}
