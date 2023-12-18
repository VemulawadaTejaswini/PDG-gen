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

        Arrays.sort(arr_a);
        int med;
        if (arr_a.length % 2 == 0) {
            int medIndex = arr_a.length / 2;
            med = (arr_a[medIndex - 1] + arr_a[medIndex]) / 2;
        } else {
            med = arr_a[arr_a.length / 2];
        }

        double sum = 0;
        for (double a : arr_a) {
            sum += Math.abs(a - med);
        }

        System.out.println(sum);
    }
}