import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ", 2);
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];
        String[] line = scanner.nextLine().split(" ", n);
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(arr);
        int sum = 0;
        for (int i = n - 1; i >= k - 1; i--) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
