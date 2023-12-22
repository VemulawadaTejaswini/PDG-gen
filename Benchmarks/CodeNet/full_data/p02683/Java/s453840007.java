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
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int[] NM = readLineInt();
		int N = NM[0];
		int M = NM[1];
		int X = NM[2];
		int[][] A = new int[N][M+1];
		for(int k=0;k<N;k++) {
			A[k] = readLineInt();
		}
		ArrayList<boolean[]> bits = getAllBits(N);
		int ans = Integer.MAX_VALUE;
		for(boolean[] bit : bits) {
			int[] algo = new int[M];
			int nowam = 0;
			for(int i=0;i<N;i++) {
				if(bit[i]) {
					for(int j=0;j<M;j++) {
						algo[j]+=A[i][j+1];
					}
					nowam+=A[i][0];
				}
			}
			boolean ok = true;
			for(int j=0;j<M;j++) {
				if(algo[j]<X) {
					ok = false;
					break;
				}
			}
			if(ok) {
				if(ans>nowam) {
					ans = nowam;
				}
			}
		}
		if(ans==Integer.MAX_VALUE) {
			print(-1);
		}else {
			print(ans);
		}
	}
	
	//functions here
	//note that all methods should be STATIC

	private static ArrayList<boolean[]> getAllBits(int length) {
		ArrayList<boolean[]> bits = new ArrayList<>();
		if(length==1) {
			bits.add(new boolean[] {false});
			bits.add(new boolean[] {true});
			return bits;
		}
		ArrayList<boolean[]> bits_t = getAllBits(length-1);
		for(boolean[] bits_tt : bits_t) {
			boolean[] bits_p = new boolean[bits_tt.length+1];
			bits_p[0] = false;
			for(int i=0;i<bits_tt.length;i++) {
				bits_p[i+1] = bits_tt[i];
			}
			bits.add(bits_p);
		}
		for(boolean[] bits_tt : bits_t) {
			boolean[] bits_p = new boolean[bits_tt.length+1];
			bits_p[0] = true;
			for(int i=0;i<bits_tt.length;i++) {
				bits_p[i+1] = bits_tt[i];
			}
			bits.add(bits_p);
		}
		return bits;
	}
	
	private static int pow(int base, int n) {
		if(n<=0) {return 1;}
		if(n==1) {return base;}
		return base*pow(base,n-1);
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
