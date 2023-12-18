//import java.util.Arrays;
//import java.util.Map;
import java.util.Scanner;
//import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String[] moji = s.split("",0);
		int[] jac = new int[n];
		for(int i = 0; i < n-1; i++) {
			if(moji[i].equals("A") && moji[i+1].equals("C")) {
				jac[i]  = 1;
			}
		}
		for(int i = 0; i < q; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			int ans = 0;
			for(int j = start; j < end; j++) {
				ans += jac[j];
			}
			System.out.println(ans);
		}
		sc.close();
	}
}

