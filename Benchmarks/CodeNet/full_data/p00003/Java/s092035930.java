import java.util.Scanner;

class Main {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);

		int[] x, y, z;
		int swap;
		
		int n = scan.nextInt();
		x = new int[n];
		y = new int[n];
		z = new int[n];
		
		for(int i = 0; i < n; i++){
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			z[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			if(x[i]*x[i] + y[i]*y[i] == z[i]*z[i] ||
			   x[i]*x[i] + z[i]*z[i] == y[i]*y[i] ||
			   z[i]*z[i] + y[i]*y[i] == x[i]*x[i]) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}