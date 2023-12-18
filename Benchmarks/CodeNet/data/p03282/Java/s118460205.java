import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int i = 0;
        while (i <= k) {
            try {
                if (s.charAt(i) != '1') {
                    System.out.println(s.charAt(i));
                    System.exit(0);
                } else
                    i++;
            } catch (Exception e) {
                System.out.println(1);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}
