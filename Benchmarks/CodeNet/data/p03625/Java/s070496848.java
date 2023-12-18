import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		long longest = 0;
		long longer = 0;
		int i = n-1;
		for(;i>=1;i--) {
			if(a[i]==a[i-1]) {
				longest = a[i];
				i -= 2;
				break;
			}
		}
		for(;i>=1;i--) {
			if(a[i]==a[i-1]) {
				longer = a[i];
				i--;
				break;
			}
		}
		System.out.println(longer*longest);
		in.close();
	}

}
