import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] memo = new int[1000000];
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            memo[array[i] - 1]++;
        }
        Arrays.sort(array);
        long ans = 0;
        if (memo[array[0] - 1] == 1) {
            ans++;
        }
        ArrayList<Integer> min = new ArrayList<>();
        min.add(array[0]);
        parent : for (int i = 1; i < n; i++) {
            int v = array[i];
            if (memo[v - 1] > 1) {
                continue;
            }
            int m = v;
            for (int j = 2; j <= Math.sqrt(m); j++) {
                if (m % j == 0) { // 最小の因数を求める
                    while (m % j == 0) {
                        m /= j; // 最小の因数で割った数を代入する
                        if (min.contains(m)) {
                            min.add(array[i]);
                            continue parent;
                        }
                        if (min.contains(v / m)) {
                            min.add(array[i]);
                            continue parent;
                        }
                    }
                }
            }
            min.add(array[i]);
            ans++;
        }
        System.out.println(ans);
    }
}