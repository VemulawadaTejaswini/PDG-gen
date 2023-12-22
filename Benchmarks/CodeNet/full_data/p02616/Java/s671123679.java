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
		Item[] items = new Item[N];
		boolean allMinus = true;
		int pluscnt = 0;
		int minuscnt = 0;
		for(int i=0;i<N;i++) {
			Item tmp = items[i] = new Item(readInt());
			if(tmp.minus) {
				minuscnt++;
			}else {
				pluscnt++;
			}
		}
		Arrays.sort(items,new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				// TODO Auto-generated method stub
				return o2.abs-o1.abs;
			}
			
		});
		if(pluscnt==0&&K%2==1) {
			int ans = -1;
			for(int i=0;i<K;i++) {
				ans = multMod(ans,items[N-i-1].abs);
			}
			print((MOD+ans)%MOD);
		}else {
			int minusSel = Math.min((K/2)*2, Math.max(0, (minuscnt/2)*2));
			int plusptr = -1;
			int minusptr = -1;
			for(int cnt=0;cnt<minusSel;cnt++) {
				do {minusptr++;}while(!items[minusptr].minus);
			}
			for(int cnt=0;cnt<K-minusSel;cnt++) {
				do {plusptr++;}while(items[plusptr].minus);
			}
			for(;minusptr>=0&&minusSel>=0;minusSel-=2) {
				long minusLost = items[minusptr].abs;
				do {minusptr--;}while(minusptr>=0&&!items[minusptr].minus);
				if(minusptr<0) {break;}
				minusLost*=items[minusptr].abs;
				do {minusptr--;}while(minusptr>=0&&!items[minusptr].minus);
				
				do {plusptr++;}while(plusptr<N&&items[plusptr].minus);
				if(plusptr>=N) {break;}
				long plusGain = items[plusptr].abs;
				do {plusptr++;}while(plusptr<N&&items[plusptr].minus);
				plusGain*=items[plusptr].abs;
				if(minusLost>plusGain||minusptr<0||plusptr>=N) {
					do {minusptr++;}while(minusptr<N&&!items[minusptr].minus);
					do {minusptr++;}while(minusptr<N&&!items[minusptr].minus);
					do {plusptr--;}while(plusptr>=0&&items[plusptr].minus);
					do {plusptr--;}while(plusptr>=0&&items[plusptr].minus);
					break;
				}
			}
			int ans = 1;
			for(int i=0;i<=minusptr||i<=plusptr;i++) {
				if(items[i].minus&&i<=minusptr) {
					ans = multMod(ans, items[i].abs);
				}
				if(!items[i].minus&&i<=plusptr) {
					ans = multMod(ans, items[i].abs);
				}
			}
			print(ans);
		}
		
	}
	
	//functions here
	//note that all methods should be STATIC
	private static int multMod(int a, int b) {
		return (int)(((long)a*b)%MOD);
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
class Item{
	public int abs;
	public boolean minus;
	Item(int num){
		if(num>0) {
			minus=false;
			abs = num;
		}else {
			minus = true;
			abs = -num;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (minus?"-":"")+abs;
	}
}
