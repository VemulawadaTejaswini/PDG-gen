import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int M = one.get(1);
      long max = 1L << 60;
      Node[] list = new Node[N];
      for(int i = 0; i < N; i++){
        list[i] = new Node();
        if(i > 0){
          list[i].child.put(i - 1, new Long("0"));
        }
      }
      for(int i = 0; i < M; i++){
        ArrayList<Integer> tmp = nextIntArray();
        int L = tmp.get(0) - 1;
        int R = tmp.get(1) - 1;
        int C = tmp.get(2);
        if(list[L].child.get(R) != null){
          list[L].child.put(R, Math.min((long)C, list[L].child.get(R)));
        }else{
          list[L].child.put(R, (long)C);
        }
        
      }
      
      list[0].cost = 0;
      PriorityQueue<Q> pq = new PriorityQueue<>();
      pq.add(new Q(0, new Long("0")));
      while(pq.size() > 0){
        Q now = pq.poll();
        if(now.sum > list[now.index].cost){
          continue;
        }
        HashMap<Integer, Long> child = list[now.index].child;
        Iterator<Integer> keys = child.keySet().iterator();
        while(keys.hasNext()){
          int nc = keys.next();
          long nextSum = list[now.index].cost + child.get(nc);
          if(list[nc].cost > nextSum){
            list[nc].cost = nextSum;
            pq.add(new Q(nc, list[nc].cost));
          }
        }
      }
      myout((list[N - 1].cost < max) ? list[N - 1].cost : -1);
	}
	//Method addition frame start

static class Node{
  HashMap<Integer, Long> child = new HashMap<>();
  long cost = 1L << 60;
  Node(){}
}

static class Q implements Comparable<Q>{
  int index;
  long sum;
  Q(int index, long sum){
    this.index = index;
    this.sum = sum;
  }
  public int compareTo(Q ato){
    if(this.sum < ato.sum){
      return -1;
    }else if(this.sum > ato.sum){
      return 1;
    }else{
      if(this.index < ato.index){
        return -1;
      }else if(this.index > ato.index){
        return 1;
      }else{
        return 0;
      }
    }
  }
}
  
	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<>(1024);
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
	static HashMap<Integer, String> CONVSTR = new HashMap<>();
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
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<>(input.size());
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
