import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 1, tmp;
		if(n < 105) {
			System.out.println(0);
			return;
		}
		for(int m = 107; m <= n; m+=2) {
			tmp = 1;
			for(int k = 3; k <= m; k+=2) {
				if(m % k == 0)tmp++;
			}
			if(tmp == 8)cnt++;
		}
		System.out.println(cnt);
	}
}
