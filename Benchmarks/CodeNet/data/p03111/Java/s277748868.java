package Lambai;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B119C {

	public static void main(String[] args) {
		
		new B119C();
	}
	
	public B119C() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int l[] = new int[n];
		for (int i=0;i<l.length;i++)
			l[i] = sc.nextInt();
		State start = new State(l);
		State goal = new State(new int[] {a,b,c});
		PriorityQueue<State> Open = new PriorityQueue<State>(100000000, new Comparator<State>() {
			@Override
			public int compare(State o1, State o2) {
				return o1.g+o1.h - o2.g - o2.h;
			}
		});
		State O = null;
		Map<String,State> closed = new HashMap<>();
		start.h=dis(start,goal);
		Open.add(start);
		closed.put(start.key(), start);
		while (Open.size()>0) {
			//System.out.println(Open.size());
			O = Open.remove();
			if (equal(O,goal)) break;
			for (int i=0;i<8;i++) {
				int cl[] = O.a.clone();
				if (cl[i]<1) continue;
				cl[i]++;
				State sn = new State(cl);
				if (closed.get(sn.key())!=null) continue;
				sn.g = O.g+1;
				sn.h = dis(sn,goal);
				sn.cha = O;
				Open.add(sn);
				closed.put(sn.key(), sn);
			}
			for (int i=0;i<8;i++) {
				int cl[] = O.a.clone();
				if (cl[i]<2) continue;
				cl[i]--;
				State sn = new State(cl);
				if (closed.get(sn.key())!=null) continue;
				sn.g = O.g+1;
				sn.h = dis(sn,goal);
				sn.cha = O;
				Open.add(sn);
				closed.put(sn.key(), sn);
			}
			
			for (int i=1;i<8;i++) {
				int cl[] = O.a.clone();
				if (cl[i-1]<1 || cl[i]<1) continue;
				cl[i]+=cl[i-1];
				cl[i-1] = 0;
				State sn = new State(cl);
				if (closed.get(sn.key())!=null) continue;
				sn.g = O.g+10;
				sn.h = dis(sn,goal);
				sn.cha = O;
				Open.add(sn);
				closed.put(sn.key(), sn);
			}
		}
		System.out.println(O.g);
	}

	private boolean equal(State x, State y) {
		return dis(x,y)==0;
	}

	private int dis(State x, State y) {
		int min = 1000000000;
		for (int i=0;i<8;i++)
			for (int j=i+1;j<8;j++)
				for (int k=j+1;k<8;k++)
				{
					int di = Math.abs(x.a[k]-y.a[7])+Math.abs(x.a[j]-y.a[6])+Math.abs(x.a[i]-y.a[5]);
					if (min>di) min = di;
				}
		return min;
	}

}

class State{
	State cha = null;
	int g=0,h=0;
	int a[] = new int[8];
	public State(int[] a) {
		for (int i=0;i<this.a.length;i++)
			if (i<a.length)
				this.a[i] = a[i];
			else this.a[i] = 0;
		Arrays.sort(this.a);
	}
	public String key() {
		String s="";
		for (int i=0;i<this.a.length;i++)
			s+=this.a[i]+",";
		return s;
	}
}
