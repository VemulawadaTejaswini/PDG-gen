import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] N = sc.next().toCharArray();
		long ans = 0;
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				ans += count(i, j, N)*count(j, i, N);
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
	static long count(int a, int b, char[] N) {
		long ans = 0;
		if((a==b)&&(N.length>1 || N[N.length-1]-'0'>=a))
			ans++;
		for(int i=0; i<=N.length-2; i++) {
			if(N.length > i+2) {
				int temp = 1;
				for(int j=0; j<i; j++)
					temp *= 10;
				ans += temp;
			} else if(N.length == i+2) {
				if(N[0]-'0' > a) {
					int temp = 1;
					for(int j=0; j<i; j++)
						temp *= 10;
					ans += temp;
				} else if(N[0]-'0'== a) {
					String num = String.valueOf(N);
					num = num.substring(1, num.length()-1);
					if(num.length()==0)
						num = "0";
					int add = Integer.valueOf(num);
					if(N[N.length-1]-'0'>=b)
						add++;
					ans += add;
				}
			}
		}
		return ans;
	}
}