import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		String[] a = new String[x];
		String[] b = new String[y];
		String[] c = new String[z];

		long[] ans = new long[x*y*z];
		
		int k = sc.nextInt();
		
		sc.nextLine();
		a = (sc.nextLine().split(" "));
		b = (sc.nextLine().split(" "));
		c = (sc.nextLine().split(" "));
		
		sc.close();
		int i=0;
		
		for(String s:a) {
			for(String t:b) {
				for(String r:c) {
					ans[i++] = Long.parseLong(s)+Long.parseLong(t)+Long.parseLong(r);
				}
			}
		}
		
		Arrays.sort(ans);
		
		for(int j=ans.length-1;j>=ans.length-k;j--) {
			System.out.println(ans[j]);
		}
	}

}
