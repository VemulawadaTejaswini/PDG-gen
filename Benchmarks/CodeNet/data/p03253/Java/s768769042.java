import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int mod = 1000000007;
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
	public static long comb(int p,int q,int mod) {
		if(p-q<q) q = p-q;
		long[] array = new long[q];
		for(int i=0;i<q;i++) {
			array[i] = p - i;
		}
		List<Integer> list = new ArrayList<>();
		for(int num=2;num<=q;num++) {
			int x = num;
			for(int i=2;i*i<=x;i++) {
				while(x%i==0) {
					x /= i;
					list.add(i);
				}
			}
			if(x>1) list.add(x);
		}
		
		for(int num : list) {
			for(int i=0;i<q;i++) {
				if(array[i]%num==0) {
					array[i] /= num;
					break;
				}
			}
		}
		
		long ans = array[0] % mod;
		for(int i=1;i<q;i++) {
			ans = (ans * (array[i] % mod))%mod;
		}
		return ans;	
	}

}
