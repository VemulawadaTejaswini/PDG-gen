import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // ユークリッドの互除法
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        int greatestCommonDivisor = b;
        Queue<Integer> divisor = new PriorityQueue<>(Comparator.naturalOrder());
        for (int i = 1; i < Math.sqrt(greatestCommonDivisor); i++) {
            if (greatestCommonDivisor % i == 0){
                divisor.add(i);
                divisor.add(greatestCommonDivisor / i);
            }
        }
        int count = 0;
        judge: while (!divisor.isEmpty()) {
            int target = divisor.poll();
            if (target > greatestCommonDivisor / 2) {
                break judge;
            }
            if (target <= 2) {
                count++;
                continue judge;
            }
            if (target % 2 == 0) {
                continue judge;
            }
            for (int i = 3; i <= target / i; i += 2) {
                if (target % i == 0) {
                    continue judge;
                }
            }

             count++;
        }
        System.out.println(count);
    }
}