import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int[] arr = new int[n + 1];
        Arrays.fill(arr, 0);
        for (int i = 0; i < n; ++i) {
            if (i + 1 < n && s.charAt(i) == 'A' && s.charAt(i+1) == 'C')
                arr[i + 1] = arr[i] + 1;
            else
                arr[i + 1] = arr[i];
        }

        for (int i = 0; i < q; ++i) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            System.out.println(arr[r] - arr[l]);
        }
    }
}