import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int input[] = new int[n];
		int ball[] = new int[200001];
		

		for(int i = 0; i < n; i++){
			input[i] = scan.nextInt()-1;
		}
		
		Arrays.fill(ball, 0);
		for(int i = 0; i < n; i++){
			ball[input[i]] ++;
		}
		
		long sum = 0;
		
		for(int i = 0; i < 200001; i++){
			int x = ball[i];
			sum += (x*(x-1))/2; 
		}

		for(int i = 0; i < n; i++){
			int x = input[i];
			int y = ball[x];
			int z = Math.max(y - 1, 0);
			System.out.println(sum - ((y * (y - 1))/2) + ((z * (z - 1))/2));
		}
	}
}