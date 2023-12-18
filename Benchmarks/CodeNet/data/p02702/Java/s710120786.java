import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);
        String s = scanner.nextLine();
        long [] mod = new long[2019];
        mod[0]++;
        scanner.close();

        long pow = 1L;
        long target = 0L;
        for (int i = 0; i < s.length(); i++) {
            target = (target + (s.charAt(s.length() - 1 - i) - '0') * pow) % 2019;
            mod[(int)target]++;
            pow = 10 * pow;
        }
        long sum = 0;
        for (int i = 0; i < mod.length; i++) {
            long l = mod[i];
            sum += (l * (l-1)) / 2;
        }
        System.out.println(sum);
    }
}