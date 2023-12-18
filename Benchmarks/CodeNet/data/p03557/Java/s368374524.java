import java.util.*;
public class Main{
	static long Dan1(long[] d, long key){
		int pl = 0;
		int pr = d.length - 1;
		int pc = (pl + pr) / 2;
		while(pl<pr){
			if(d[pc]<key)pl = pc + 1;
			else {
				pr = pc;
			}
			pc = (pl + pr) / 2;
		}
		if(d[pl]==key)return pl;
		if(d[pc]>key)return pc;
		else return pc + 1;
	}

	static long Dan2(long[] d, long key){
		int pl = 0;
		int pr = d.length - 1;
		int pc = 0;
			pc = (pl + pr + 1) / 2;
		while(pl<pr){
			if(d[pc]>key)pr = pc - 1;
			else {
				pl = pc;
			}
			pc = (pl + pr + 1) / 2;
		}
		if(d[pr]==key)return d.length - 1 - pr;
		if(d[pc]>key)return d.length - pc;
		else return d.length - pc -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		for(int i=0; i<n; i++){
			b[i] = sc.nextLong();
		}
		for(int i=0; i<n; i++){
			c[i] = sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(c);
		long num = 0L;
		for(int i=0; i<n; i++){
			num += Dan1(a, b[i]) * Dan2(c, b[i]);
		}
		System.out.println(num);
	}
}