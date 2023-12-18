import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[]a = new int[n];
		int al=0, sw = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); 
		}
		Arrays.sort(a);
		for(int i = n-1; i >= 0; i--) {
			if(sw == 0) {
				al += a[i];
				sw = 1;
			} else {
				al -= a[i];
				sw = 0;
			}
		}
		System.out.println(al);
	}
}