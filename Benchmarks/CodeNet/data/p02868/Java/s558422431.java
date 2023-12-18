import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int N = one.get(0);
		int M = one.get(1);
		long[] dp = new long[N];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		Node[] list = new Node[M];
		for(int i = 0; i < M; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[i] = new Node(tmp.get(0), tmp.get(1), tmp.get(2));
		}
		Arrays.sort(list);
		for(int i = 0; i < M; i++){
			Node now = list[i];
			int L = now.L - 1;
			int R = now.R;
			for(int j = 1; L + j < R; j++){
				if(dp[L + j] == -1){
					dp[L + j] = dp[L] + now.C;
				}else{
					dp[L + j] = Math.min(dp[L + j], dp[L] + now.C);
				}
			}
		}
		for(int i = 0; i < N; i++){
			if(dp[i] == -1){
				myout(-1);
				return;
			}
		}
		myout(dp[N - 1]);
		

	}
	//Method addition frame start

static class Node implements Comparable<Node>{
	int L;
	int R;
	int C;
	Node(int L, int R, int C){
		this.L = L;
		this.R = R;
		this.C = C;
	}
	public int compareTo(Node ato){
		return this.L - ato.L;
	}
}

	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
					inputLine.add(read);
				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static double nextDouble(){return Double.parseDouble(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
	static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
