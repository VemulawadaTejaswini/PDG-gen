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
		Node[] list = new Node[N + 1];
        int max = 1000000007;
		for(int i = 1; i <= N; i++){
			list[i] = new Node();
            list[i].cost = max;
		}
		for(int i = 0; i < M; i++){
			ArrayList<Integer> tmp = nextIntArray();
          	Node L = list[tmp.get(0)];
          	Node R = list[tmp.get(1)];
          	int c = tmp.get(2);
          	L = L.getNode(c);
          	R = R.getNode(c);
          	L.next.add(R);
          	R.next.add(L);
		}
      	for(int i = 1; i <= N; i++){
          	for(Node node : list[i].map.values()){
              node.cost = max;
            }
		}
      	list[1].cost = 0;
		TreeSet<Node> pq = new TreeSet<Node>(new OriginComparator());
		pq.add(list[1]);
		while(!pq.isEmpty()){
			Node now = pq.pollFirst();
          	for(Node node : now.next){
              int nextCost = now.cost + now.change;
              if(nextCost >= node.cost){
                continue;
              }
              pq.remove(node);
              node.cost = nextCost;
              pq.add(node);
            }
		}
      	for(int i = 1; i <= N; i++){
          myerr(list[i].cost);
        }
		myout((list[N].cost < max) ? list[N].cost : -1);
	}
	//Method addition frame start
static class Node{
  ArrayList<Node> next = new ArrayList<Node>();	
  HashMap<Integer, Node> map = new HashMap<Integer, Node>();
  int cost;
  int change = 1;
  int count = 0;
  int no;
	Node(){
    	no = count++;
    }
  	public Node getNode(int key){
      Node node = map.get(key);
      if(node == null){
        node = new Node();
        next.add(node);
        node.next.add(this);
        node.change = 0;
        map.put(key, node);
      }
      return node;
    }
}

public static class OriginComparator implements Comparator<Node>{
  public int compare(Node mae, Node ato){
    if(mae.cost == ato.cost){
      return mae.no - ato.no;
    }else{
      return mae.cost - ato.cost;
    }
  }
}

	//Method addition frame end
}
