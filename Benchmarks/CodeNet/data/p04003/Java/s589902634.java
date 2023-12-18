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
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
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
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
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
		Runtime rt = Runtime.getRuntime();
		long mae = System.currentTimeMillis();
		solve();flush();
		long ato = System.currentTimeMillis();
		myerr("time : " + (ato - mae) + "ms");
		myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int N = one.get(0);
		int M = one.get(1);
		Node[] list = new Node[N];
		for(int i = 0; i < N; i++){
			list[i] = new Node();
		}
		for(int i = 0; i < M; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[tmp.get(0) - 1].map.put(tmp.get(1) - 1, tmp.get(2));
			list[tmp.get(1) - 1].map.put(tmp.get(0) - 1, tmp.get(2));
		}
		PriorityQueue<QueueObject> pq = new PriorityQueue<QueueObject>(new originComparator());
		list[0].cost = 0;
		QueueObject first = new QueueObject(0, 0, -1);
		pq.add(first);
		while(!pq.isEmpty()){
			QueueObject now = pq.poll();
			int no = now.no;
			int value = now.value;
			int use = now.use;
			Iterator it = list[no].map.keySet().iterator();
			HashMap<Integer, Integer> child = list[no].map;
			while(it.hasNext()){
				int key = (int)it.next();
				if(list[key].cost == -1){
					QueueObject add = new QueueObject(key, -1, child.get(key));
					if(child.get(key) == use){
						add.value = value;
					}else{
						add.value = value + 1;
					}
					pq.add(add);
					list[key].cost = add.value;
				}else if(list[key].cost > list[no].cost + ((child.get(key) == use) ? 0 : 1)){
					QueueObject add = new QueueObject(key, -1, child.get(key));
					if(child.get(key) == use){
						add.value = value;
					}else{
						add.value = value + 1;
					}
					pq.add(add);
					list[key].cost = add.value;
				}
			}
		}
		myout(list[N - 1].cost);
	}
	//Method addition frame start
static class Node{
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	int cost = -1;
	Node(){}
}

static class QueueObject{
	int no;
	int value;
	int use;
	QueueObject(int n, int v, int u){
		no = n;
		value = v;
		use = u;
	}
}

public static class originComparator implements Comparator<QueueObject>{
	public int compare(QueueObject mae, QueueObject ato){
		return mae.value - ato.value;
	}
}

	//Method addition frame end
}
