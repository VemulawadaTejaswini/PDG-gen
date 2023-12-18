import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ab = new int[2];
		
		for(int i = 0; i < 2; i++) {
			ab[i] = sc.nextInt();
		}
		
		Arrays.sort(ab);
		
		int sum = 0;
		
		for(int i = 0; i < 2; i++) {
			sum+=ab[1];
			ab[1]--;
			Arrays.sort(ab);
		}
		
		System.out.println(sum);
	}
}
