import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
			
		long sum = 0;
		
		for(int i = 1; i <= n; i++) 
			for(int j = 1; j <= n; j++)
				for(int k = 1; k <= n; k++)
					sum += gdc(i,j,k);
		
		System.out.println(sum);
	}
	
	public static int gdc(int a, int b) {
		if(a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if(a%b == 0) {
			return b;
		}else {
			return gdc(b,a%b);
		}
	}
	
	public static int gdc(int a, int b, int c) {
		return gdc(a,gdc(b,c));
	}
}