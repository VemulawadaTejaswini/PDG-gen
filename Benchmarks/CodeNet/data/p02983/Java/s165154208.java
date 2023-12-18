import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		for(int i=l;i<=r;i++) {
			if(i%2019 < min) {
				min=i%2019;
			}else if(i%2019 <min2) {
				min2=i%2019;
			}
		}
		System.out.println(min*min2);
	}
	
	static long factr(long n,long p,long q) {
		if(n==p) {
			return 1l;
		}
		long ma = Math.max(p, q);
		long mi = Math.min(p, q);
		ArrayList<Long> mm = new ArrayList<Long>();
		for(int i=1;i<=mi;i++) {
			mm.add((long) i);
		}
		long ret = fact(n,ma,mm);
		return ret;
	}
	static long fact(long n,long m,ArrayList<Long> mm) {
		if(n==m) {
			return 1l;
		}
		long pre = fact(n-1,m,mm);
		for(int i=0;i<mm.size();i++) {
			if(pre%mm.get(i) ==0) {
				pre = pre/mm.get(i);
				mm.set(i, 1l);
			}
		}
		return (n*pre);
	}
}