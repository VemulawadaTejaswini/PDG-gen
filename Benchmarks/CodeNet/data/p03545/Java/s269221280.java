import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ops = s.length() - 1;
        boolean isOk = false;
        int ans = 0;
        for (int bit = 0; bit < (1 << ops); bit++) {
            int sum = Character.getNumericValue(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                int next = Character.getNumericValue(s.charAt(i));
                if ((bit & (1 << i)) != 0) sum += next;
                else sum -= next;
            }
            if (sum == 7) {
                ans = bit;
                break;
            }
        }
        System.out.print(s.charAt(0));
        for (int i = 0; i < ops; i++) {
            System.out.print((ans & (1 << i)) != 0 ? "+" : "-");
            System.out.print(s.charAt(i + 1));
        }
        System.out.println("=7");
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
