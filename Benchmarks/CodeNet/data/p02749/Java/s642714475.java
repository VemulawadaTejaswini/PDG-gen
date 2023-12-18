import java.util.*;import java.io.*;import java.math.*;
public class Main{
	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(OBJECT_MEMORY);
		int index = 0; int max;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String read;
				try{
					read = br.readLine();
				}catch(IOException e){
					read = null;
				}
				if(read != null){
					inputLine.add(read);
				}else{
					break;
				}
			}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				String returnStr = inputLine.get(index);
				index++;
				return returnStr;
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static final int OBJECT_MEMORY = 1024;
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), HAN);}
	static ArrayList<String> nextCharArray(){return myconv(next(), NOCHAR);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<Integer> ret = new ArrayList<Integer>(OBJECT_MEMORY);
		ArrayList<String> input = nextStrArray();
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<Long> ret = new ArrayList<Long>(OBJECT_MEMORY);
		ArrayList<String> input = nextStrArray();
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static final int HAN = 8;
	static final int NL = 9;
	static final int NOCHAR = 0;
	static String myconv(Object list, int no){//only join
		String joinString = "";
		if(no == HAN){
			joinString = " ";
		}else if(no == NL){
			joinString = "\n";
		}
		if(list instanceof String[]){
			return String.join(joinString,(String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString,(ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = (no == NOCHAR) ? "" : " ";
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		long mae = System.currentTimeMillis();
		solve();flush();
		long ato = System.currentTimeMillis();
		myerr("time : " + (ato - mae) + "ms");
		myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		int N = nextInt();
		Node[] list = new Node[N];
		String[] output = new String[N];
		Integer one = 1;
		Integer two = 2;
		Integer three = 3;
		for(int i = 0; i < N; i++){
			list[i] = new Node();
		}
		for(int i = 0; i < N - 1; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[tmp.get(0) - 1].child.add(tmp.get(1) - 1);
			list[tmp.get(1) - 1].child.add(tmp.get(0) - 1);
		}
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		list[0].access = true;
		list[0].depth = 1;
		int oddDepth = 0;
		int evenDepth = 0;
		while(!queue.isEmpty()){
			int now = queue.pollFirst();
			if(list[now].depth % 2 == 1){
				oddDepth++;
			}else{
				evenDepth++;
			}
			ArrayList<Integer> child = list[now].child;
			for(int i = 0; i < child.size(); i++){
				if(!list[child.get(i)].access){
					list[child.get(i)].access = true;
					list[child.get(i)].depth = list[now].depth + 1;
					queue.addLast(child.get(i));
				}
			}
		}
		
		if(oddDepth > (N / 3) && evenDepth > (N / 3)){
			for(int i = 0; i < N; i++){
				if(list[i].depth % 2 == 1){
					if(one <= N){
						list[i].value = one;
						one += 3;
					}
				}else{
					if(two <= N){
						list[i].value = two;
						two += 3;
					}
				}
			}
		}else{
			for(int i = 0; i < N; i++){
				if(oddDepth < evenDepth){
					if(list[i].depth % 2 == 1){
						list[i].value = three;
						three += 3;
					}
				}else{
					if(list[i].depth % 2 == 0){
						list[i].value = three;
						three += 3;
					}
				}
			}
		}
		for(int i = 0; i < N; i++){
			if(list[i].value == -1){
				if(one <= N){
					list[i].value = one;
					one += 3;
				}else if(two <= N){
					list[i].value = two;
					two += 3;
				}else if(three <= N){
					list[i].value = three;
					three += 3;
				}
			}
			output[i] = String.valueOf(list[i].value);
		}
		myout(myconv(output, 8));
	}
	//Method addition frame start
static class Node{
	int depth;
	boolean access = false;
	ArrayList<Integer> child = new ArrayList<Integer>();
	int value = - 1;
	Node(){}
}
	//Method addition frame end
}