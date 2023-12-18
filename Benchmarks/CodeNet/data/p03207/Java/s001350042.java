import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sum += p;
            if (p > max) {
                max = p;
            }
        }
        sum -= max / 2;
        System.out.println(sum);
    }
}
