import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int m =  Integer.parseInt(sc.next());
		int a[] = new int[n];
		Long ans = 0l;
		
		for (int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		
		int cnt = 0;
		while(cnt < m) {
			a[a.length-1] /= 2; 
			cnt++;
			
			if(a[a.length-1]/2 < a[a.length -2]) {
				Arrays.sort(a);
			}
		}
		
		
		for(int value : a) {
			ans += value;
			
		}
		
		System.out.println(ans);
		
	}	
}