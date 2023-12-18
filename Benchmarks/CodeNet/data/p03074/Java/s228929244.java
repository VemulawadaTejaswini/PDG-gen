
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String[] Num = s.split("");
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(Num[i]);
		}
		int ans = 0;
		int change = 2;
		for(int i = 1; i < n; i++) {
			if(num[i-1] == 1 && num[i] == 0) {
				change ++;
			}
		}
		int idx = 1;
		int[] tar = new int[change];
		tar[0] = 1;
		for(int i = 1; i < n; i++) {
			if(num[i-1] == 1 && num[i] == 0) {
				tar[idx] = i;
				idx ++;
			}
		}
		tar[change-1] = n;
		for(int i = 0; i < change-k; i++) {
			int tmp = tar[i+k] - tar[i] + 1;
			ans = Math.max(ans, tmp);
		}
		//System.out.println();
		System.out.println(ans);

		sc.close();
	}

}

