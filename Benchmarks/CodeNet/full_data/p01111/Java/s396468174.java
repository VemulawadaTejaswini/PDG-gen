import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Integer sum = Integer.parseInt(sc.nextLine());
            if (sum == 0) {
                break;
            }
            int max = 0;
            int x = 0;
            for (int i = 1; i < sum; i++) {
                Integer sumi = i * (i + 1) / 2;
                if (sumi > sum) {
                    break;
                }
                if ((sum - sumi) % i == 0) {
                    max = i;
                    x = (sum - sumi) / i;
                }
            }
            String output = String.format("%d %d", x + 1, max);
            System.out.println(output);
        }
    }
}
