import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int input[] = new int[n];
		int ball[] = new int[n];
		

		for(int i = 0; i < n; i++){
			input[i] = scan.nextInt()-1;
		}
		
		Arrays.fill(ball, 0);
		for(int i = 0; i < n; i++){
			ball[input[i]] ++;
		}
		
		long sum = 0;
		for(int i = 0; i < n; i++){
			int x = ball[i];
			sum += (x*(x-1))/2; 
		}

		for(int i = 0; i < n; i++){
			int j = input[i];
			int x = ball[j];
			int y = x - 1;
			System.out.println(sum - ((x*(x-1))/2) + ((y >= 0)?((y*(y-1))/2):0));
		}
	}
}