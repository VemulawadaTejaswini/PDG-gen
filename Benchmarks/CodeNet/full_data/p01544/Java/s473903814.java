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
		HashMap<Long, Integer>[] cuts=new HashMap[n+1];
		for(int i=0; i<=n; i++){
			dp[i]=new TreeMap<Long, Integer>();
			cuts[i]=new HashMap<Long, Integer>();
		}
		dp[0]=new TreeMap<Long, Integer>();
		dp[0].put(Long.MIN_VALUE, 0);

		for(int j=1; j<=n; j++){
			if(j%100==0){
				debug(j, dp[j-1].size());
				// debug(Runtime.getRuntime().totalMemory()/1e6);
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
//					int value=dp[j].containsKey(sum)?dp[j].get(sum):-1;
					int value=cuts[j].containsKey(sum)?dp[j].get(sum):-1;
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
			ArrayList<Long> remove=new ArrayList<Long>();
			for(Entry<Long, Integer> entry : dp[j].entrySet()){
				long key=entry.getKey();
				int value=entry.getValue();
				/**
				 * if(entry.getValue()>max){
				 * // そのまま
				 * max=entry.getValue();
				 * cut=cuts[j].get(entry.getKey());
				 * temp.put(entry.getKey(), entry.getValue());
				 * tempCut.put(entry.getKey(), cut);
				 * }else{
				 */
				if(value>max){
					// そのまま
					max=value;
					cut=cuts[j].get(key);
					// dpTemp.put(key, value);
					// cutsTemp.put(key, cut);
				}else{
					// いらん
					// dp[j].put(entry.getKey(), max);
					// cuts[j].put(entry.getKey(), cut);
					remove.add(key);
				}
			}
			for(long key : remove){
				dp[j].remove(key);
				cuts[j].remove(key);
			}
			if(false){
				debug(j, dp[j]);
				debug(j, "cut", cuts[j]);
			}
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

	class Scanner{
		BufferedReader br;
		StringTokenizer st;

		Scanner(InputStream in){
			br=new BufferedReader(new InputStreamReader(in));
			eat("");
		}

		void eat(String s){
			st=new StringTokenizer(s);
		}

		String nextLine(){
			try{
				return br.readLine();
			}catch(IOException e){
				throw new IOError(e);
			}
		}

		boolean hasNext(){
			while(!st.hasMoreTokens()){
				String s=nextLine();
				if(s==null)
					return false;
				eat(s);
			}
			return true;
		}

		String next(){
			hasNext();
			return st.nextToken();
		}

		int nextInt(){
			return Integer.parseInt(next());
		}
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