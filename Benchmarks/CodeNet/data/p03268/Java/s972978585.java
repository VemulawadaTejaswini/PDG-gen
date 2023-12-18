
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        long count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % k == 0 && (i - j) % k == 0) {
                   // System.err.println(i+" "+j);
                    int up = n/k;
                    if(i % k != 0) {
                        up += ((k-i%k)+n%k)/k;
                    }
                    count += up;
                    //System.err.println(up);
                }
            }
        }
        System.out.println(count);
    }
}
