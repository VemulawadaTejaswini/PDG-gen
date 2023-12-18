import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            arr[num - 1]++;
            num = sc.nextInt();
            arr[num - 1]++;
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}