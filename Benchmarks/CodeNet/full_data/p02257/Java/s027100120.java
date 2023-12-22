import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(array).filter(Main::isPrime).count());
    }

    public static boolean isPrime(int x){
        if (x == 2) {
            return true;
        }
        if (x < 2 || x % 2 == 0) {
            return false;
        }
        int i = 3;
        while (i <= Math.sqrt(x)) {
            if (x % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }
}

