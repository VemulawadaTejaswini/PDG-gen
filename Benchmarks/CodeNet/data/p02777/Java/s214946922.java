import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
 
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(a[i]==a[j]) {
					System.out.println("NO");
					return ;
				}
			}
		}
 
		System.out.println("YES");
 
	}
 
}