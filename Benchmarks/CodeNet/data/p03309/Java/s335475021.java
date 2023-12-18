import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long b;
		long ans = 0;
		long ans2 = 0;
		int[] ary = new int[n];
		for(int i = 0; i< n; i++) {
			ary[i]  = scanner.nextInt();
		}
	    long tmp = 0;
		for(int k = 0;  k < n; k++) {
			tmp += ary[k]-k-1;
		}
		b = tmp / n;
		for(int r = 0; r < n; r++) {
			ans += Math.abs(ary[r]-(b+r+1));
		}
		if(b >= 0) {
			b++;
		}else {
			b--;
		}
		for(int r = 0; r < n; r++) {
			ans2 += Math.abs(ary[r]-(b+r+1));
		}
		if(b >= 0) {
			b -= 2;
		}else {
			b += 2;
		}
		long ans3 = 0;
		for(int r = 0; r < n; r++) {
			ans3 += Math.abs(ary[r]-(b+r+1));
		}
		
		System.out.println(Math.min(ans3,Math.min(ans, ans2)));
		
	}

}