import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FrogJump {
    public static int cost(int[] heights){
        int[] cost = new int[heights.length];
        cost[0] = 0;
        cost[1] = Math.abs(heights[1] - heights[0]);
        for (int i = 2; i < heights.length; i++) {
            cost[i] = Math.min(cost[i-1] + Math.abs(heights[i] - heights[i-1]),
                    cost[i-2] + Math.abs(heights[i] - heights[i-2]));
        }
        return cost[heights.length - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] h = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(cost(h));
    }
}
