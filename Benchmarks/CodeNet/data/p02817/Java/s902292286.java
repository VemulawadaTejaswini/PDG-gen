import java.util.*;

public class Main {
    public static void main(String[] args) {
        long a;
        long b;
        long k;
		Scanner sc = new Scanner(System.in);
        // 整数の入力
		a = sc.nextLong();
        b = sc.nextLong();
        k = sc.nextLong();
        if (a <= k) {
            long wka = a;
            a = 0;
            k = k - wka;
        }
        else {
            a = a - k;
            k = 0;
        }
        if (b <= k) {
            b = 0;
            k = k - b;
        }
        else {
            b = b - k;
            k = 0;
        }
        System.out.println(a + " " + b);
	}
}