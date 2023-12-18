
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int i = 1;
        while(true) {
            for (int j = 1; j <= i; j++) {
                for (int k = j; k <= i;k++) {
                    if (4 * i * j * k == N * (i * j + i * k+ k * j)) {
                        System.out.print(i + " " + j + " " + k);
                        return;
                    }
                }
            }
            i++;
        }

    }
}
