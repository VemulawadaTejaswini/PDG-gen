import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int k =  Integer.parseInt(sc.next());
		int q =  Integer.parseInt(sc.next());
		int num[] = new int[n];
		for (int i = 0 ; i < n ; i++) {
			num[i] = k - q ;
		}
		
		for (int i = 0 ; i < q ; i++) {
			num[Integer.parseInt(sc.next())-1] += 1 ;
		}
		
		for (int i = 0 ; i < n ; i++) {
			if(Math.signum(num[i]) == 1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
		
	}	
}