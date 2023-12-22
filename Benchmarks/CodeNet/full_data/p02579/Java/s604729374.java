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
		one = nextIntArray();
		int sy = one.get(0) - 1;
		int sx = one.get(1) - 1;
		one = nextIntArray();
		int ey = one.get(0) - 1;
		int ex = one.get(1) - 1;
		String[][] list = new String[H][W];
		boolean[][] access = new boolean[H][W];
		for(int i = 0; i < H; i++){
			String s = next();
			Arrays.fill(access[i], false);
			for(int j = 0; j < W; j++){
				list[i][j] = s.substring(j, j + 1);
			}
		}
		int output = -1;
		ArrayDeque<Node> warpQueue = new ArrayDeque<Node>();
		warpQueue.add(new Node(sy, sx));
		int[] dy = {-1,0,1,0};
		int[] dx = {0,-1,0,1};
		access[sy][sx] = true;
		boolean isFirst = false;
		while(warpQueue.size() > 0 || !isFirst){
			Node warp = warpQueue.pollFirst();
			ArrayDeque<Node> queue = new ArrayDeque<Node>();
			if(access[warp.y][warp.x] && isFirst){
				continue;
			}else{
				queue.add(warp);
			}
			isFirst = true;
			output++;

			while(queue.size() > 0){
				Node now = queue.pollFirst();
				if(now.y == ey && now.x == ex){
					myout(output);
					return;
				}
				for(int i = 0; i < dy.length; i++){
					int nextY = now.y + dy[i];
					int nextX = now.x + dx[i];
					if(nextY >= 0 && nextY < H && nextX >= 0 && nextX < W){
			          if(!access[nextY][nextX]){
			            if(list[nextY][nextX].equals(".")){
			            	queue.addLast(new Node(nextY, nextX));
			                access[nextY][nextX] = true;
			            }
			          }
			        }
				}
				for(int i = now.y - 2; i <= now.y + 2; i++){
			        for(int j = now.x - 2; j <= now.x + 2; j++){
			          if(i >= 0 && i < H && j >= 0 && j < W){
			            if(list[i][j].equals(".") && !access[i][j]){
			              warpQueue.addLast(new Node(i, j));
			            }
			          }
			        }
			      }
			}
		}
		myout(-1);
	}
	//Method addition frame start

static class Node{
	int y;
	int x;
	Node(int y, int x){
		this.y = y;
		this.x = x;
	}
}

	//Method addition frame end
}
