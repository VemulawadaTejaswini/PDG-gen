import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - Stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();

        int min = n;
        int[] countB = new int[n];
        int[] countW = new int[n];

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                countB[i] = countB[i - 1];
                if (c[i - 1] == '#') ++countB[i];
            } else {
                countB[i] = 0;
            }
        }

        for (int j = n - 1; j >= 0; j--) {
            if (j < n -1) {
                countW[j] = countW[j + 1];
            } else {
                countW[j] = 0;
            }
            if (c[j] == '.') ++countW[j];
            if (min > (countB[j] + countW[j])) min = countB[j] + countW[j];
        }

        System.out.println(min);
    }
}