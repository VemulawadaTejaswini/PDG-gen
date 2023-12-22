import java.util.Scanner;

public class Main {
    static final int CRITERIA = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = CRITERIA; i < max + 1; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        for (int i = CRITERIA; i < num; i++) { // ?´???°???????????????
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}