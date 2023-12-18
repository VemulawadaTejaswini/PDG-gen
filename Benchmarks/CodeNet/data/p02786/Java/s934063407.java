
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();
        long num = 0;
        long total = 0;
        while(H > 0) {
            H /= 2;
            total += (long)Math.pow((double)2, (double)num);
            num++;
        }

        System.out.println(total);

    }
}
