import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = reader.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int k = Integer.parseInt(inputs[1]);
		
		int[] weights = new int[n];
		int capacity = 0;
		for (int i = 0; i < n; i++) {
			int weight = Integer.parseInt(reader.readLine());
			weights[i] = weight;
			capacity += weight;
		}

		capacity /= k;
		
		while (true) {			
			boolean canAllocate = checkAllocation(weights, k, capacity);
			if (canAllocate) {
				break;
			}
			capacity++;			
		}		
		System.out.println(capacity);		
	}

	private static boolean checkAllocation(int[] weights, int k, int capacity) {
		
		int num = 1;
		int current = 0;
		
		for (int i = 0; i < weights.length; i++) {
			int weight = weights[i];
			if (current + weight > capacity) {
				current = weight;
				num++;
				if (num > k || current > capacity) {
					return false;
				}
			} else {
				current += weight;
			}
		}		
		return true;
	}
}
