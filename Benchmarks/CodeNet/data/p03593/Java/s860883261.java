import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
  ArrayList<Integer> one1 = nextIntArray();
  int H = one1.get(0);
  int W = one1.get(1);
  HashMap<String, Integer> list = new HashMap<String, Integer>();
  for(int i = 0; i < H; i++){
    ArrayList<String> tmp = nextCharArray();
    for(int j = 0; j < W; j++){
      if(list.containsKey(tmp.get(j))){
      	list.put(tmp.get(j), list.get(tmp.get(j)) + 1);
      }else{
        list.put(tmp.get(j), 1);
      }
    }
  }
  int four = 0;
  int two = 0;
  int one = 0;
  int Hhalf = (H + 1) / 2;
  int Whalf = (W + 1) / 2;
  if(H % 2 == 1 && W % 2 == 1){
    four = (Hhalf - 1) * (Whalf - 1);
    two = (Hhalf - 1) + (Whalf - 1);
    one = 1;
  }else if(H % 2 == 1 && W % 2 != 1){
    four = Whalf * (Hhalf - 1);
    two = Whalf;
  }else if(H % 2 != 1 && W % 2 == 1){
    four = Hhalf * (Whalf - 1);
    two = Hhalf;
  }else{
    four = Hhalf * Whalf;
  }
  
  Iterator<String> it = list.keySet().iterator();
  ArrayList<String> keys = new ArrayList<String>();
  while(it.hasNext()){
  	keys.add(it.next());
  }
  boolean isContain = false;
  while(four > 0){
    for(int i = 0; i < keys.size(); i++){
      if(list.get(keys.get(i)) >= 4){
      	list.put(keys.get(i), list.get(keys.get(i)) - 4);
        four--;
        isContain = true;
      }
    }
    if(isContain){
      isContain = false;
    }else{
      myout("No");
      return;
    }
  }
  while(two > 0){
    for(int i = 0; i < keys.size(); i++){
      if(list.get(keys.get(i)) >= 2){
      	list.put(keys.get(i), list.get(keys.get(i)) - 2);
        two--;
        isContain = true;
      }
    }
    if(isContain){
      isContain = false;
    }else{
      myout("No");
      return;
    }
  }
  while(one > 0){
    for(int i = 0; i < keys.size(); i++){
      if(list.get(keys.get(i)) >= 1){
      	list.put(keys.get(i), list.get(keys.get(i)) - 1);
        one--;
        isContain = true;
      }
    }
    if(isContain){
      isContain = false;
    }else{
      myout("No");
      return;
    }
  }
  
  myout("Yes");
	}
	//Method addition frame start



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
