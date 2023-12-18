import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] stores = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                stores[i][j] = Integer.parseInt(sc.next());
            }
        }
        Arrays.sort(stores, (a, b) -> Integer.compare(a[0], b[0]));
        long sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i][1]; j++) {
                sum += stores[i][0];
                cnt++;
                if (cnt == m) break;
            }
        }
        
        System.out.println(sum);
    }
}
