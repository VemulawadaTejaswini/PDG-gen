
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		long biscket=1;
		
		if(a > b - 2) {
			System.out.println(k+1);
			return;
		}
		
		if(k < a) {
			System.out.println(k+1);
			return;
		}
		
		biscket += a-1;
		k -= a-1;
		
		if(k%2 == 1) {
			biscket++;
			k--;
		}
		for(int i=0;i<k;i=i+2) {
			biscket = biscket - a + b;
		}

		System.out.println(biscket);
	}

}
