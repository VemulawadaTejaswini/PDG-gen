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
		int[] dy = {-1, 0, 1, 0};
		int[] dx = {0, -1, 0, 1};
		ArrayList<Integer> one = nextIntArray();
		int H = one.get(0);
		int W = one.get(1);
		one = nextIntArray();
		int sy = one.get(0) - 1;
		int sx = one.get(1) - 1;
		one = nextIntArray();
		int ey = one.get(0) - 1;
		int ex = one.get(1) - 1;
		Node[][] list = new Node[H][W];
		for(int i = 0; i < H; i++){
			ArrayList<String> tmp = nextCharArray();
			for(int j = 0; j < W; j++){
				list[i][j] = new Node(tmp.get(j));
			}
		}
		int group = 0;
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(list[i][j].s.equals(".")){
					if(!list[i][j].access){
						list[i][j].group = group;
			        	group++;
			        	ArrayDeque<Integer[]> queue = new ArrayDeque<Integer[]>();
						list[i][j].access = true;
						Integer[] first = new Integer[]{i, j};
						queue.add(first);
						while(queue.size() > 0){
							Integer[] now = queue.pollFirst();
							int nowY = now[0];
							int nowX = now[1];
							for(int k = 0; k < dy.length; k++){
								int nextY = nowY + dy[k];
						        int nextX = nowX + dx[k];
						        if(nextY >= 0 && nextY < H && nextX >= 0 && nextX < W){
						          if(!list[nextY][nextX].access && list[nextY][nextX].s.equals(".")){
						          	Integer[] ne = new Integer[]{nextY, nextX};
						            queue.addLast(ne);
						            list[nextY][nextX].group = list[nowY][nowX].group;
						            list[nextY][nextX].access = true;
						          }
						        }
							}
						}
					}
			    }
			}
		}

		GroupNode[] groupList = new GroupNode[group];
		for(int i = 0; i < group; i++){
			groupList[i] = new GroupNode(i);
		}
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(list[i][j].s.equals(".")){
					for(int k = i - 2; k <= i + 2; k++){
						for(int l = j - 2; l <= j + 2; l++){
							if(k >= 0 && k < H && l >= 0 && l < W){
								if(list[k][l].s.equals(".") && list[k][l].group != list[i][j].group){
									groupList[list[k][l].group].child.add(list[i][j].group);
                					groupList[list[i][j].group].child.add(list[k][l].group);
								}
							}
						}
					}
				}
			}
		}
		ArrayDeque<GroupNode> groupQueue = new ArrayDeque<GroupNode>();
		groupQueue.add(groupList[list[sy][sx].group]);
		groupList[list[sy][sx].group].access = true;
		while(groupQueue.size() > 0){
			GroupNode nowGroup = groupQueue.pollFirst();
			if(nowGroup.no == list[ey][ex].group){
				myout(nowGroup.count);
				return;
			}
			Iterator child = nowGroup.child.iterator();
			while(child.hasNext()){
				int ne = (int)child.next();
				if(!groupList[ne].access){
					groupList[ne].access = true;
					groupList[ne].count = nowGroup.count + 1;
					groupQueue.addLast(groupList[ne]);
				}
			}
		}
		
		myout(-1);

	}
	//Method addition frame start

static class Node{
	String s;
	boolean access = false;
	int group = -1;
	Node(String s){
		this.s = s;
	}
}

static class GroupNode{
	int no;
	HashSet<Integer> child = new HashSet<Integer>();
	boolean access = false;
	int count = 0;
	GroupNode(int i){
		no = i;
	}
	public String toString(){
		return "{ child : " + child + ", count : " + count + ", no : " + no + "}";
	}
}

static void bfs(int y, int x){
	
}

	//Method addition frame end
}
