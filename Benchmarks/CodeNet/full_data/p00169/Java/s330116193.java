import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            String[] s = sc.nextLine().split(" ");
            if (s[0] == "0")
                break;
            int n = s.length;
            int[] l = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(l);
            int sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (l[i] > 10) {
                    sum += 10;
                } else if (l[i] == 1) {
                    if (i == 0 && sum <= 10) {
                        sum += 11;
                    } else {
                        sum += 1;
                    }
                } else {
                    sum += l[i];
                }
                if (sum > 21) {
                    sum = 0;
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
