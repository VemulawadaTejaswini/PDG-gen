
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();//N文字のL,R
		//一回の操作では最大２しか増えない。
		//元々不幸から幸福になるのは、よくて回転の右端と左端のみ。
		//よって左から不幸者を見つけて、今度は右から不幸者と同じ向きの不幸の人を見つけて回転する。全員幸福ならストップ
		
		int l=0, r=-1;
		int last = S.length()-1;
		boolean fin = false;
		int lmemo = -1;
		Set<Integer> memo = new HashSet<Integer>();
		
		while(!fin&&K>0) {
		//左から不幸者を探す
		fin=true;
		r=-1;
		for(int i=l;i<last;i++){
			if(S.charAt(i)!=S.charAt(i+1)) {
				l=i+1;
				fin = false;
				break;
			}
		}
		//次に不幸者より右で、同じ向きの不幸者を探す。
		for(int i=l+1;i<last;i++){
			if(S.charAt(i)!=S.charAt(i+1)) {
				if(S.charAt(i)==S.charAt(l)) {
					r=i;
					break;
				}
			}
		}
		if(r==-1) {
			memo.add(l);
			continue;
		}else K-=1;
		
		StringBuilder sb = new StringBuilder();
		sb.append(S.substring(0,l));
		for(int i=r;i>=l;i--) {
			char t = S.charAt(i); 
			if (t == 'L')t='R';else t='L';
			sb.append(t);
		}
		sb.append(S.substring(r+1));
		S = sb.toString();	
		}
		for(int i=0;i<K;i++) {
			if(memo.size()>0) {
				for(int tmp:memo) {
					if(S.charAt(last)==S.charAt(tmp)) {
						l=tmp;
						r=last;
						StringBuilder sb = new StringBuilder();
						sb.append(S.substring(0,l));
						for(int j=r;j>=l;j--) {
							char t = S.charAt(j); 
							if (t == 'L')t='R';else t='L';
							sb.append(t);
						}
						sb.append(S.substring(r+1));
						S = sb.toString();	
					}
				}
			}else break;
		}

		int ans=0;


		for(int i=0;i<=last-1;i++) {
			if(S.charAt(i) == S.charAt(i+1)) ans++;
		}
		//System.out.println(S);
		System.out.println(ans);
	}
}