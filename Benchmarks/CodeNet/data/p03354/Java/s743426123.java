import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		long[] p = new long[(int)N+10];
		for(int i = 1;i<=N;i++) {
			p[i]=sc.nextLong();
		}
		long[] x= new long[(int)M+10];
		long[] y = new long[(int)M+10];
		for(int i =1;i<=M;i++) {
			x[i]= sc.nextLong();
			y[i]=sc.nextLong();
		}
		
		ArrayList<Set<Integer>> gun = new ArrayList<Set<Integer>>();
		for(int i =1;i<=M;i++) {
			for(int j=0;j<gun.size();j++) {
				if(gun.get(j).contains((int)x[i])) {
					gun.get(j).add((int)y[i]);
				}else {
					Set<Integer> a = new HashSet<Integer>();
					a.add((int)x[i]);
					gun.add(a);
				}
			}
		}
		
		long ans = 0l;
		for(int i =1;i<N+1;i++) {
			for(int j =0;j<gun.size();j++) {
				if(gun.get(j).contains(p[i])) {
					if(gun.get(j).contains(i)) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
