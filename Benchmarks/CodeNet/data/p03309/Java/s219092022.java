import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];
        long t = 0;
        for (int i = 0;i < a;++i){
            arr[i] = scanner.nextInt() - i;
            t += arr[i];
        }
        Arrays.sort(arr);
        int k = arr[(a - 1) / 2];
        long f = 0;
        for (int i = 0;i < a;++i){
            f += Math.abs(arr[i] - k);
        }
        System.out.println(f);
    }
}
