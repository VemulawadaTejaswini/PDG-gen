import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[3];			
		
		for (int i = 0; i < 3; i++) {
			N[i] = sc.nextInt();
		}
		
		Arrays.sort(N);
		
		System.out.println(10 * N[2] + N[1] + N[0]);
	}
}
