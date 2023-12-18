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
	
static int x;
  static int y;
  static boolean isOK = false;
  static ArrayList<String> s;
	static void solve(){//Here is the main function
		s = nextCharArray();
      ArrayList<Integer> one = nextIntArray();
      x = one.get(0);
      y = one.get(1);
      //向きは0:+x, 1:+y, 2:-x, 3:-y
      dfs(0, 0, 0, 0, 0);
      if(isOK){
        myout("Yes");
      }else{
        myout("No");
      }
	}
	//Method addition frame start

static void dfs(int nowX, int nowY, int vec, int depth, int vecCount){
  if(depth == s.size()){
  	//myerr("x: " + nowX + ", y: " + nowY);
    if(x == nowX && y == nowY){
      isOK = true;
    }
    return;
  }
  if(isOK){
    return;
  }
  final int east = 0;
  final int north = 1;
  final int west = 2;
  final int south = 3;
  if(s.get(depth).equals("F")){
    switch(vec){
      case east:
	      if(vecCount != 0){
	      	if(vecCount % 2 == 0){
	      		dfs(nowX + 1, nowY, east, depth + 1, 0);
	      		dfs(nowX - 1, nowY, west, depth + 1, 0);
	      	}else{
	      		dfs(nowX, nowY + 1, north, depth + 1, 0);
	      		dfs(nowX, nowY - 1, south, depth + 1, 0);
	      	}
	      }else{
	      	dfs(nowX + 1, nowY, vec, depth + 1, 0);
	      }
        break;
      case north:
        if(vecCount != 0){
	      	if(vecCount % 2 == 0){
	      		dfs(nowX, nowY + 1, north, depth + 1, 0);
	      		dfs(nowX, nowY - 1, south, depth + 1, 0);
	      	}else{
	      		dfs(nowX + 1, nowY, east, depth + 1, 0);
	      		dfs(nowX - 1, nowY, west, depth + 1, 0);
	      	}
	      }else{
	      	dfs(nowX, nowY + 1, vec, depth + 1, 0);
	      }
        break;
      case 2:
	      if(vecCount != 0){
	      	if(vecCount % 2 == 0){
	      		dfs(nowX + 1, nowY, east, depth + 1, 0);
	      		dfs(nowX - 1, nowY, west, depth + 1, 0);
	      	}else{
	      		dfs(nowX, nowY + 1, north, depth + 1, 0);
	      		dfs(nowX, nowY - 1, south, depth + 1, 0);
	      	}
	      }else{
	      	dfs(nowX - 1, nowY, vec, depth + 1, 0);
	      }
        break;
      case 3:
        if(vecCount != 0){
	      	if(vecCount % 2 == 0){
	      		dfs(nowX, nowY + 1, north, depth + 1, 0);
	      		dfs(nowX, nowY - 1, south, depth + 1, 0);
	      	}else{
	      		dfs(nowX + 1, nowY, east, depth + 1, 0);
	      		dfs(nowX - 1, nowY, west, depth + 1, 0);
	      	}
	      }else{
	      	dfs(nowX, nowY - 1, vec, depth + 1, 0);
	      }
        break;
    }
  }else{
  	dfs(nowX, nowY, vec, depth + 1, vecCount + 1);
  }
}

	//Method addition frame end
}
