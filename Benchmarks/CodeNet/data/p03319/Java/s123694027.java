import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		//System.out.println((n-2)/(k-1)+1);
		//System.out.println((n-k+1)/(k-1)+1);
		System.out.println((n+k-3)/k-1);
		
		
	}

}
