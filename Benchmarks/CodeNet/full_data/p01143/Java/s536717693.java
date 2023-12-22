import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            double p = sc.nextDouble() * 0.01;
            if (n + m + p == 0) {
                break;
            }
            int sumMoney = 0;
            int electedNumberOfPeople = 0;
            for (int i = 0; i < n; i++) {
                int inputTmp = sc.nextInt();
                sumMoney += inputTmp * 100;
                if (m == i + 1) {
                    electedNumberOfPeople = inputTmp;
                }
            }
            int deductedMoney = sumMoney - (int) (sumMoney * p);
            if (0 < electedNumberOfPeople) {
                int ans = (int) Math.floor(deductedMoney
                        / (electedNumberOfPeople * 1.0));
                System.out.println(ans);
            } else {
                System.out.println("0");
            }
        }
    }

    public static void main(String[] args) {
new Main().run();
    }
}