import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] num = {0, 10, 100, 1000, 10000, 100000};
        int[] cnt = {0, 9, 10, 909, 910, 90909};

        int i = digitCnt(n);
        if (i % 2 == 0) {
            System.out.println(cnt[i-1]);
        } else {
            System.out.println(cnt[i-1] + n - num[i-1]);
        }
    }

    static int digitCnt(int n) {
        int cnt = 0;
        while (n >= 10) {
            n /= 10;
            cnt++;
        }

        return cnt+1;
    }
}