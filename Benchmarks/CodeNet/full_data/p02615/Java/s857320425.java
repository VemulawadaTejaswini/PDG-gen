import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		long c = 0;
	//	ArrayList x = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a,Collections.reverseOrder());
//		x.add(a[0]);
		
		for(int i=0;i<n-1;i++) {
			c+=a[i];
		}
		System.out.println(c);
	}
}