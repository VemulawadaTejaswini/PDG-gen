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
			
			if(y[i] < x[i] && x[i] < z[i]){
				swap = x[i];
				x[i] = y[i];
				y[i] = swap;
			}else if(x[i] < z[i] && z[i] < y[i]){
				swap = z[i];
				z[i] = y[i];
				y[i] = swap;				
			}else if(z[i] < x[i] && x[i] < y[i]){
				swap = x[i];
				x[i] = z[i];
				z[i] = y[i];
				y[i] = swap;
			}else if(z[i] < y[i] && y[i] < x[i]){
				swap = x[i];
				x[i] = z[i];
				z[i] = swap;				
			}else if(y[i] < z[i] && z[i] < x[i]){
				swap = y[i];
				y[i] = z[i];
				z[i] = x[i];
				x[i] = swap;
			}
		}
		
		for(int i = 0; i < n; i++){
			if(x[i]*x[i] + y[i]*y[i] == z[i]*z[i] || (x[i] <= 1 && y[i] <= 1 && z[i] <= 1)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}