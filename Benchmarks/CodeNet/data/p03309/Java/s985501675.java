import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int[] arr_a;

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        arr_a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int i = 0;
        for (int a : arr_a) {
            arr_a[i] = a - (i + 1);
            i++;
        }

        int sum = 0;
        for (int a : arr_a) {
            sum += a;
        }

        int b = Math.round(sum / arr_a.length);
        int bx;
        if (sum % b != 0 && sum % b > 0) bx = b + 1;
        else bx = b - 1;

        int ans = 0;
        for (int a : arr_a) {
            ans += Math.abs(a - b);
        }
        int ansx = 0;
        for (int a : arr_a) {
            ansx += Math.abs(a - bx);
        }

        if (ans > ansx) ans = ansx;
        System.out.println(ans);
    }
}