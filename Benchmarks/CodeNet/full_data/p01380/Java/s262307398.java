import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//The First Acceptance
public class Main{

	class R implements Comparable<R>{
		int a, b, len, min;
		List<R> adj;
		public R(int a, int b) {
			this.a = a;
			this.b = b;
			min = 1<<30+1;
			len = 0;
			adj = new ArrayList<R>();
		}
		public int compareTo(R o) {
			return b-o.b;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		R[] r = new R[n+1];
		for(int i=0;i<n;i++)r[i]=new R(sc.nextInt(), sc.nextInt());
		r[n] = new R(0,0);
		Arrays.sort(r);
		r[0].min = 0;
		for(int i=0;i<=n;i++){
			for(int j=i+1;j<=n;j++){
				if(r[i].min+r[j].a<=r[j].b){
					r[j].adj.add(r[i]);
					r[j].min = Math.min(r[j].min, r[i].min+r[j].a);
				}
			}
		}
		for(int j=n;j>=0;j--){
			for(R t:r[j].adj){
				t.len = Math.max(t.len, r[j].len+1);
			}
		}
		System.out.println(r[0].len);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}