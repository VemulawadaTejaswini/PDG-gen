
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// The first input line gives us the size of our graph
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		// Initialize our matrix
		int[][] weights = new int[n][n];
		for (int i = 0; i < n; i++) {
			
			String[] row = in.nextLine().split(" ");
			// Now that we have the row, we will initialize said row in the matrix
			// For some reason, aizu includes a space before the line (strange), so the index of row for column j will be j+1
			for (int j = 0; j < n; j++) {
				weights[i][j] = Integer.parseInt(row[j+1]);
			}
		}
		Main test = new Main();
		System.out.println(test.MSTbuilder(weights, n));
		
	}
	
	public int MSTbuilder(int[][] weights, int size) {
		int weight = 0;
		boolean[] mstSet = new boolean[size];
		int max = Integer.MAX_VALUE;
		int[] keyVals = new int[size];
		// First vertex gets picked first
		keyVals[0] = 0;
		for (int i = 1; i < size; i++) {
			keyVals[i] = max;
			mstSet[i] = false;
		}
		for (int i = 0; i < size; i++) {
			int u = getMin(keyVals, mstSet);
			mstSet[u] = true;
			for (int j = 0; j < size; j++) {
				// If the value in the weights is -1, then the vertices are not connected
				if (weights[u][j] == -1) {}
				// if we've already seen this vertex, skip over it
				else if (mstSet[j]) {}
				else {
					keyVals[j] = Math.min(keyVals[j], weights[u][j]);
				}
			}
		}
		for (int i : keyVals) {
			weight += i;
		}
		return weight;
	}
	
	// Returns the index of the value with the smallest number in an array that has not already been visited
	public int getMin(int[] nums, boolean[] visited) {
		int minVal = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < minVal && !visited[i]) {
				minIndex = i;
				minVal = nums[i];
			}
		}
		return minIndex;
	}
}

