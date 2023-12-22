import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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
	
	int divN;
	int[] num, d;
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
			SortedSet<Integer> ss = new TreeSet<Integer>();
			while(l>1){
				if(l%div==0){
					ss.add(div);
					l/=div;
					num[div]++;
				}
				else div++;
			}
			d = new int[ss.size()];
			divN = 0;
			for(int x:ss){
				d[divN++] = x;
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