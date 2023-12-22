import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//No Story
public class Main{
	
	long gcd(long a, long b){
		return b==0?a:gcd(b, a%b);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			long L = sc.nextLong();
			if(L==0)break;
			Set<Long> set = new HashSet<Long>();
			for(long i=1;i*i<=L;i++)if(L%i==0){
				set.add(i); set.add(L/i);
			}
			List<Long> l = new ArrayList<Long>();
			for(long x:set)l.add(x);
			Collections.sort(l);
			int res = 0;
//			System.out.println("S:" + l.size());
			for(int i=0;i<l.size();i++)for(int j=i;j<l.size();j++)if(L==l.get(i)/gcd(l.get(i), l.get(j))*l.get(j))res++;
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}