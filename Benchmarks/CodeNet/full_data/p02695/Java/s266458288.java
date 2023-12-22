import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int[] NM = readLineInt();
		int N = NM[0];
		int M = NM[1];
		int Q = NM[2];
		int[][] a = new int[Q][4];
		int ans = 0;
		int max_point = 0;
		for(int k=0;k<Q;k++) {
			a[k] = readLineInt();
			max_point+=a[k][3];
			a[k][0]--;
			a[k][1]--;
		}
		Arrays.sort(a,new Comparator<int[]>(){

			@Override
			public int compare(int[] o1,int[] o2){ // TODO 自動生成されたメソッド・スタブ
			return o1[0]-o2[0]; }
		});
		
		ArrayList<Pattern> kouho = new ArrayList<>();
		Pattern p_init = new Pattern(Q,N);
		p_init.max_point = max_point;
		Arrays.fill(p_init.decided,-1);
		p_init.decided[0] = 1;
		kouho.add(p_init);
		int now_max = 0;
		while(kouho.size()>0) {
			Pattern p = kouho.remove(0);
			if(p.point>now_max) {
				now_max = p.point;
			}
			if(p.max_point<=now_max) {
				continue;
			}
			for(int q=0;q<Q;q++) {
				if(!p.pattern_used[q]) {

					//do not use pattern
					Pattern p2 = new Pattern(p);
					p2.pattern_used[q] = true;
					//p2.pattern_type[q] = false;
					p2.max_point-=a[q][3];
					if(p2.max_point>now_max) {
						kouho.add(0,p2);
					}
					
					//use pattern
					if(p.decided[a[q][0]]!=-1) {
						if(p.decided[a[q][1]]==-1) {
							Pattern p1 = new Pattern(p);
							p1.pattern_used[q] = true;
							//p1.pattern_type[q] = true;
							p1.decided[a[q][1]] = p1.decided[a[q][0]]+a[q][2];
							p1.point+=a[q][3];
							kouho.add(0,p1);
						}else if(p.decided[a[q][1]] == p.decided[a[q][0]]+a[q][2]) {
							Pattern p1 = new Pattern(p);
							p1.pattern_used[q] = true;
							//p1.pattern_type[q] = true;
							p1.point+=a[q][3];
							kouho.add(0,p1);
						}
					}else if(p.decided[a[q][1]]!=-1) {
						if(p.decided[a[q][0]]==-1) {
							Pattern p1 = new Pattern(p);
							p1.pattern_used[q] = true;
							//p1.pattern_type[q] = true;
							p1.decided[a[q][0]] = p1.decided[a[q][1]]-a[q][2];
							p1.point+=a[q][3];
							kouho.add(0,p1);
						}else if(p.decided[a[q][0]] == p.decided[a[q][1]]-a[q][2]) {
							Pattern p1 = new Pattern(p);
							p1.pattern_used[q] = true;
							//p1.pattern_type[q] = true;
							p1.point+=a[q][3];
							kouho.add(0,p1);
						}
					}
					break;
				}
			}
		}
		
		print(now_max);
	}
	
	//functions here
	//note that all methods should be STATIC


	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	private static int[] sort(int[] base) {
		int[] copy = array_copy(base);
		Arrays.sort(copy);
		return copy;
	}
	private static int[] array_copy(int[] base) {
		int[] copy = new int[base.length];
		for(int i=0;i<base.length;i++) {
			copy[i] = base[i];
		}
		return copy;
	}
	private static int[] asArray(ArrayList<Integer> ints) {
		int[] intlist = new int[ints.size()];
		for(int i=0;i<intlist.length;i++) {
			intlist[i] = ints.get(i);
		}
		return intlist;
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
}

class Pattern{
	boolean[] pattern_used;
	//boolean[] pattern_type;
	int point;
	int max_point;
	int[] decided;
	
	
	public Pattern(int Q, int N){
		// TODO 自動生成されたコンストラクター・スタブ
		pattern_used = new boolean[Q];
		//pattern_type = new boolean[Q];
		decided = new int[N];
	}
	public Pattern(Pattern copy) {
		this.pattern_used = Arrays.copyOf(copy.pattern_used,copy.pattern_used.length);
		//this.pattern_type = Arrays.copyOf(copy.pattern_type,copy.pattern_type.length);
		this.point = copy.point;
		this.max_point = copy.max_point;
		this.decided = Arrays.copyOf(copy.decided,copy.decided.length);
	}
}
