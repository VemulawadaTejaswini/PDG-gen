import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

//Sheets
public class Main{

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}
	
	class E implements Comparable<E>{
		int id, type, x;
		public E(int id, int type, int x) {
			this.id = id;
			this.type = type;
			this.x = x;
		}
		public int compareTo(E o) {
			return x-o.x;
		}		
	}
	
	int[] x1, y1, x2, y2;
	int n, r, area, len;
	int mask = (1<<16)-1;
	
	void f(){
//		long T = System.currentTimeMillis();
		PriorityQueue<E> q = new PriorityQueue<E>(n);
		for(int i=0;i<n;i++){
			q.add(new E(i, 0, x1[i]));
			q.add(new E(i, 1, x2[i]));
		}
		int preX = 0;
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> range = new ArrayList<Integer>();
		while(!q.isEmpty()){
			E e = q.poll();
//			System.out.println("YOKO:"+range.size()*2*(e.x-preX));
			len+=range.size()*2*(e.x-preX);
			for(int m:range){
				int s = m>>16, t = m&mask;
//				System.out.printf("[%d, %d]\n", s, t);
				area+=(e.x-preX)*(t-s);
			}
			if(e.type==0)set.add(e.id);
			else set.remove(e.id);
			preX = e.x;
			while(!q.isEmpty() && q.peek().x==e.x){
				E ee = q.poll();
				if(ee.type==0)set.add(ee.id);
				else set.remove(ee.id);
			}
			List<Integer> next = new ArrayList<Integer>();
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> v = new ArrayList<Integer>();
			for(int i:set)list.add((y1[i]<<16)|y2[i]);
			Collections.sort(list);
			int L = -1, R = -1;
			for(int m:list){
				int s = m>>16, t = m&mask;
				if(R < s){
					if(R!=-1){
						next.add((L<<16)|R);
						v.add((L<<16)|R);
					}
					L = s; R = t;
				}
				else R = Math.max(R, t);
			}
			if(R!=-1){
				next.add((L<<16)|R);
				v.add((L<<16)|R);
			}
			if(r==1){
				range = next; continue;
			}
			if(q.isEmpty()){
				for(int m:range){
					int s = m>>16, t = m&mask;
					len+=t-s;
				}
				break;
			}
			for(;;){
				boolean con = false;
				for(int i=0;i<v.size()&&!con;i++){
					int m = v.get(i);
					int s = m>>16, t = m&mask;
					for(int j=0;j<range.size()&&!con;j++){
						int M = range.get(j);
						int a = M>>16, b = M&mask;
						if(b <= s || t <= a)continue;
						if(a <= s && t <= b){
							con = true; v.remove(i); break;
						}
						if(s < a && b < t){
							con = true; v.remove(i);
							v.add((s<<16)|a);
							v.add((b<<16)|t);
							break;
						}
						if(a <= s){
							con = true; v.remove(i); v.add((b<<16)|t);
						}
						else{
							con = true; v.remove(i); v.add((s<<16)|a);
						}
					}
				}
				if(!con)break;
			}
//			int sum = 0;
			for(int m:v){
				int s = m>>16, t = m&mask;
				len+=t-s;
//				sum+=t-s;
			}
//			System.out.println("TATE:"+sum);
			range = next;
		}
//		System.out.println(System.currentTimeMillis()-T);
//		System.out.println("F:"+F);
	}
	
	void run(){
		Scanner sc = new Scanner();
		x1 = new int[10000]; y1 = new int[10000]; x2 = new int[10000]; y2 = new int[10000];
		for(;;){
			n = sc.nextInt(); r = sc.nextInt();
			if((n|r)==0)break;
			area = len = 0;
			for(int i=0;i<n;i++){
				x1[i] = sc.nextInt(); y1[i] = sc.nextInt();
				x2[i] = sc.nextInt(); y2[i] = sc.nextInt();
			}
			f();
			System.out.println(area);
			if(r==2)System.out.println(len);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}