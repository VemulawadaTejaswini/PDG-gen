
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r = 0;
        if (Long.parseLong(s) >= 2019L) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 4; j <= s.length(); j++) {
                    long num = Long.parseLong(s.substring(i, j));
                    if (num % 2019L == 0)
                        r++;
                }
            }
        }
        System.out.println(r);
    }
}