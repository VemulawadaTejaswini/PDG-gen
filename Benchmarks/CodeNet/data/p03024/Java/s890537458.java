import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'x') {
                cnt++;
            }
        }
        if (cnt <= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
