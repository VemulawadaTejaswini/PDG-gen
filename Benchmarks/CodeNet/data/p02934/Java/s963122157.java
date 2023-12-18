import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		
		double ans = 0;
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
			ans+=(1.0/a[i]);
		}
		
		System.out.format("%.10f",1.0/ans);
		
		
		
		
	}
}
