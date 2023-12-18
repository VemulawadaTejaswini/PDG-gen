import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), k = sc.nextLong();
        long res = Math.min(a, k);
        res = k - res - b <= 0 ? res :res  -(k - res - b);
        System.out.println(res);
    }
}
