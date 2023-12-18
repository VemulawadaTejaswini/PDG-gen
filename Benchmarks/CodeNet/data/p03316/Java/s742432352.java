
//template
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	private static final int HUNDRED = 100;
	public static void main(String[] args) throws IOException{
		
		String s=in.readLine();
		long n=Long.parseLong(s);
		long se=0;
		for(int i=0;i<s.length();i++) {
			se+=Long.parseLong(s.charAt(i)+"");
		}
		if(n%se==0) out.append("Yes");
		else out.append("No");
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
	private static int[] readInts() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}
	private static long[] readLongs() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	}
	private static long readLong() throws IOException {
		return Long.parseLong(in.readLine());
	}
	 
}
class Team{
	int id;
	LinkedList<Team> weekAdj;
	LinkedList<Team> strongAdj;
	public Team(int id) {
		this.id=id;
		weekAdj=new LinkedList<Team>();
		strongAdj=new LinkedList<Team>();
	}
	public void add(Team team) {
		if(weekAdj.remove(team))
			strongAdj.add(team);
		else
			weekAdj.add(team);
	}
}