import java.util.Scanner;

public class Main {
    static boolean isPrimeNum(int x) {
        if (x == 2)
            return true;
        if (x < 2 || x % 2 == 0)
            return false;
        for (int n = 3; n <= Math.sqrt((double) x); n += 2)
            if (x % n == 0)
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        for (int n = X; n <= 100000; n++) {
            if (isPrimeNum(n)) {
                System.out.print(n);
                break;
            }
        }
    }
}