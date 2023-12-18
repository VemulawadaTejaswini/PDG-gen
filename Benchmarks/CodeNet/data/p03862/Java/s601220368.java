import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long[] list = new long[n];
		for(int i=0;i<n;i++) {
			list[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i=0;i<n;i++) {
			if(list[i]>x) {
				ans += list[i]-x;
				list[i] = x;
			}
		}
	//	System.out.println(ans);
	//	System.out.println(Arrays.toString(list));
		for(int i=1;i<n;i++) {
			if(list[i-1]+list[i]>x) {
				ans += list[i-1]+list[i]-x;
				list[i] -= list[i-1]+list[i]-x;
			}
		}
		System.out.println(ans);
	//	System.out.println(Arrays.toString(list));
	}

}