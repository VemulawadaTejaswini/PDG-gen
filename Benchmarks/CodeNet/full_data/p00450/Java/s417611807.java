import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Setting Go Stones
public class Main{

	class R{
		int id;
		boolean white;
		public R(int id, boolean white) {
			this.id = id;
			this.white = white;
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] w = new int[n];
			int[] b = new int[n];
			int pre = sc.nextInt();
			int wid = 0;
			int bid = 0;
			if(pre==0)w[wid++]=0;
			else b[bid++]=0;
			for(int i=1;i<n;i++){
				int s = sc.nextInt();
				if(i%2==0){
					if(pre!=s){
						if(s==0)w[wid++]=i;
						else b[bid++]=i;
					}
					pre = s;
				}
				else{
					if(pre!=s){
						if(s==0){
							w[wid++] = b[--bid];
						}
						else{
							b[bid++] = w[--wid];
						}
					}
					pre = s;
				}
			}
			int i = 0;
			int j = 0;
			List<R> l = new ArrayList<R>();
			while(i<wid||j<bid){
				if(i==wid)l.add(new R(b[j++], false));
				else if(j==bid)l.add(new R(w[i++], true));
				else if(w[i]<b[j])l.add(new R(w[i++], true));
				else l.add(new R(b[j++], false));
			}
			int c = 0;
			for(i=1;i<l.size();i++){
				if(l.get(i-1).white)c+=l.get(i).id-l.get(i-1).id;
			}
			if(l.get(l.size()-1).white)c+=n-l.get(l.size()-1).id;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}