import java.util.Scanner;

public class Frog1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
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
			int min1 = minAtN[i - 1] + Math.abs(heights[i] - heights[i - 1]);
			int min2 = minAtN[i - 2] + Math.abs(heights[i] - heights[i - 2]);
			minAtN[i] = Math.min(min1, min2);
		}
		
		System.out.println(minAtN[n-1]);
		
	}
}
