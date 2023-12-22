import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = 0;
		int max = 0;
		int total = 0;
		
		try {
			int count = Integer.parseInt(br.readLine());
			
			if (0 < count && count <= 10000) {
				String[] strs = br.readLine().split("\\s+");
				int[] numbers = new int[count];	
				for (int i = 0; i < count; i++) {
					int n = Integer.parseInt(strs[i]);
					numbers[i] = (-1000000 <= n && n <= 1000000) ? n : 0;
				}
				
				min = getMin(numbers);
				max = getMax(numbers);
				total = getTotal(numbers);
				
				System.out.println(min + " " + max + " " + total);
			}
		} catch (Exception NumberFormatException) {
		}
	}
	
	public static int getMin(int[] numbers) {
		int min = numbers[0];
		for (int number : numbers) if (min > number) min = number;
		return min;
	}
	
	public static int getMax(int[] numbers) {
		int max = numbers[0];
		for (int number : numbers) if (max < number) max = number;
		return max;
	}
	
	public static int getTotal(int[] numbers) {
		int total = 0;
		for (int number : numbers) total += number;
		return total;
	}
}