import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
  ArrayList<String> input = nextCharArray();
  HashMap<String, Integer> list = new HashMap<String, Integer>();
  list.put("K", input.indexOf("K"));
  list.put("I", input.indexOf("I"));
  list.put("H", input.indexOf("H"));
  list.put("B", input.indexOf("B"));
  list.put("R", input.indexOf("R"));
  
  if(list.get("K") == -1 || list.get("I") == -1 || list.get("H") == -1 ||list.get("B") == -1 ||list.get("R") == -1){
     myout("NO");
    return;
     }
  if(list.get("K") > list.get("I") || list.get("I") > list.get("H") ||
     list.get("H") > list.get("B") || list.get("B") > list.get("R")){
     myout("NO");
    return;
     }
  if(input.size() > 9){
     myout("NO");
    return;
  }
  if(list.get("K") != list.get("I")-1 || list.get("I") != list.get("H")-1){
     myout("NO");
    return;
  }
  if(list.get("B") - list.get("H") > 2){
     myout("NO");
    return;
  }
  if(list.get("B") - list.get("H") == 2){
    String tmp = input.get(list.get("B") - 1);
    if(tmp.equals("A")){
       myout("NO");
      return;
    }
  }
  if(list.get("R") - list.get("B") > 2){
     myout("NO");
    return;
  }
  if(list.get("R") - list.get("B") == 2){
     String tmp = input.get(list.get("R") - 1);
    if(tmp.equals("A")){
       myout("NO");
    return;
    }
  }
  int maeAcount = 0;
  for(int i = 0; i < input.size(); i++){
    if(input.get(i).equals("A")){
       maeAcount++;
    }else{
      break;
    }
  }
  if(maeAcount > 1){
     myout("NO");
    return;
  }
  int atoAcount = 0;
  for(int i = input.size()-1; i >= 0; i--){
    if(input.get(i).equals("A")){
       atoAcount++;
    }else{
      break;
    }
  }
  if(atoAcount > 1){
     myout("NO");
    return;
  }
  myout("YES");
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
