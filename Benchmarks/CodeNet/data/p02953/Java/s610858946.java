import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        long[] arr = new long[n];
        arr[0] = sc.nextLong();
        int count = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextLong();
            long diff = arr[i] - arr[i-1];
            if (diff < -1 || diff == -1 && count == -1) {
                System.out.println("No");
                return;
            }
            else if (diff == -1) count = -1;
            else count = 0;
        }
        System.out.println("Yes");
    }
}