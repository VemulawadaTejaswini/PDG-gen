import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        String s = in.next();
        int[] digits = new int[n];
        for (int j = 0; j < n; j++) {
            digits[j] = s.charAt(j) - '0';
        }
        if (p == 2 || p == 5) {
            long answer = 0;
            for (int j = 0; j < n; j++) {
                if (digits[j] % p == 0) {
                    answer += j + 1;
                }
            }
            System.out.println(answer);
        } else {
            int[] freq = new int[p];
            freq[0] = 1;
            long answer = 0;
            int curr = 0;
            for (int j = n - 1; j >= 0; j--) {
                curr *= 10;
                curr += digits[j];
                curr %= p;
                answer += freq[curr];
                freq[curr]++;
                //System.out.println("j = " + j + ", curr = " + curr + ", freq = " + freq[curr]);
            }
            System.out.println(answer);
        }
    }
}
