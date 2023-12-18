import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long v[];
	static int count[];

	public static long comb(int n, int r) {
		long ans = 1;
		for(int i = 1; i <= r; ++i) {
			ans *= n - i + 1;
			ans /= i;
		}
		return ans;
	}
	
	public static long count(int a) {
		long c = 0;
		int tmp = 0;
		int t = 0;
		int n = count.length;
		for(int i = 0; i < n; ++i) {
			tmp += count[i];
			if(tmp >= a){ 
				if(tmp == a)return 1;
				t = i;
				break;
			}
		}
		tmp -= count[t];
		tmp = a - tmp;
		c = comb(count[t], tmp);
		return c;
	}
	
	public static long sum(int a) {
		long sum = 0;
		int n = v.length;
		for (int i = n - 1; i >= n - a; --i) 
			sum += v[i];
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		v = new long[n];
		for (int i = 0; i < n; ++i)
			v[i] = sc.nextLong();
		sc.close();
		Arrays.sort(v);
		count = new int[n];
		int j = 0;
		count[j]++;
		for(int i = n - 2; i >= 0; --i) {
			if(v[i] != v[i + 1])count[++j]++;
			else count[j]++;
		}
		double ans = 0;
		long c = 0;
		long sum = 0;
		for (int i = a; i <= b; ++i) {
			sum = sum(i);
			double tmp  = (double)sum / (double)i;
			if(tmp > ans) {
				ans = tmp;
				c = count(i);
			}
			else if(tmp == ans){
				ans = tmp;
				c += count(i);
			}
		}
		System.out.println(ans);
		System.out.println(c);
	}

}
