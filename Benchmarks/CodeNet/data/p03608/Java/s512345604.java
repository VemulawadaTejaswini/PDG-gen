import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = in.nextInt();
		int M = in.nextInt();
		int R = in.nextInt();
		Integer[] r = new Integer[R];
		HashMap<Integer,HashMap<Integer,Integer>> roadMap = new HashMap<>();;
		HashMap<Integer,Integer> sdMap = new HashMap<>();
		Integer[] sdList = new Integer[N];
		for(int i=0; i<R; i++){
			r[i] = in.nextInt()-1;
		}
		for(int i=0; i<M; i++) {
			Integer A = in.nextInt()-1;
			Integer B = in.nextInt()-1;
			Integer C = in.nextInt();
			setRoadMap(roadMap,A,B,C);
		}
		
		HashSet<Integer> visited = new HashSet<>();
		for(int ri=0; ri<R; ri++){
			Arrays.fill(sdList, Integer.MAX_VALUE);
			sdList[r[ri]]=0;
			for(int rj=ri+1; rj<R; rj++){
				getShortestDistance(sdList,roadMap,r[ri],r[rj],0);
				setShortestDistance(sdMap,r[ri],r[rj],sdList[r[rj]]);
			}
		}
		
		out.println(getShortestPath(sdMap,-1,r,visited,0,Integer.MAX_VALUE));
		out.flush();
	}
	
	private Integer getRoadMap(HashMap<Integer,HashMap<Integer,Integer>> map, int f, int t) {
		if(map.containsKey(f)){
			return map.get(f).get(t);
		}else{
			return null;
		}
	}
	
	private void setRoadMap(HashMap<Integer,HashMap<Integer,Integer>> map, int f, int t, int d) {
		setRoadMapSub(map,f,t,d);
		setRoadMapSub(map,t,f,d);
	}
	
	private void setRoadMapSub(HashMap<Integer,HashMap<Integer,Integer>> map, int f, int t, int d) {
		HashMap<Integer,Integer> m = null;
		if(map.containsKey(f)){
			m = map.get(f);
		}else{
			m = new HashMap<>();
		}
		m.put(t, d);
		map.put(f, m);
	}
	
	private int packIntPair(int f, int t) {
		int tmp;
		if(f>t){
			tmp=f;f=t;t=tmp;
		}
		tmp = f*1000+t;
		return tmp;
	}
	private void setShortestDistance(HashMap<Integer,Integer> sdMap, Integer f, Integer t, int sd ) {
		sdMap.put(packIntPair(f,t),sd);
	}
	private int getShortestDistance(HashMap<Integer,Integer> sdMap, Integer f, Integer t) {
		return sdMap.get(packIntPair(f,t));
	}
	
	
	private void getShortestDistance(Integer[] sdList,HashMap<Integer,HashMap<Integer,Integer>> map, Integer now, Integer t, int nowDistance){
		if(now!=t){
			for(Integer next : map.get(now).keySet()) {
				int nextDistance = nowDistance + getRoadMap(map,now,next);
				if(sdList[next] <= nextDistance)
					continue;
				sdList[next] = nextDistance;
				getShortestDistance(sdList,map,next,t,nextDistance);
			}
		}
	}

	
	private int getShortestPath(HashMap<Integer,Integer> sdMap, Integer lastVisited, Integer[] r, HashSet<Integer> visited, int path, int minPath) {
		if(visited.size()<r.length){
			for(int i=0; i<r.length; i++){
				if(visited.contains(r[i]))
					continue;
				int nextVisit = r[i];
				int nextPath = path;
				if(lastVisited != -1){
					nextPath += getShortestDistance(sdMap,lastVisited,nextVisit);
				}
				if(path<minPath){
					visited.add(nextVisit);
					minPath = Math.min(getShortestPath(sdMap,nextVisit,r,visited,nextPath,minPath),minPath);
					visited.remove(nextVisit);
				}
			}
			return minPath;
		}
		else{
			return Math.min(path, minPath);
		}
	}
	
}

class NoOrderDataBean2 implements Comparable<NoOrderDataBean2> {
	int a;
	int b;
	
	public NoOrderDataBean2(int a, int b){
		this.a = Math.min(a, b);
		this.b = Math.max(a, b);
	}
	
	@Override
	public int compareTo(NoOrderDataBean2 o) {
		int ret = 0;
		if(this.equals(o))
			ret = 0;
		else{
			ret = Integer.compare(this.a, o.a);
			if(ret == 0)
				ret = Integer.compare(this.b, o.b);
		}
		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoOrderDataBean2 other = (NoOrderDataBean2) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
}


class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}