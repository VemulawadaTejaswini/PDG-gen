import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;
import java.util.Queue;

/**
 * @author yoshikyoto
 */
class Main{
	static final boolean DEBUG = true;
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws Exception{
		String line;
		while((line = readLine()) != null)
			p(dfs(parseInt(line), 0));
	}
	
	public static int dfs(int n, int depth){
		if(n > 9 * (4 - depth)) return 0;
		if(n < 0) return 0;
		if(depth == 3) return 1;
		int res = 0;
		for(int i = 0; i < 10; i++){
			res += dfs(n - i, depth + 1);
		}
		return res;
	}

	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt(){return sc.nextInt();}
	public static void pa(Object[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(int[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(double[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(boolean[] arr){System.out.println(Arrays.toString(arr));}
	public static void p(Object o){System.out.println(o.toString());}
	public static void d(Object o){if(DEBUG)System.out.println(o.toString());}
	public static void da(int[] arr){if(DEBUG)System.out.println(Arrays.toString(arr));}
	public static void sort(int[] a){Arrays.sort(a);}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static int parseInt(Object o){return Integer.parseInt(o.toString());}
	public static int digit(int n){return String.valueOf(n).length();}
	public static String reverse(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
}

class MyHashMap<E> extends HashMap<E, Integer>{
	ArrayList<E> keyArray = new ArrayList<E>();
	public void add(E key){add(key, 1);}
	public void add(E key, Integer value){
		if(containsKey(key)){
			value += get(key);
		}else{
			keyArray.add(key);
		}
		put(key, value);
	}
}