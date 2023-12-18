import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = n;
        for (int i = 1; i <= n; i++) {
            int six = i;
            int nine = n - i;
            int cnt = 0;
            int num = 6;
            while (true) {
                if (num * 6 > six) {
                    break;
                }
                num *= 6;
            }
            while (true) {
                cnt += six / num;
                six %= num;
                num = num / 6;
                if (num == 1) {
                    cnt += six;
                    break;
                }
            }
            num = 9;
            while (true) {
                if (num * 9 > nine) {
                    break;
                }
                num *= 9;
            }
            while (true) {
                cnt += nine / num;
                nine %= num;
                num = num / 9;
                if (num == 1) {
                    cnt += nine;
                    break;
                }
            }
            min = Math.min(cnt, min);

        }
        System.out.println(min);
        sc.close();
    }
}