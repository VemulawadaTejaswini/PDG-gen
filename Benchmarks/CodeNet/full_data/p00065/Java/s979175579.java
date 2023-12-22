import java.util.Scanner;

public class Main{
	private class Pair{
		public int n;
		public int c;
		public Pair(){
		}
		public Pair(int n){
			this.n = n;
			c = 1;
		}
		
		public void print(int v){
			c += v;
			System.out.print(n+" ");
			System.out.println(c);
			return ;
		}
	}
	
	public Main(){
		Scanner sc = new Scanner(System.in);
		Pair p1[] = new Pair[1000];
		Pair p2[] = new Pair[1000];
		int p = 0, q = 0, f;
		
		while(sc.hasNext()){
			String s = sc.nextLine();
			if(s.length()==0){
				break;
			}
			String[] st = s.split(",");
			int v = Integer.parseInt(st[0]);
			f = 0;
			for(int i = 0; i < p; i++){
				if(p1[i].n == v){
					p1[i].c++;
					f = 1;
					break;
				}
			}
			if(f == 0){
				p1[p++] = new Pair(v);
			}
		}
		
		while(sc.hasNext()){
			String[] s = (sc.nextLine()).split(",");
			int v = Integer.parseInt(s[0]);
			f = 0;
			for(int i = 0; i < q; i++){
				if(p2[i].n == v){
					p2[i].c++;
					f = 1;
					break;
				}
			}
			if(f == 0){
				p2[q++] = new Pair(v);
			}
		}
		sort(p1, p);
		
		for(int i = 0; i < p; i++){
			for(int j = 0; j < q; j++){
				if(p1[i].n == p2[j].n){
					p1[i].print(p2[j].c);
					break;
				}
			}
		}
	}
	
	private void sort(Pair[] p, int n){
		Pair t;
		for(int i = n-1; i >= 0; i--){
			for(int j = 1; j <= i; j++){
				if(p[j].n < p[j-1].n){
					t = p[j];
					p[j] = p[j-1];
					p[j-1] = t;
				}
			}
		}
		
		return ;
	}
	
	public static void main(String[] args){
		new Main();
	}
}