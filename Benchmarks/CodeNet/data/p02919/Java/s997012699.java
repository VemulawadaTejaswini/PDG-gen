import java.util.*;
public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int P[] = new int[N];
		for(int i=0;i<N;i++) P[i]=sc.nextInt()-1;
		sc.close();
		
		//順列の中の大きい数字から見ていきたいので、処理順に配列の添字を入れた配列を用意する
		int idx[] = new int[N]; //添字の数がP配列のどこにあるか
		for(int i=0;i<N;i++) idx[P[i]]=i; 
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		long ans = 0;
		for(int i=N-1;i>=0;i--) {
			int now = idx[i]; //iの場所
			int hi1 = myHigher(ts, now);
			int hi2 = myHigher(ts, hi1);
			int low1 = myLower(ts, now);
			int low2 = myLower(ts, low1);
			
			int cnt =  (hi2-hi1) * (now -low1) + (hi1-now) * (low1 - low2) ;
			ans += cnt * (i+1);
			
			ts.add(now);			
		}
		System.out.println(ans);
	}
	static int myHigher(TreeSet<Integer> ts, int now) {
		if(ts.higher(now)!=null)return ts.higher(now);
		else return N;
	}
	static int myLower(TreeSet<Integer> ts, int now) {
		if(ts.lower(now)!=null)return ts.lower(now);
		else return -1;
	}
	
}