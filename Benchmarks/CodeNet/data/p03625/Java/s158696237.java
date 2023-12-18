import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        boolean first = false;
        boolean second = false;
        int firstNum = 0;
        int secondNum = 0;
        int tmp = a[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (tmp == a[i]) {
                count++;
                if (count % 2 == 1)
                    continue;
                if (!first && !second) {
                    firstNum = tmp;
                    first = true;
                } else if (first && !second) {
                    secondNum = tmp;
                    second = true;
                } else if (first && second) {
                    int x = secondNum;
                    secondNum = a[i];
                    firstNum = x;
                }
            } else {
                tmp = a[i];
                count = 1;
            }
        }
        int ans = firstNum * secondNum;
        System.out.println(ans);
    }
}