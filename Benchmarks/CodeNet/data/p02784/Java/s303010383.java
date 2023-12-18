import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int h = stdIn.nextInt(); //体力
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		long sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			sum += a[i];
		}
		
		if(sum < h) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		

	}

}
