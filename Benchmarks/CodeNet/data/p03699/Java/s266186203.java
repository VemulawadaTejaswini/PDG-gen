import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sn = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sn[i] = sc.nextInt();
            sum += sn[i];
        }

        // 貪欲したいので昇順ソート
        Arrays.sort(sn);

        for (int i = 0; i < n; i++) {
            if (sum % 10 != 0) {
                break;
            }
            sum -= sn[i];
        }

        System.out.println(sum);
    }
}

