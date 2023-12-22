import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//No Story
public class Main{

	long gcd(long a, long b){
		if(b==0)return a;
		return gcd(b, a%b);
	}
	
	long pow(long a, long n){
		long res = 1;
		long x = a;
		while(n>0){
			if((n&1)>0)res *= x;
			x *= x;
			n = n>>1;
		}
		return res;
	}
	
	long d[];
	int divN;
	int[] num;
	Set<Long> set;
	
	void dfs(int k, long res){
		if(k==divN){
			set.add(res);return;
		}
		for(int i=0;i<=num[(int)d[k]];i++){
			dfs(k+1, res*pow(d[k], i));
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			long L = sc.nextLong();
			if(L==0)break;
			if(L==1){
				System.out.println(1);continue;
			}
			num = new int[1000001];
			long l = L;
			int div = 2;
			divN = 0;
			while(l>1){
				if(l%div==0){
					if(num[div]==0)divN++;
					l/=div;
					num[div]++;
				}
				else div++;
			}
			d = new long[divN];
			divN = 0;
			for(int i=2;i<=1000000;i++){
				if(num[i]>0)d[divN++] = i;
			}
			set = new HashSet<Long>();
			dfs(0, 1);
			int c = 0;
			for(long a:set){
				for(long b:set){
					long g = gcd(a, b);
					if(a<=b&&a/g*b==L){
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}