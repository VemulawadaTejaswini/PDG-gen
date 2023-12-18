import java.util.*;
import java.io.*;
public class Main { //atcoder ABC128E -
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		Rw[] rws = new Rw[n];
		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			rws[i] = new Rw(s, t, x);
		}
		Arrays.sort(rws);
		TreeSet<Ped> set = new TreeSet<>();
		for(int i = 0; i < q; i++) {
			set.add(new Ped(Integer.parseInt(br.readLine()), i));
		}
		int[] dead = new int[q]; Arrays.fill(dead, -1);
		for(Rw r: rws){
			Ped comp = new Ped(r.s - r.x, 0);
			Ped p = set.ceiling(comp);
			while(p != null){
				if(p.d < r.t - r.x){
					set.remove(p);
					dead[p.ind] = r.x;
					p = set.ceiling(comp);
				}
				else break;
			}
		}
		for(int i = 0; i < q; i++){
			System.out.println(dead[i]);
		}
	}
	static class Rw implements Comparable<Rw>{
		int s, t, x;
		public Rw(int s, int t, int x){
			this.s = s; this.t = t; this.x = x;
		}
		@Override
		public int compareTo(Rw r){
			return x - r.x;
		}
		public String toString(){
			return s+"-"+t+","+x;
		}
	}
	static class Ped implements Comparable<Ped>{
		int d, ind;
		public Ped(int d, int ind){
			this.d = d; this.ind = ind;
		}
		@Override
		public int compareTo(Ped p){
			return d - p.d;
		}
		public String toString(){
			return ind+":"+d;
		}
	}
}
