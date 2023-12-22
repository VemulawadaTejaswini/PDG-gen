import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

//Restaurant
public class Main{

	class R implements Comparable<R>{
		int oid, id;
		public R(int oid, int id) {
			this.oid = oid;
			this.id = id;
		}
		public int compareTo(R o) {
			return oid!=o.oid?oid-o.oid:p[id]!=p[o.id]?p[o.id]-p[id]:id-o.id;
		}
	}

	int n, m;
	int[] p, limit, T, K, res;
	Map<String, Integer> ref;
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		boolean head = true;
		for(;;){
			n = sc.nextInt(); m = sc.nextInt();
			if((n|m)==0)break;
			if(!head)System.out.println();
			head = false;
			ref = new HashMap<String, Integer>();
			limit = new int[n];
			p = new int[n];
			T = new int[m];
			K = new int[m];
			for(int i=0;i<n;i++){
				ref.put(sc.next(), i);
				limit[i] = sc.nextInt();
				p[i] = sc.nextInt();
			}
			List<Integer>[] l = new List[m];
			for(int i=0;i<m;i++){
				l[i] = new ArrayList<Integer>();
				T[i] = sc.nextInt();
				K[i] = sc.nextInt();
				for(int j=0;j<K[i];j++)l[i].add(ref.get(sc.next()));
			}
			res = new int[m];
			Arrays.fill(res, -1);
			Queue<Integer>[] c = new Queue[n];
			for(int i=0;i<n;i++)c[i]=new LinkedList<Integer>();
			int f = 0, t = 0, num = 0, make = 0;
			while(f<m||0<num){
				if(num==0&&f<m){
					t = T[f];
					for(int x:l[f]){
						num++; c[x].add(f);
					}
					f++;
				}
				while(f<m&&T[f]<=t){
					for(int x:l[f]){
						num++; c[x].add(f);
					}
					f++;
				}
				int max = 0, M = -1;
				for(int d = make;d<make+n;d++){
					if(!c[d%n].isEmpty()&&max<p[d%n]){
						max = p[d%n]; M = d%n;
					}
				}
				make = M;
				int L = limit[make];
				t += p[make];
				while(0<L&&!c[make].isEmpty()){
					int x = c[make].poll();
					--L; num--;
					if(--K[x]==0)res[x] = t;
				}
				make = (make+1)%n;
			}
			for(int r:res)System.out.println(r);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}