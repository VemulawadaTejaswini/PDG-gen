import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n;
	long[] a;

	void run(){
		n=sc.nextInt();
		a=new long[n+1];
		for(int i=0; i<n; i++){
			a[i+1]=sc.nextInt();
		}
		a[0]=Long.MIN_VALUE;
		solve();
	}

	@SuppressWarnings("unchecked")
	void solve(){
		TreeMap<Long, Integer>[] dp=new TreeMap[n+1];
		dp[0]=new TreeMap<Long, Integer>();
		dp[0].put(Long.MIN_VALUE, 0);

		TreeMap<Long, Integer>[] cut=new TreeMap[n+1];

		for(int j=1; j<=n; j++){
			long sum=a[j];
			dp[j]=new TreeMap<Long, Integer>();
			cut[j]=new TreeMap<Long, Integer>();
			for(int i=j-1; i>=0; i--){
				// (i, j]をマージ
				// sum未満で最大のをサーチ
				Entry<Long, Integer> entry=dp[i].lowerEntry(sum);
				if(entry!=null){
					// debug(j,sum);
					int value=dp[j].containsKey(sum)?dp[j].get(sum):-1;
					if(entry.getValue()+1>value){
						dp[j].put(sum, entry.getValue()+1);
						cut[j].put(sum, i);
					}
				}
				sum+=a[i];
			}
			// debug(j, dp[j]);
			// dp[j]の調整
			int max=-1, cut_=-1;
			for(Entry<Long, Integer> entry : dp[j].entrySet()){
				// max=max(max,entry.getValue());
				// dp[j].put(entry.getKey(), max);
				if(entry.getValue()>max){
					// そのまま
					max=entry.getValue();
					cut_=cut[j].get(entry.getKey());
				}else{
					dp[j].put(entry.getKey(), max);
					cut[j].put(entry.getKey(), cut_);
				}
			}
			// debug(j, dp[j]);
			// debug(j, "cut", cut[j]);
		}

		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int c=n; c>=1;){
			list.addFirst(c);
			// long sum=dp[c].lastKey();
			c=cut[c].get(dp[c].lastKey());
		}
		// debug(list);
		list.removeLast();
		StringBuilder sb=new StringBuilder();
		sb.append(list.size()+1);
		sb.append('\n');
		for(int i : list){
			sb.append(i);
			sb.append(' ');
		}
		if(sb.charAt(sb.length()-1)==' '){
			sb.deleteCharAt(sb.length()-1);
		}
		println(sb.toString());
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}