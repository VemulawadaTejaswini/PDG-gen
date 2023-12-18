import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = n / 11;
        long mod = n % 11;
        int plus = 0;
        if (mod > 0 && mod <= 6) {
            plus++;
        } else if (mod > 6) {
            plus+=2;
        }
        long res = count * 2 + plus;
        System.out.println(res);
    }
}
