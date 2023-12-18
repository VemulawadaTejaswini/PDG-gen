import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        long sum = 0;
        for(int i = 1; i <= K; i++) {
            for(int j = 1; j <= K; j++) {
                for(int k = 1; k <= K; k++) {
                    int arr[] = {i, j, k};
                    sum += findGCD(arr, 3);
                }
            }
        }


        System.out.println(sum);
    }


    // Function to return gcd of a and b
    private int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    private int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }
}
