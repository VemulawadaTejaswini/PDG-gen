
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int input[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		
		int result = 0;
		boolean used[] = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(used[i]) {
				continue;
			}
			
			used[i] = true;
			int prev = input[i];
			for(int j = i + 1; j < n; j++) {
				if(!used[j] && input[j] > prev) {
					used[j] = true;
					prev = input[j];
				}
			}
			
//			System.out.println("i = "+i);
			result++;
		}
		
		System.out.println(result);
	}

}
