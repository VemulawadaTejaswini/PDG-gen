import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		in.close();
		long mod = 1000000007;
		List<Integer> list = new ArrayList<>();
		for(int i=2;i*i<=m;i++) {
			int count = 0;
			while(m%i==0) {
				m /= i;
				count++;
			}
			if(count!=0) {
				list.add(count);
			}
		}
		if(m>1) list.add(1);
		long ans = 1;
		for(int q : list) {
			ans = (ans * comb(n+q-1,q,mod)) % mod;
		}
		System.out.println(ans);
		

	}
	
	//return pCq % r
	public static long comb(long p,long q,long r) {
		long[] array = new long[(int) q];
		for(int i=0;i<q;i++) {
			array[i] = p - i;
		}
		for(int num=1;num<=q;num++) {
			for(int i=(int) (q-1);i>=0;i--) {
				if(array[i]%num==0) {
					array[i] /= num;
					break;
				}
			}
		}
		long ans = array[0] % r;
		for(int i=1;i<q;i++) {
			ans = (ans * (array[i] % r))%r;
		}
		return ans;	
	}

}
