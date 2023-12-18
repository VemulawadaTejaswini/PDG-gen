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
    static HashMap<Integer, Integer> oddlist = new HashMap<>();
    static HashMap<Integer, Integer> evenlist = new HashMap<>();
	static void solve(){//Here is the main function
      int N = nextInt();
      ArrayList<Integer> list = nextIntArray();
      
      for(int i = 0; i < N; i++){
        if(i % 2 == 0){
          if(oddlist.containsKey(list.get(i))){
            oddlist.put(list.get(i), oddlist.get(list.get(i)) + 1);
          }else{
            oddlist.put(list.get(i), 1);
          }
        }else{
          if(evenlist.containsKey(list.get(i))){
            evenlist.put(list.get(i), evenlist.get(list.get(i)) + 1);
          }else{
            evenlist.put(list.get(i), 1);
          }
        }
      }
      int output = 0;
      ArrayList<Integer> oddSet = new ArrayList<>();
      ArrayList<Integer> evenSet = new ArrayList<>();
      Iterator it1 = oddlist.keySet().iterator();
      while(it1.hasNext()){
        oddSet.add((int)it1.next());
      }
      Iterator it2 = evenlist.keySet().iterator();
      while(it2.hasNext()){
        evenSet.add((int)it2.next());
      }
      
      if(oddSet.size() == 1 && evenSet.size() == 1){
        if(oddSet.get(0) == evenSet.get(0)){
          myout(N / 2);
        }else{
          myout(0);
        }
        return;
      }
      
      Collections.sort(oddSet, new originComparator1());
      Collections.sort(evenSet, new originComparator2());
      myerr(oddSet);
      myerr(evenSet);
      if(oddSet.get(0) == evenSet.get(0)){
        int mae = 1 << 20;
        int ato = 1 << 20;
        if(oddSet.size() > 1){
          mae = (N / 2 - oddlist.get(oddSet.get(1))) + (N / 2 - evenlist.get(evenSet.get(0)));
        }
        if(evenSet.size() > 1){
          ato = (N / 2 - oddlist.get(oddSet.get(0))) + (N / 2 - evenlist.get(evenSet.get(1)));
        }
        output = Math.min(mae, ato);
      }else{
        output = (N / 2 - oddlist.get(oddSet.get(0))) + (N / 2 - evenlist.get(evenSet.get(0)));
      }
      myout(output);
	}
	//Method addition frame start

static class originComparator1 implements Comparator<Integer>{
  public int compare(Integer mae, Integer ato){
    return oddlist.get(ato) - oddlist.get(mae);
  }
}
  
static class originComparator2 implements Comparator<Integer>{
  public int compare(Integer mae, Integer ato){
    return evenlist.get(ato) - evenlist.get(mae);
  }
}

	//Method addition frame end
}
