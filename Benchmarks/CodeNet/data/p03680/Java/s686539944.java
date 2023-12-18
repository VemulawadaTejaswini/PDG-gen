import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        boolean isFinish = false;
        int result = 1;
        int initial = a[0];
        for (int i = 1; i < n; i++) {
            result++;
            if(a[initial -1] == 2) {
                isFinish = true;
                break;
            } else {
                initial = a[initial -1];
            }
        }

        if (isFinish) {
            System.out.println(result);
        } else {
            System.out.println(-1);

        }
    }
}