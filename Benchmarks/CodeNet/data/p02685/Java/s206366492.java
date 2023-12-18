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
	final static int DIV = 998244353;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		
		int[] NMK = readLineInt();
		int N = NMK[0];
		int M = NMK[1];
		int K = NMK[2];
		
		int[] dpb = new int[K+1];
		int[] dp = new int[K+1];
		
		dp[K] = dpb[K] = M;
		for(int i=1;i<N;) {
			for(int k=K;k>=0;k--) {
				dp[k] = mult(dpb[k],M-1);
				if(k!=K) {dp[k] = add(dp[k],dpb[k+1]);}
			}
			i++;
			if(i==N) {
				int ans = 0;
				for(int k=K;k>=0;k--) {
					ans = add(ans,dp[k]);
				}
				print(ans);
				return;
			}
			for(int k=K;k>=0;k--) {
				dpb[k] = mult(dp[k],M-1);
				if(k!=K) {dpb[k] = add(dpb[k],dp[k+1]);}
			}
			i++;
			if(i==N) {
				int ans = 0;
				for(int k=K;k>=0;k--) {
					ans = add(ans,dpb[k]);
				}
				print(ans);
				return;
			}
		}
		
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	
	private static int add(int a, int b) {
		return ((a%DIV)+(b%DIV))%DIV;
	}
	private static int mult(int a, int b) {
		return (int)(((long)(a%DIV)*(b%DIV))%DIV);
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
