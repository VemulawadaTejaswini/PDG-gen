import java.util.Arrays;
import java.util.Scanner;

public class Multiply3Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean div2 = true;
        int cnt = 0;
        while (div2) {
            div2 = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && !div2) {
                    div2 = true;
                    arr[i] /= 2;
                } else {
                    arr[i] *= 3;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (div2)
                cnt += 1;
        }
        System.out.println(cnt);
    }
}
