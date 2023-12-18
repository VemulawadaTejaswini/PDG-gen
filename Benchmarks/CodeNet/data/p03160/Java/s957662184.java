import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	int min;
	public int minJumps(int[] heights) {
		min = Integer.MAX_VALUE;
		dfs(heights, 0, 0);
		return min;
	}
	private void dfs(int[] heights, int position, int distanceSoFar) {
		int n = heights.length;
		if (position == n - 1) {
			min = Math.min(min, distanceSoFar);
			return;
		}
		if (position >= n) {
			return;
		}
		dfs(heights, position + 1, distanceSoFar + heights[position]);
dfs(heights, position + 2, distanceSoFar + heights[position]); 
	}


    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String heightsStr = br.readLine();
            String[] split = heightsStr.split(" ");
          	int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
              	heights[i] = Integer.parseInt(split[i]);
            }
          	Main app = new Main();
            int result = app.minJumps(heights);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
