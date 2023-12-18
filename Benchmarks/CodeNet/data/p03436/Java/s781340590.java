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
  ArrayList<Integer> one = nextIntArray();
  int H = one.get(0);
  int W = one.get(1);
  String[][] list = new String[H][W];
  boolean[][] visit = new boolean[H][W];
  for(var i = 0; i < H; i++){
    ArrayList<String> tmp = nextCharArray();
    for(int j = 0; j < W; j++){
      list[i][j] = tmp.get(j);
    }
    Arrays.fill(visit[i], false);
  }
  visit[0][0] = true;
  int goal = 10000000;
  ArrayDeque<Node> queue = new ArrayDeque<Node>();
  queue.add(new Node(0,0,0));
      int[] dy = {-1,0,1,0};
      int[] dx = {0,-1,0,1};
  while(queue.size() > 0){
    Node q = queue.pollFirst();
    int y = q.y;
    int x = q.x;
    int count = q.count;
    if(y == H - 1 && x == W - 1){
       goal = Math.min(goal, count);
    }
    for(int i = 0; i < dy.length; i++){
      int nextY = y + dy[i];
      int nextX = x + dx[i];
      if(nextY >= 0 && nextY < H && nextX >= 0 && nextX < W){
        if(list[nextY][nextX].equals(".") && !visit[nextY][nextX]){
          visit[nextY][nextX] = true;
          queue.addLast(new Node(nextY, nextX, count + 1));
        }
      }
    }
  }
  //goal + 1以外の点はすべて変換化
      myerr(goal);
  if(goal == 10000000){
     myout(-1);
  }else{
     int dot = 0;
     for(int i = 0; i < H; i++){
       for(int j = 0; j < W; j++){
         if(list[i][j].equals(".")){
            dot++;
         }
       }
     }
     dot -= (goal + 1);
    myout(dot);
  }
	}
	//Method addition frame start

static class Node{
  int x;
  int y;
  int count;
  Node(int y, int x, int count){
  	this.x = x;
    this.y = y;
    this.count = count;
  }
}

	//Method addition frame end
}
