import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		int ans = 0;
		for(int i = 0;i < n;i++) {
			d[i] = sc.nextInt();
			if(i != 0) {
				for(int k = 0;k < i;k++) {
					ans += d[i] * d[k];
				}
			}
		}
		System.out.println(ans);

	}

}