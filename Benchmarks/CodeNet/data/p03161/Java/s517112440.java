import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());


        // twist: not just two stones ahead, K stones ahead

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] h = new int[n]; // nums
        st = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }

        int[] min_cost = new int[n];

        min_cost[0] = 0;

        for (int i = 1; i < min_cost.length; i++) {

            int j = Math.max(i - k, 0);

            int curMinCost = Integer.MAX_VALUE;
            for (; j < i; j++) {
                int _curMinCost = min_cost[j] + Math.abs(h[j] - h[i]);
                if (curMinCost > _curMinCost){
                    curMinCost = _curMinCost;
                }
            }
            min_cost[i] = curMinCost;
        }

        /* for (int i : min_cost) {
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println(); */
        System.out.println(min_cost[min_cost.length - 1]);

    }
}
