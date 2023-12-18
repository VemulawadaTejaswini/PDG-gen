import java.net.Inet4Address;
import java.util.*;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            AB[i][0] = sc.nextInt();
            AB[i][1] = sc.nextInt();
        }

        Arrays.sort(AB, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        long moneySum = 0; // answer
        int count = 0;

        for (int i = 0; i < N; i++) {
            int money = AB[i][0];
            int maxCount = AB[i][1];

            for (int j = 0; j < maxCount; j++) {
                moneySum += money;
                count++;
                if (count == M) {
                    System.out.print(moneySum);
                    return;
                }
            }
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
