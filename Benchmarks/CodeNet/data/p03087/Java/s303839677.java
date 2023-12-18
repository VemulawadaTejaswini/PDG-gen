import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String[] moji = s.split("",0);
		int[] start = new int[q];
		int[] end = new int[q];
		
		for(int i = 0; i < q; i++) {
			int ans = 0;
			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
			for(int j = start[i]; j < end[i]; j++) {
				if(moji[j].equals("A") && moji[j+1].equals("C")) {
					ans ++;
				}
			}
			System.out.println(ans);
		}
	}
}

