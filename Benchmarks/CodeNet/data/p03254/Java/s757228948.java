import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                count++;
                x -= arr[i];
            }
        }
        if (count == n && x != 0) {
            count--;
        }
       System.out.println(count);
    }
}
