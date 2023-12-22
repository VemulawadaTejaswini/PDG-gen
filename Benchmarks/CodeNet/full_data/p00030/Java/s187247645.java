import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            if (n == 0 && s == 0) break;
            int m = 0;
            for (int i = 0; i < Math.pow(2, 10); i++) {
                int sum = 0;
                int l = 0;
                for (int j = 0; j < 10; j++) {
                    if(((i >> j) & 1) == 1) {
                        sum += j;
                        l++;
                    }
                }
                if (sum == s && n == l) m++;
            }
            System.out.println(m);
        }
        scanner.close();
    }
}

