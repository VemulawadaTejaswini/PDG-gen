import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(findXOR(a-1) ^ findXOR(b));
    }

    static long findXOR(long n) {
        long mod = n % 4;
        if (mod == 0) return n;
        else if (mod == 1) return 1;
        else if (mod == 2) return n + 1;
        else if (mod == 3)
            return 0;
        return 0;
    }
}