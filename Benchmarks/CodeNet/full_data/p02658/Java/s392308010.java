import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 1;
        long max = 1000000000000000000L;
        for (int i = 0 ; i < N ; i++) {
            long a = scanner.nextLong();
            if (a == 0) {
                result = 0;
                break;
            }
            if (result != -1 && max / result >= a) {
                result *= a;
            } else {
                result = -1;
            }
        }
        
        System.out.println(result);
    }
}
