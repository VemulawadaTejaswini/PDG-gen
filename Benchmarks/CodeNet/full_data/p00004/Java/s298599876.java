import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static double x, y;
	static double a[] = new double[6];

	public static void main(String[] args) {
		
		while(read())
		{
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext()) return false;
		
		for(int i = 0; i < 6; i++)
		{
			a[i] = sc.nextDouble();
		}
		
		
		return true;
	}
	
	static void solve(){
		
		double don = (a[0] * a[4] - a[3] * a[1]);
		
		x = (a[2] * a[4] - a[1] * a[5]) / don;
		y = (a[0] * a[5] - a[3] * a[2]) / don;
			
		if(x == -0) x = 0;
		if(y == -0) y = 0;

		
		System.out.printf("%.3f %.3f", x, y);
	}

}