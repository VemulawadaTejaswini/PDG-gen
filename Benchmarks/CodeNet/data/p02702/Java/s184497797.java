import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 4; j <= s.length(); j++) {
                long a = Long.parseLong(s.substring(i, j));
                if (a % 2019 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
