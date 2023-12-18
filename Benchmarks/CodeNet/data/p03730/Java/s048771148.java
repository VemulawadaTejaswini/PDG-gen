import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a;

        boolean isYes = false;
        int mod = 0;
        while (mod <= c) {
            mod = result % b;
            if (mod == c) {
                isYes = true;
                break;
            }
            result += a;
        }

        if (isYes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}