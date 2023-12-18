

import java.util.*;
import java.math.*;
import java.math.BigInteger;
class ppo implements Comparable<ppo>{
	int a,b;
	public ppo(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int compareTo(ppo other) {
		return this.a-other.a;
	}
}
public class Main {
	static final long mod = (int) (1e9 + 7);
	static final int inf = (int) (1e9);
	static final int maxn = (int) (1e5 + 10);

	static int n, m,c;
	static String s;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n=cin.nextInt();m=cin.nextInt();
		ppo arr[] =new ppo [maxn];
		for(int i=1;i<=n;i++) {
			arr[i]=new ppo(cin.nextInt(),cin.nextInt());
		}
		Arrays.sort(arr,1,n+1);
		int num=0;
		long ans=0;
		for(int i=1;i<=n;i++) {
			int ret=Math.min(m-num, arr[i].b);
			num+=ret;
			ans+=(long)ret*(long)arr[i].a;
		}
		System.out.println(ans);
	}
}