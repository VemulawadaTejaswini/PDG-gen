import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        new Main().solve();
    }
	ArrayList<Integer>[]path;
    int n,m;
	int[]a;
	int[]b;
	void solve() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		path=new ArrayList[n];
		for(int i=0;i<n;i++) {
			path[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			path[a[i]].add(b[i]);
			path[b[i]].add(a[i]);
		}
		int ans=0;
		
		for(int i=0;i<m;i++) {
			ans+=path[a[i]].size()*path[b[i]].size();
		}
		ans/=2;
		ans-=ans-(m-(n-m));
		System.out.println(ans);
	}
}