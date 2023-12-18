import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int Q = readLineInt()[0];
		ArrayList<Integer> a = new ArrayList<>();
		long asum = 0;
		int refreshCount = 0;
		long bsum = 0;
		StringBuilder sb = new StringBuilder();
		for(int q = 0;q<Q; q++) {
			int[] qs = readLineInt();
			if(qs[0]==1) {
				//更新クエリ
				asum+=qs[1];
				insert(a,qs[1]);
				bsum+=qs[2];
				refreshCount++;
			}else {
				//求値クエリ
				double amean = (double)asum/refreshCount;
				Iterator<Integer> ai = a.iterator();
				int n = a.get(refreshCount/2);
				/*for(n = ai.next();ai.hasNext();n = ai.next()) {
					if(n<=amean) {break;}
				}*/
				long f = F(a,n,bsum);
				sb.append(n).append(" ").append(f).append("\n");
			}
		}
		print(sb.toString().trim());
	}
	
	//functions here
	//note that all methods should be STATIC
	private static void insert(ArrayList<Integer> a, int val) {
		if(a.size()==0||a.get(a.size()-1)>=val) {
			a.add(val);
			return;
		}
		for(int i=a.size()-1;i>=0;i--) {
			if(a.get(i)<val) {
				a.add(i,val);
				return;
			}
		}
		return;
	}
	
	private static long F(ArrayList<Integer> a, int n, long b) {
		long sum = b;
		Iterator<Integer> ai = a.iterator();
		for(int nn = ai.next();ai.hasNext();n = ai.next()) {
			sum += Math.abs(nn-n);
		}
		return sum;
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


