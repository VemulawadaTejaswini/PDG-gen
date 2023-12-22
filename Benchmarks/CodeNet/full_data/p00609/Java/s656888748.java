import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Amazing Graze
public class Main{

	class R implements Comparable<R>{
		int x, y;
		public R(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(R o) {
			return y-o.y;
		}
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int AN = sc.nextInt(), BN = sc.nextInt(), R = sc.nextInt();
			if((AN|BN)==0)break;
			List<R>[] l = new List[10000];
			for(int i=0;i<10000;i++)l[i]=new ArrayList<R>();
			R[] a = new R[AN];
			for(int i=0;i<AN;i++)a[i] = new R(sc.nextInt(), sc.nextInt());
			for(int i=0;i<BN;i++){
				R r = new R(sc.nextInt(), sc.nextInt());
				l[r.x].add(r);
			}
			for(int i=0;i<10000;i++)Collections.sort(l[i]);
			int c = 0;
			for(int i=0;i<AN;i++){
				R r = a[i];
				for(int x=r.x-4*R;x<=r.x+4*R;x++){
					if(x<0||10000<=x)continue;
					if(l[x].isEmpty())continue;
					int left = 0, right = l[x].size()-1;
					while(right-left>1){
						int mid = (left+right)/2;
						if(l[x].get(mid).y>=r.y-4*R)left = mid;
						else right = mid;
					}
					for(int j=left;j<l[x].size();j++){
						R t = l[x].get(j);
						if(r.y+4*R<t.y)break;
						double d = Math.sqrt(Math.pow(r.x-t.x, 2)+Math.pow(r.y-t.y, 2))-2*R;
						if(d<=2*R)c++;
					}
				}
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}