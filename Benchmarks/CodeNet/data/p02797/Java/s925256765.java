
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		int cnt = 0;
		
		for(int i = 0 ; i < n ;i++) {
			if(i < k) {
				a[i] = s;
			}
			else {
				a[i] = s + 1;
			}
		}
		
		for(int i = 0 ; i < n ;i++) {
			System.out.println(a[i]);
		}

	}

}
