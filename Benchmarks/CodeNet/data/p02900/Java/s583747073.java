import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            int result = getSqrtCount(getGcd(a, b));
            System.out.println(result + 1);
        }
    }

    public static long getGcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }

    public static int getSqrtCount(double n) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 2; i < Math.sqrt((double) n) + 2; i++) {
            while (n % i == 0) {
                n /= i;
                list.add(i);
            }
        }
        if (n > 1) {
            list.add((int)n);
        }
        return list.size();
    }
}