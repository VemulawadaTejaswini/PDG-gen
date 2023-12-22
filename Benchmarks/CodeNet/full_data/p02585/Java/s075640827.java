
import java.util.*;
public class Main{
	static int n;
	static int k;
	static int[] p;
	static long[] c;
   
	static HashSet<Integer> visited;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		p=new int[n];
		c=new long[n];

		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i]=sc.nextLong();
		}
		
		visited= new HashSet<>();
		
		long max=-1000000000;

		for(int i=0;i<n;i++) {
			long tmp=calc(i);
			//System.out.println(tmp);
			if(tmp>max) {
				max=tmp;
			}
		}

		System.out.println(max);
	}

	static long calc(int start) {
		LinkedList<Integer> list=new LinkedList<>();
		int now=start;
		long point=0;
		int count=0;
		int loop=0;
		long roundpoint=0;
		long maxpoint=c[p[now]-1];
		long min=1000000000;
		for(int i=0;i<n;i++) {
			if(c[i]<min)min=c[i];
		}
		
		while(true) {
			int next=p[now]-1;
			if(visited.contains(next))return -1000000000;
			if(list.contains(next)) {
				loop=count;
				for(int i:list)visited.add(i);
				if(point<=min) return maxpoint;
				roundpoint=point;
				break;
			}
			now=next;
			count++;
			point+=c[next];
			if(maxpoint<point) {
				maxpoint=point;
				//maxind=next;
			}
			list.add(next);
		}
		point=0;
		point+=roundpoint*(k/loop);
		if(k%loop!=0)point+=maxpoint;
		return point;

	}


}
