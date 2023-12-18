import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		sc = null;
		if(n==2) {
			System.out.println(Math.max(a[0], a[1]));
		} else {
			int max = 1;
			int ret, pre;
			for(i=0; i < n; i++) {
				int min = 100000;
				pre = i==0?a[1]:a[0];
				for(j=0; j < n; j++) {
					if(i==j) continue;
					pre = gcd(pre, a[j]);
					if(pre < min)min=pre;
					if(pre==1)break;
				}
				if(pre>max)max=pre;
			}
			System.out.println(max);
		}
	}
	public static int gcd(int a, int b) {
		int t;
		while((t=a%b)!=0) {
			a = b;
			b = t;
		}
		return b;
	}
}
