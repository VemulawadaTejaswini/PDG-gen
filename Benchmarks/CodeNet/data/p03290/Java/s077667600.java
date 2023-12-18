import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();

        int[] cs = new int[D]; // 全部解いた時
        int[] ps = new int[D]; // 一門あたり

        for (int d = 0; d < D; d++) {
            ps[d] = scanner.nextInt();
            cs[d] = scanner.nextInt();
        }

        int sum = 0;
        int prob_count = 0;

        for (int d = D - 1; d >= 0; d--) {
            int temp = 1;

            while (sum < G) {

                int point = (d + 1) * 100;
                prob_count += 1;
                if (temp == ps[d]) {
                    point += cs[d];
                }
                sum += point;
                if (temp == ps[d]) {
                    break;
                }
                temp++;
            }
            if (sum >= G) {
                System.out.println(prob_count);
                return;
            }
        }
    }
}