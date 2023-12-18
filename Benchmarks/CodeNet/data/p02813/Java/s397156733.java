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
      ArrayList<String> alist = nextStrArray();
      ArrayList<String> blist = nextStrArray();
      String p = "";
      String q = "";
      String one = "";
      for(int i = 0; i < N; i++){
        p += alist.get(i);
        q += blist.get(i);
        one += String.valueOf(i + 1);
      }
      int L = -1;
      int R = -1;
      int count = 0;
      if(one.equals(p)){
        L = count;
      }
      if(one.equals(q)){
        R = count;
      }
      while(!one.equals("Final")){
        one = nextPermutation(one);
        count++;
        if(one.equals(p)){
          L = count;
        }
        if(one.equals(q)){
          R = count;
        }
      }
      myout(Math.abs(L - R));
	}
	//Method addition frame start

static String nextPermutation(String s){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) list.add(s.charAt(i));
        int pivotPos = -1;
        char pivot = 0;
        for (int i = list.size() - 2; i >= 0; i--) {
                if (list.get(i) < list.get(i + 1)) {
                        pivotPos = i;
                        pivot = list.get(i);
                        break;
                }
        }
        //s自身が辞書順ですでに一番小さい場合
        if (pivotPos == -1 && pivot == 0) return "Final";
        int L = pivotPos + 1;
        int R = list.size() - 1;
        int minPos = -1;
        char min = Character.MAX_VALUE;
        for (int i = R; i >= L; i--) {
                if (pivot < list.get(i) && list.get(i) < min) {
                         min = list.get(i);
                         minPos = i;
                }
        }
        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R+1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) sb.append(list.get(i));
        return sb.toString();
}

	//Method addition frame end
}
