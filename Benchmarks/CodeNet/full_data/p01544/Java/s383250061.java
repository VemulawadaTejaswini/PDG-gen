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
		// n=4000;
		// println(n+"");
		for(int i=0; i<n; i++){
			// println((int)(random()*1e8)+"");
		}
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
		TreeMap<Long, Integer>[] cuts=new TreeMap[n+1];
		for(int i=0; i<=n; i++){
			dp[i]=new TreeMap<Long, Integer>();
			cuts[i]=new TreeMap<Long, Integer>();
		}
		dp[0]=new TreeMap<Long, Integer>();
		dp[0].put(Long.MIN_VALUE, 0);

		for(int j=1; j<=n; j++){
			if(j%100==0){
				debug(j, dp[j-1].size());
//				debug(Runtime.getRuntime().totalMemory()/1e6);
			}
			long sum=a[j];
			// dp[j]=new TreeMap<Long, Integer>();
			// cuts[j]=new TreeMap<Long, Integer>();
			for(int i=j-1; i>=0; i--){
				// (i, j]をマージ
				// sum未満で最大のをサーチ
				Entry<Long, Integer> entry=dp[i].lowerEntry(sum);
				if(entry!=null){
					// debug(j,sum);
					int value=dp[j].containsKey(sum)?dp[j].get(sum):-1;
					if(entry.getValue()+1>value){
						dp[j].put(sum, entry.getValue()+1);
						cuts[j].put(sum, i);
					}
				}
				sum+=a[i];
			}
			// debug(j, dp[j]);
			// dp[j]の調整
			int max=-1, cut=-1;
			TreeMap<Long,Integer> temp=new TreeMap<Long, Integer>();
			TreeMap<Long,Integer> tempCut=new TreeMap<Long, Integer>();
			for(Entry<Long, Integer> entry : dp[j].entrySet()){
				// max=max(max,entry.getValue());
				// dp[j].put(entry.getKey(), max);
				long key=entry.getKey();
				int value=entry.getValue();
				
				/**
				 * 				if(entry.getValue()>max){
					// そのまま
					max=entry.getValue();
					cut=cuts[j].get(entry.getKey());
					temp.put(entry.getKey(), entry.getValue());
					tempCut.put(entry.getKey(), cut);
				}else{

				 */
				if(value>max){
					// そのまま
					max=value;
					cut=cuts[j].get(key);
					temp.put(key, value);
					tempCut.put(key, cut);
				}else{
					// いらん
					 // dp[j].put(entry.getKey(), max);
					 // cuts[j].put(entry.getKey(), cut);
				}
			}
			if(false){
			debug(j, dp[j]);
			debug(j, "cut", cuts[j]);
			debug(j, temp);
			debug(j, "cut", tempCut);
			}
			dp[j]=temp;
			cuts[j]=tempCut;
		}

		LinkedList<Integer> list=new LinkedList<Integer>();
		long sum=Long.MAX_VALUE;
		for(int cut=n; cut>=1;){
			list.addFirst(cut);
			// sum=dp[cut].lastKey();
			sum=dp[cut].lowerKey(sum);
			cut=cuts[cut].get(sum);
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