import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for(int i = k + 1; i < n + 1; i++) {
            for(int j = k; j < i; j++) {
                sum += (n - j) / i + 1;
            }
        }
        System.out.println(sum);
    }
}
