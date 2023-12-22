import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n= scanner.nextInt();
            if (n == 0)
                break;
            double sum = 0;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextInt();
                sum += s[i];
            }
            double m = sum / n;
            double aa = 0;
            for (int i = 0; i < n; i++) {
                aa += Math.pow(s[i] - m, 2) / n;
            }
            System.out.println(Math.sqrt(aa));

        }

    }
}

