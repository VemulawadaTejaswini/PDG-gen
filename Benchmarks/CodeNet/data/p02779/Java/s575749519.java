import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n  =  Integer.parseInt(sc.next());
		int a[] =  new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		
		Arrays.sort(a);
		
		
		
		int tmp = a[0];
		String ans = "YES";
		for(int i = 1 ; i < n ; i++) {
			if(tmp == a[i]) {
				ans = "NO";
				break;
			}
			tmp = a[i];
		}
		
		
		
		System.out.println(ans);
	}




}

