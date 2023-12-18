import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int []a = new int[n];
		
		int t = 0;
		
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
			
		} 
		
		int p = n -1 ;
		int q = k -1 ;
		
		System.out.println((int)Math.ceil((double)p/q));
				

	}

}
