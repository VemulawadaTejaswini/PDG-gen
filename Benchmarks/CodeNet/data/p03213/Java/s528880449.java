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
		int N = nextInt();
		HashMap<Integer, Integer> primeCountList = new HashMap<Integer, Integer>();
		primeCountList.put(1, 1);
		for(int i = 1; i <= N; i++){
    int tmpI = i;
    int div = 2;
    while(tmpI != 1){
       if(tmpI % div == 0){
         if(!primeCountList.containsKey(div)){
           primeCountList.put(div, 1);
         }else{
           primeCountList.put(div, primeCountList.get(div) + 1);
         }
         tmpI /= div;
       }else{
         div = (div == 2) ? div+1 : div+2;
       }
    }
  }
		Iterator it = primeCountList.keySet().iterator();
		int result442 = 0;//P1^4,P2^4,P3^2
	  int result242 = 0;//P1^24,P3^2
	  int result144 = 0;//P1^14,P2^4,
	  int result74 = 0;//P1^74
	  int result2 = 0;
	  int result4 = 0;
	  int result14 = 0;
	  int result24 = 0;
	  while(it.hasNext()){
	  	int key = (int)it.next();
	  	if(primeCountList.get(key) >= 2){
	  		result2++;
	  	}
	  	if(primeCountList.get(key) >= 4){
	       result4++;
	    }
	    if(primeCountList.get(key) >= 14){
	       result14++;
	    }
	    if(primeCountList.get(key) >= 24){
	       result24++;
	    }
	    if(primeCountList.get(key) >= 74){
	       result74++;
	    }
	  }
	  result442 = (result4 * (result4 -1)) / 2 * (result2 -2);
	  result242 = result24 * (result2 -1);
  		result144 = result14 * (result4 -1);
  		myout(result442 + result242 + result144 + result74);
	}
	//Method addition frame start



	//Method addition frame end
}
