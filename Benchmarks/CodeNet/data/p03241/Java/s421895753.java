import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// <10^5
        int m = sc.nextInt();// <10^9
        
        int gcd = IntStream.iterate(m / n, i -> i - 1)
                        .filter(i -> m % i == 0)
                        .findFirst()
                        .orElse(1);
        System.out.println(gcd);
    }
}
