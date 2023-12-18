import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		s.nextLine();
		
		int[] heights = new int[n];
				
		for(int i = 0; i < n; i++) {
			heights[i] = s.nextInt();
		}
		
		int[] minAtN = new int[n];
		
		minAtN[0] = 0;
		
		if(minAtN.length > 1) {
			minAtN[1] = Math.abs(heights[1] - heights[0]);
		}
		
		for(int i = 2; i < n; i++) {
			
			// find minimum

			int min = minAtN[i - 1] + Math.abs(heights[i - 1] - heights[i]);
			
			int j = i - k >= 0 ? i - k : 0;
			for(; j < i - 1; j++) {
				min = Math.min(min, minAtN[j] + Math.abs(heights[j] - heights[i]));
			}
			
			minAtN[i] = min;
		}
		
		System.out.println(minAtN[n-1]);
		
	}
}
