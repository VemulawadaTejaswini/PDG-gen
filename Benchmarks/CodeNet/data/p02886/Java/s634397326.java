import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		int c = 0;
		
		for(int i = 0;i<n;i++) {
			d[i] = sc.nextInt();
		}
		
		for(int i = 0;i<n-1;i++) {

			c+= d[i]*d[i+1];

		}
		c+=d[0]*d[n-1];
		

		System.out.println(c);
 
		sc.close();
	}
}