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
	static Node[] list;
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int N = one.get(0);
		int M = one.get(1);
		list = new Node[N];
		for(int i = 0; i < N; i++){
			list[i] = new Node();
		}
		for(int i = 0; i < N - 1 + M; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[tmp.get(0) - 1].child.add(tmp.get(1) - 1);
			list[tmp.get(1) - 1].parent.add(tmp.get(0) - 1);
		}
		for(int i = 0; i < N; i++){
			if(list[i].parent.size() == 0){
				topologicalSort(i);
				break;
			}
		}
		for(int i = 0; i < N; i++){
			if(list[i].from == -1){
				myout(0);
			}else{
				myout(list[i].from);
			}
		}
	}
	//Method addition frame start

static class Node{
	TreeSet<Integer> child = new TreeSet<Integer>();
	TreeSet<Integer> parent = new TreeSet<Integer>();
	int from = -1;
	Node(){}
}

static void topologicalSort(int index){
	ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	queue.add(index);
	while(queue.size() > 0){
		int parent = queue.pollFirst();
		ArrayList<Integer> child = new ArrayList<Integer>();
		Iterator<Integer> it = list[parent].child.iterator();
		while(it.hasNext()){
			child.add(it.next());
		}
		for(int i = 0; i < child.size(); i++){
			list[parent].child.remove(child.get(i));
			list[child.get(i)].parent.remove(parent);
			if(list[child.get(i)].parent.size() == 0){
				list[child.get(i)].from = parent + 1;
				queue.addLast(child.get(i));
			}
		}
	}
}

	//Method addition frame end
}
