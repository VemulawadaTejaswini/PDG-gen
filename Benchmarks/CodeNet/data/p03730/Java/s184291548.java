import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long result = a;

        boolean isYes = false;
        while (result <= 100) {
            if (result % b == c) {
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