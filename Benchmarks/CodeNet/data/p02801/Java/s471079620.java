import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int k = scan.nextInt(); 
		int m = scan.nextInt(); 
		
		int[]a = new int[n-1];
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}
		if(n*m-sum<=0) {
			System.out.println(0);
		}
		
		if(n*m-sum <= k) {
			System.out.println(n*m-sum);
		}else {
			System.out.println(-1);
		}
		
		
		
	}
 
}

