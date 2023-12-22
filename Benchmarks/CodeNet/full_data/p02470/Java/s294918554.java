import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<Integer> unko=new ArrayList<Integer>();
		fra(N,unko);
		HashSet<Integer> buri=new HashSet<Integer>();
		for(int i=0; i<unko.size(); i++) {
			int a=unko.get(i);
			if(a!=1) {
				buri.add(a);
			}
		}
		long aa=N;
		Iterator<Integer> bubu = buri.iterator();
		for(int i=0; i<buri.size(); i++) {
			long tmp=(long) bubu.next();
			aa=aa*(tmp-1)/tmp;
		}
		System.out.println(aa);
	}
	public static void fra(int a,List<Integer> p) {//int型用
		for(int i=2; i*i<=a; i++) {
			if(a%i==0) {
				p.add(i);
				fra(a/i,p);
				return;
			}
		}
		p.add(a);
	}

	public static void fra(long a,List<Long> p) {//long型用
		for(long i=2; i*i<=a; i++) {
			if(a%i==0) {
				p.add(i);
				fra(a/i,p);
				return;
			}
		}
		p.add(a);
	}
}
