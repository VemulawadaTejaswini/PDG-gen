import java.util.Scanner;

public class Main {

	static int prime[];
	
	public static int solve(int c[]) {
		int count = 0;
		int c2[];
		c2 = new int[4];
		int n = c.length;
		int d[] = {3, 5, 15, 25};
		
		
		for(int i = 0; i < n; ++i) {
			if(c[i] >= 75)++count;
			for(int j = 0; j < 4; ++j) {
				if(c[i] >= d[j]) c2[j]++;
			}
		}
		
		count += (c2[0] - 1) * c2[3];
		count += (c2[1] - 1) * c2[2];
		count += c2[1] * (c2[1] - 1) * (c2[0] - 2) / 2;
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		prime = new int[100];
		
		prime[0] = prime[1] = -1;
		prime[2] = 1;
		
		for(int i = 2; i < 100; ++i) {
			if(prime[i] != -1) {
				prime[i] = 1;
				for(int j = 2; i * j < 100; ++j) {
					prime[j * i] = -1;
				}
			}
		}
		
		int n;
		
		n = sc.nextInt();
		
		sc.close();
		
		int ans = 0;
		int count[];
		count = new int[n];
		
		for(int i = 2; i < n; ++i) {
			if(prime[i] == 1) {
				long tmp = i;
				int d = 1;
				while(tmp <= n) {
					count[i] += (n / tmp);
					++d;
					tmp = (long)Math.pow(i, d);
				}
				count[i]++;
			}
		}
		
		ans = solve(count);
		System.out.println(ans);
	}

}
