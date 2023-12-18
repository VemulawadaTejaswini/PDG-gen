import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] H = new int[n];
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        Arrays.setAll(H, i -> Integer.parseInt(sc.next()));
        for(int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next())-1, b = Integer.parseInt(sc.next())-1;
            if(arr[a] == 1 && H[a] <= H[b]) arr[a] = 0;
            if(arr[b] == 1 && H[b] <= H[a]) arr[b] = 0;
        }
        for(int a : arr) {
            res += a;
        }
        System.out.println(res);
    }
}
