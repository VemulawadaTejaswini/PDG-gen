import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Squid Multiplication
public class Main{

	long gcd(long a, long b){
		return b==0?a:gcd(b, a%b);
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			List<Long> even = new ArrayList<Long>(), odd = new ArrayList<Long>(), list = new ArrayList<Long>();
			for(int i=0;i<n*(n+1)/2;i++){
				long x = sc.nextLong();
				list.add(x);
				if(x%2==0)even.add(x);
				else odd.add(x);
			}
			Collections.sort(list);
			int NE = even.size(), NO = odd.size();
			boolean con = true;
			for(int i=0;i<NE&&con;i++)for(int j=i+1;j<NE&&con;j++)for(int k=0;k<NO&&con;k++){
				long bi = even.get(i), bj = even.get(j), bk = odd.get(k);
				long g = gcd(bi, bk);
				bi/=g; bk/=g;
				g = gcd(bj, bk);
				bj/=g; bk/=g;
				if(bk!=1)continue;
				long B = bi*bj;
				if(B<0)continue;
				long A = (long) Math.sqrt(B);
				List<Long> as = new ArrayList<Long>();
				as.add(A);
				boolean ok = true;
				for(long x:even){
					if(x%A!=0){
						ok = false; break;
					}
					long d = x/A;
					if(d%2==0){
						ok = false; break;
					}
					as.add(d);
				}
				if(!ok)continue;
				List<Long> b = new ArrayList<Long>();
				for(int x=0;x<as.size();x++)for(int y=x+1;y<as.size();y++)b.add(as.get(x)*as.get(y));
				Collections.sort(b);
				for(int x=0;x<b.size();x++){
					if(list.get(x)!=b.get(x)){
						ok = false; break;
					}
				}
				if(!ok)continue;
				con = false;
				System.out.println(as.get(0));
				for(int x=1;x<as.size();x++)System.out.print(as.get(x)+(x==as.size()-1?"\n":" "));
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}