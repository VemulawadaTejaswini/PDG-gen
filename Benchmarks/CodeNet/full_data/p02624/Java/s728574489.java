
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                arr[j]++;
            }
        }

        long sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += 1L * i * (long)arr[i];
        }

        System.out.println(sum);
    }
}
