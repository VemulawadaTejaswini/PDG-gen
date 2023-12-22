import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] inputs = new int[n];
		
		long sum = 0;
		for(int i=0; i<n; i++) {
			inputs[i] = sc.nextInt();
			sum += inputs[i];
		}
		sc.close();
		
		Arrays.sort(inputs);
		
		System.out.printf("%d %d %d", inputs[0], inputs[n-1], sum);
		System.out.println();
	}

}