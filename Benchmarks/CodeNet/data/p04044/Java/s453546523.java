import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int n = sc.nextInt();
		int l =sc.nextInt();
		String[] strings =new String[n];
		for (int i=0;i<n;i++) {
			strings[i]=sc.next();
		}
		Arrays.sort(strings);
		for (int i=0;i<n;i++) {
			System.out.print(strings[i]);
		}
//------------------------------------------------------------
	}
}