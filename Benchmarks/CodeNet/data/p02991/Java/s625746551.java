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
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int N = one.get(0);
		int M = one.get(1);
		Node[] list = new Node[N];
		int[][] kyori = new int[N][3];
		for(int i = 0; i < N; i++){
			Arrays.fill(kyori[i], -1);
			list[i] = new Node();
		}
		for(int i = 0; i < M; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[tmp.get(0) - 1].child.add(tmp.get(1) - 1);
		}
		ArrayList<Integer> tmp = nextIntArray();
		int s = tmp.get(0) - 1;
		int t = tmp.get(1) - 1;
		ArrayDeque<Integer[]> queue = new ArrayDeque<Integer[]>();
		Integer[] first = new Integer[2];
		first[0] = s;
		first[1] = 0;
		queue.add(first);
		kyori[s][0] = 0;
		while(queue.size() > 0){
			Integer[] now = queue.pollFirst();
			int v = now[0];
			int L = now[1];
			int nl = (L + 1) % 3;
			ArrayList<Integer> child = list[v].child;
			for(int i = 0; i < child.size(); i++){
				if(kyori[child.get(i)][nl] == -1){
					kyori[child.get(i)][nl] = kyori[v][L] + 1;
					Integer[] add = new Integer[2];
					add[0] = child.get(i);
					add[1] = nl;
					queue.addLast(add);
				}
			}
		}
		int output = -1;
		if(kyori[t][0] != -1){
			output = kyori[t][0] / 3;
		}
		myout(output);
	}
	//Method addition frame start

static class Node{
	ArrayList<Integer> child = new ArrayList<Integer>();
	Node(){}
}


	//Method addition frame end
}
