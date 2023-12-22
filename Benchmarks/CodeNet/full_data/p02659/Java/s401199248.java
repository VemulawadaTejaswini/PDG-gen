import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = (long)(Double.parseDouble(sc.next()) * 100);
        System.out.println((long)(a*b/100));
    }
}
