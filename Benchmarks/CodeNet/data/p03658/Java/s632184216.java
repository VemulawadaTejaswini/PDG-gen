import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n + 1];
		for(int i = 1; i <= n; i++) l[i] = sc.nextInt();
		int[] cnt = new int[51];
		for(int i = 1; i <= n; i++) cnt[l[i]]++;
		int sum = 0;
		int cntIdx = 0;
		out : for(int i = 50; i > 0; i--) {
			for(int j = 0; j < cnt[i]; j++) {
				sum += i;
				cntIdx++;
				if(cntIdx == k)break out;
			}
		}
		System.out.println(sum);
	}
}