import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
			List<Long> l = new ArrayList<Long>();
			for(long i=1;i*i<=L;i++){
				if(L%i==0){
					l.add(i);
					if(i*i!=L)l.add(L/i);
				}
			}
			Collections.sort(l);
			int n = l.size(), res = 0;
			for(int i=0;i<n;i++){
				long a = l.get(i);
				for(int j=Math.max(i, Collections.binarySearch(l, L/a));j<n;j++){
					long b = l.get(j);
					if(L==a/gcd(a, b)*b)res++;
				}
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}