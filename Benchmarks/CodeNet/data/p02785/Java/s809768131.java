import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		long t = 0;
		int x=n;
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);

		if(n>=k) {
		for(int i =0;i<n-k;i++) {
			t+=a[i];
		}}


		
		
		
		
			System.out.println(t);

 
		sc.close();
	}
}