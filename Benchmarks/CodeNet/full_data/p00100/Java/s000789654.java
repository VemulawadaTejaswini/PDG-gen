import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Sale Result
public class Main{

	static class P implements Comparable<P>{
		public int o;
		public long s;
		public int compareTo(P o) {
			return this.o-o.o;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			List<Integer> l = new ArrayList<Integer>();
			P[] s = new P[4001];
			int id = 0;
			while(n--!=0){
				int d = sc.nextInt();
				if(s[d]==null){
					s[d] = new P();
					s[d].o = id++;
				}
				long p = sc.nextLong();
				long k = sc.nextLong();
				s[d].s+=p*k;
			}
			for(int i=1;i<4001;i++)if(s[i]!=null&&1000000<=s[i].s)l.add(i);
			Collections.sort(l);
			if(l.isEmpty())System.out.println("NA");
			else for(int i:l)System.out.println(i);
		}
	}
}