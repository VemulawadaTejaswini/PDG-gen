import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int[] b = a.clone();
		
		Arrays.sort(b);
		
		for(int i = 0; i < n; i++) {
			if(a[i] == b[n-1]) {
				System.out.println(b[n-2]);
			}else {
				System.out.println(b[n-1]);
			}
		}
		
		
	}

}
