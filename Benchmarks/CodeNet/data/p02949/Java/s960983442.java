import java.util.*; import java.io.*; import java.math.*;
public class Main{
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
	static boolean[] pok;
	static boolean[] nok;
	static Node[] list;
	static Node[] rlist;
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int N = one.get(0);
		int M = one.get(1);
		int P = one.get(2);
		long max = (long)Math.pow(10, 15);
		long[] kyori = new long[N];
		pok = new boolean[N];
		nok = new boolean[N];
		Arrays.fill(kyori, max);
		Arrays.fill(pok, false);
		Arrays.fill(nok, false);
		list = new Node[N];
		rlist = new Node[N];
		for(int i = 0; i < N; i++){
			list[i] = new Node();
			rlist[i] = new Node();
		}
		kyori[0] = 0;
		Edge[] e = new Edge[M];
		for(int i = 0; i < M; i++){
			ArrayList<Integer> tmp = nextIntArray();
			e[i] = new Edge(tmp.get(0) - 1, tmp.get(1) - 1, (tmp.get(2) - P) * -1);
			list[tmp.get(0) - 1].child.add(tmp.get(1) - 1);
			rlist[tmp.get(1) - 1].child.add(tmp.get(0) - 1);
		}
		boolean[] ok = new boolean[N];
		Arrays.fill(ok, false);
		dfs(0);
		rdfs(N - 1);
		for(int i = 0; i < N; i++){
			ok[i] = pok[i] && nok[i];
		}
		int loop = 0;
		boolean isContinue = true;
		while(isContinue){
			isContinue = false;
			for(int j = 0; j < M; j++){
				if(!ok[e[j].u]){
					continue;
				}
				if(!ok[e[j].v]){
					continue;
				}
				if(kyori[e[j].v] > kyori[e[j].u] + e[j].c){
					kyori[e[j].v] = kyori[e[j].u] + e[j].c;
					isContinue = true;
				}
			}
			loop++;
			if(loop > N){
				myout(-1);
				return;
			}
		}
		myout(Math.max(kyori[N - 1] * -1, 0));
	}
	//Method addition frame start

static class Node{
	ArrayList<Integer> child = new ArrayList<Integer>();
	boolean access = false;
	Node(){}
}

static class Edge{
	int u;
	int v;
	int c;
	Edge(int u, int v, int c){
		this.u = u;
		this.v = v;
		this.c = c;
	}
}

static void dfs(int index){
	if(pok[index]){
		return;
	}
	pok[index] = true;
	ArrayList<Integer> child = list[index].child;
	for(int i = 0; i < child.size(); i++){
		dfs(child.get(i));
	}
}
static void rdfs(int index){
	if(nok[index]){
		return;
	}
	nok[index] = true;
	ArrayList<Integer> child = rlist[index].child;
	for(int i = 0; i < child.size(); i++){
		rdfs(child.get(i));
	}
}



	//Method addition frame end
}
