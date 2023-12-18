import java.util.Scanner;

public class Main {

	public static void reverse(int b[], int p) {
		int n = (p + 1) / 2;
		for(int i = 0; i < n; ++i) {
			int tmp = b[i];
			b[i] = b[p - i];
			b[p - i] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a[];
		
		n = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		sc.close();
		
		int b[];
		b = new int[n];
		
		for(int i = 0; i < n; ++i) {
			b[i] = a[i];
			reverse(b, i);
		}
		
		for(int i : b)
		System.out.print(i + " ");
		System.out.println();
	}

}
