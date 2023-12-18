import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	final static char ZERO_CHAR = (char)'0';
	static int[] enp_array = null;
	static boolean[] enp_c = null;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String S = readLine()[0];
		char[] s = S.toCharArray();
		int prev = 0;
		int[] amari = new int[2019];
		enp_array = new int[s.length];
		enp_c = new boolean[s.length];
		for(int i=0;i<s.length;i++) {
			s[i]-=ZERO_CHAR;
		}
		long ans = 0;
		for(int i=s.length-1;i>=0;i--) {
			prev = (enp2019(s.length-i-1)*s[i]+prev)%2019;
			amari[prev]++;
		}
		ans+=amari[0]*(amari[0]+1);
		for(int a=1;a<2019;a++) {
			if(amari[a]>1) {
				ans+=amari[a]*(amari[a]-1);
			}
		}
		print(ans/2);
	}
	
	//functions here
	//note that all methods should be STATIC
	
	private static int enp2019(int n) {
		if(enp_c[n]) {return enp_array[n];}
		else {
			enp_c[n] = true;
			if(n==0) {
				return (enp_array[0] = 1);
			}else {
				return (enp_array[n] = (enp2019(n-1)*10)%2019);
			}
		}
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