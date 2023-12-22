import java.util.Arrays;
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = stdIn.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(a[9-i]);
		}
		
		
		
	
	}
}