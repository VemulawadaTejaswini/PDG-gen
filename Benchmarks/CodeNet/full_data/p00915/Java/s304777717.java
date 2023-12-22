import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main extends MyUtil{
	static int n;
	static long mod = 1L << 32;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n+m == 0) break; 
			
			int[] lant = new int[m+1];
			int[] rant = new int[m+1];
			for(int i = 1; i <= n; i++){
				char dir = sc.next().charAt(0);
				int x = sc.nextInt();
				
				if(dir =='R'){
					rant[x] = i;
				}else{
					lant[x] = i;
				}
			}
			// System.out.println(Arrays.toString(rant));
			// System.out.println(Arrays.toString(lant));
			// System.out.println();
			
			// ????????\??¬????????§???????§?
			int last_ant = 0;
			int cnt = 0;
			while(check(rant, lant)){
				cnt++;
				
				if(rant[m] != 0){
					last_ant = rant[m];
					rant[m] = 0;
				}
				
				for(int i = m-1; i >= 0; i--){
					rant[i+1] = rant[i];
					rant[i] = 0;
				}
				
				if(lant[0] != 0){
					last_ant = lant[0];
					lant[0] = 0;
				}
				for(int i = 1; i <= m; i++){
					if(lant[i] == 0) continue;
					if(rant[i-1] != 0){
						lant[i-1] = rant[i-1];
						rant[i-1] = lant[i];
						lant[i] = 0;
					}else{
						lant[i-1] = lant[i];
						lant[i] = 0;
					}
				}
				
				// System.out.println(Arrays.toString(rant));
				// System.out.println(Arrays.toString(lant));
				// System.out.println();
			}
			cnt--;
			System.out.println(cnt + " " + last_ant);
		}
		sc.close();
	}
	
	static boolean check(int[] a, int[] b){
		for(int i = 0; i < a.length; i++){
			if(a[i] != 0) return true;
			if(b[i] != 0) return true;
		}
		return false;
	}
}


class Node{
	static Node prev;
	// next??????????????????
	Node parent, child, next;
	int depth = 0;
	String name;
	
	public Node(String str){
		int i = 0;
		while(str.charAt(i) =='.')
			i++;
		depth = i;
		name = str.substring(i);
		
		while(prev != null){
			if(prev.depth == depth - 1)
				parent = prev;
			
			if(prev.depth == depth){
				prev.next = this;
				parent = prev.parent;
				break;
			}
			prev = prev.parent;
		}
		prev = this;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer(name);
		if(depth != 0){
			buf.insert(0, '+');
			if(parent.parent != null){
				parent.appendString(buf);
			}
		}
		return buf.toString();
	}
	
	public void appendString(StringBuffer buf){
		if(parent == null) return;

		if(next != null){
			buf.insert(0, '|');
		}else{
			buf.insert(0, ' ');
		}
		if(parent != null){
			parent.appendString(buf);
		}
	}
}

// --- ????????????????????????????????? ----------
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil {
	public static int toInt(boolean[] a){
		int pow = 1, ret = 0, l = a.length;
		for(int i = 0; i < l; i++){
			if(a[i]) ret += pow;
			pow *= 2;
		}
		return ret;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int ins[];
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int readIntMap(int i) throws Exception{
		if(i == 0) ins = readIntMap();
		return ins[i];
	}
	public static int[][] readIntMap(int n, int m) throws IOException{
		int[][] ret = new int[n][];
		for(int i = 0; i < n; i++) ret[i] = readIntMap();
		return ret;
	}
	public static int[] readIntToMap(int n) throws IOException{
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) ret[i] = readInt();
		return ret;
	}
	public static int[] readNoDistIntMap() throws IOException{
		String[] strs = readLine().split("");
		int l = strs.length;
		int[] ret = new int[l-1];
		for(int i = 1; i < l; i++)
			ret[i-1] = parseInt(strs[i]);
		return ret;
	}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static double[] parseDouble(String[] arr){
		double[] res = new double[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Double.parseDouble(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){res[i] = true;
			}else{res[i] = false;}
		}
		return res;
	}
	public static int parseInt(Object o){
		return Integer.parseInt(o.toString());
	}
}