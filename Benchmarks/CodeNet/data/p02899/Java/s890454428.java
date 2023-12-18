import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		int a[] = new int[n];
		int c = 0;
		
		for(int i = 0;i<n;i++) {
			h[i] = sc.nextInt();
			a[h[i]-1] = i+1;
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}


		sc.close();
	}
}

