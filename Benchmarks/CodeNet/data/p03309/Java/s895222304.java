import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];
        double t = 0;
        for (int i = 0;i < a;++i){
            arr[i] = scanner.nextInt() - i;
            t += arr[i];
        }
        t /= a;
        int res1 = 0;
        int res2 = 0;
        int k1 = (int)t;
        int k2 = k1 > 0 ? k1 + 1 : k1 - 1;
        for (int i = 0;i < a;++i){
            res1 += Math.abs(k1 - arr[i]);
            res2 += Math.abs(k2 - arr[i]);
        }
        System.out.println(res1 > res2 ? res2 : res1);
    }
}
