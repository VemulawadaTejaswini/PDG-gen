
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int q=scn.nextInt();
		TreeSet<Long> set_a=new TreeSet<>();
		TreeSet<Long> set_b=new TreeSet<>();
		for(int i=0;i<a;i++) {
			set_a.add(scn.nextLong());
		}
		for(int i=0;i<b;i++) {
			set_b.add(scn.nextLong());
		}
		long ans=0;
		for(int i=0;i<q;i++) {
			long x=scn.nextLong();
			if(set_b.ceiling(x)==null) {
				long t2=set_b.floor(x);
				if(set_a.ceiling(x)==null) {
					long s2=set_a.floor(x);
					ans=x-Math.min(s2, t2);

				}else if(set_a.floor(x)==null) {
					long s1=set_a.ceiling(x);
					ans=s1-t2+Math.min(s1-x, x-t2);
				}else {
					long s1=set_a.ceiling(x);
					long s2=set_a.floor(x);
					long a2=x-Math.min(s2, t2);
					long a1=s1-t2+Math.min(x-t2, x-s2);
					ans=Math.min(a1, a2);
				}
			}else if(set_b.floor(x)==null) {
				long t1=set_b.ceiling(x);
				if(set_a.ceiling(x)==null) {
					long s2=set_a.floor(x);
					ans=t1-s2+Math.min(t1-x, x-s2);
				}else if(set_a.floor(x)==null) {
					long s1=set_a.ceiling(x);
					ans=Math.max(s1, t1)-x;
				}else {
					long s1=set_a.ceiling(x);
					long s2=set_a.floor(x);
					long a2=Math.max(s1, t1)-x;
					long a1=t1-s2+Math.min(t1-x, x-s2);
					ans=Math.min(a1, a2);
					
				}
			}else {
				long t2=set_b.floor(x);
				long t1=set_b.ceiling(x);
				if(set_a.ceiling(x)==null) {
					long s2=set_a.floor(x);
					long a1=x-Math.min(s2, t2);
					long a2=t1-s2+Math.min(t1-x, x-s2);
					ans=Math.min(a1, a2);
				}else if(set_a.floor(x)==null) {
					long s1=set_a.ceiling(x);
					ans=Math.min(s1, t1)-x;
					long a1=s1-t2+Math.min(s1-x, x-t2);
					ans=Math.min(ans, a1);
				}else {
					long s1=set_a.ceiling(x);
					long s2=set_a.floor(x);
					long a1=Math.min(s1, t1)-Math.min(s2, t2)+Math.min(Math.min(s1, t1)-x, x-Math.min(s2, t2));
					long a2=Math.max(s1, t1)-x;
					long a3=x-Math.min(s2, t2);
					ans=Math.min(a1, Math.min(a3, a2));
				}
			}
			System.out.println(ans);
		}
	}

}
