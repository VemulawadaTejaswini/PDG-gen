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
		diff[0] = Math.abs(x - y[0]);
		for (int i = 1; i < n; i++)
			diff[i] = Math.abs(y[i] - y[i - 1]);
		int d = diff[0];
		int temp;
		for (int i = 1; i < n; i++){
			temp = gcd(d, diff[i]);
			if (temp < d)
				d = temp;
		}
		
		System.out.println(d);

	}
	
	public static int gcd(int n1, int n2){
		
		int t;
		
		while (n2 > 0){
			t = n1 % n2;
			n1 = n2;
			n2 = t;
		}
		
		return n1;
			
	}

}