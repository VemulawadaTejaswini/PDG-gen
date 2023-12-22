import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	final static int MOD = 1000000000+7;
	static int[] read_line_int;
	static int read_line_int_ptr;
	static long[] read_line_long;
	static int read_line_long_ptr;
	static String[] read_line;
	static int read_line_ptr;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int N = readInt();
		int K = readInt();
		int[] minus = new int[N];
		int[] plus = new int[N];
		int minusptr = 0;
		int plusptr = 0;
		for(int i=0;i<N;i++) {
			int num = readInt();
			if(num>0) {
				plus[plusptr++] = -num;
			}else {
				minus[minusptr++] = num;
			}
		}
		int minuscnt = minusptr;
		int pluscnt = plusptr;
		Arrays.sort(minus);
		Arrays.sort(plus);
		for(minusptr=0;minusptr<minuscnt;minusptr++) {
			minus[minusptr]*=-1;
		}
		for(plusptr=0;plusptr<pluscnt;plusptr++) {
			plus[plusptr]*=-1;
		}
		if(pluscnt==0&&K%2==1) {
			int ans = -1;
			for(int i=0;i<K;i++) {
				ans = multMod(ans,minus[minuscnt-i-1],MOD);
			}
			print((MOD+ans)%MOD);
		}else {
			plusptr=K;
			minusptr=0;
			while(plusptr>pluscnt) {
				plusptr-=2; minusptr+=2;
			}
			while(plusptr>=2&&minusptr<=minuscnt-2) {
				long pluslost = (long)plus[plusptr-1]*plus[plusptr-2];
				long minusgain = (long)minus[minusptr]*minus[minusptr+1];
				if(pluslost>minusgain) {
					
					break;
				}
				plusptr-=2;
				minusptr+=2;
			}
			int ans = 1;
			for(int plust=0;plust<plusptr;plust++) {
				ans = multMod(ans,plus[plust],MOD);
			}
			for(int minust=0;minust<minusptr;minust++) {
				ans = multMod(ans,minus[minust],MOD);
			}
			print(ans);
		}
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static int multMod(int a, int b, int mod) {
		return (int)(((long)a*b)%mod);
	}

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
	private static int readInt() {
		if(read_line_int==null||read_line_int_ptr==read_line_int.length) {
			read_line_int = readLineInt();
			read_line_int_ptr=0;
		}
		return read_line_int[read_line_int_ptr++];
	}
	private static long readLong() {
		if(read_line_long==null||read_line_long_ptr==read_line_long.length) {
			read_line_long = readLineLong();
			read_line_long_ptr=0;
		}
		return read_line_long[read_line_long_ptr++];
	}
	private static String readString() {
		if(read_line==null||read_line_int_ptr==read_line.length) {
			read_line = readLine();
			read_line_ptr=0;
		}
		return read_line[read_line_ptr++];
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
	private static long[] readLineLong(){
		try{
			String[] s = readLine();
			long[] ints = new long[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Long.parseLong(s[i]);
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
