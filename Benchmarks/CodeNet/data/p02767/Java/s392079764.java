import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		
		
		int ave = 0;
		for(int i = 0; i < n; i++) {
			x[i] = stdIn.nextInt();
			ave += x[i];
		}
		
		ave = (ave + (n-1))/n;
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += (x[i]-(ave))*(x[i]-(ave));
		}
		System.out.println(sum);
		
	}

}
