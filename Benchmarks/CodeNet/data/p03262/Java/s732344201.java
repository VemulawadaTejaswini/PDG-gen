import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int[] y = new int[n];
		for (int i = 0; i < n; i++)
			y[i] = in.nextInt();
		
		int[] diff = new int[n];
		diff[0] = (int) Math.abs(x - y[0]);
		for (int i = 1; i < n; i++)
			diff[i] = (int) Math.abs(y[i] - y[i - 1]);
		int d = diff[0];
		int temp = 1;
		for (int i = 0; i < n - 1; i++){
			temp = gcd(diff[i], diff[i + 1]);
			if (temp < d)
				d = temp;
		}
		
		System.out.println(d);

	}
	
	public static int gcd(int n1, int n2){
		int k = 2;
		int result = 1;
		
		while (k <= n1 && k <= n2){
			if (n1 % k == 0 && n2 % k == 0)
				result = k;
			k++;
		}
		
		return result;
			
	}

}