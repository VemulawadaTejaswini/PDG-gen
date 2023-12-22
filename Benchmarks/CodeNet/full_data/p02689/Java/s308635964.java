import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
		int[] H = readLineInt();
		boolean[] good = new boolean[N];
		//HashSet<IntPair> used = new HashSet<>();
		Arrays.fill(good,true);
		for(int m=0;m<M;m++) {
			int[] AB = readLineInt();
			int A = AB[0]-1;
			int B = AB[1]-1;
			if(A>B) {
				int c = A;
				A=B;
				B=c;
			}
			IntPair p = new IntPair(A,B);
			/*if(used.contains(p)) {
				good[A]=good[B]=false;
			}else{*/
				if(H[A]<=H[B]) {good[A]=false;}
				if(H[B]<=H[A]) {good[B]=false;}
				//used.add(p);
			//}
		}
		int ans = 0;
		for(boolean gooda: good) {
			if(gooda) {ans++;}
		}
		print(ans);
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

class IntPair{
	final int a;
	final int b;
	public IntPair(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int hashCode(){ // TODO 自動生成されたメソッド・スタブ
	return (a+" "+b).hashCode(); }
	
	@Override
	public boolean equals(Object obj){ // TODO 自動生成されたメソッド・スタブ
		if(obj instanceof IntPair) {
			return this.a==((IntPair)obj).a&&this.b==((IntPair)obj).b; 
		}else {
			return false;
		}
	}
}
