import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
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
		int H = readInt();
		int W = readInt();
		int Ch = readInt()-1;
		int Cw = readInt()-1;
		int Dh = readInt()-1;
		int Dw = readInt()-1;
		int[][] map = new int[H][];
		for(int h=0;h<H;h++) {
			map[h] = new int[W];
			char[] cs = readLine()[0].toCharArray();
			for(int w=0;w<W;w++) {
				map[h][w] = cs[w]=='#'?-2:Integer.MAX_VALUE;
			}
		}
		int ptr = 0;
		int seccnt = 0;
		LinkedHashSet<Pos> fr = new LinkedHashSet<>();
		fr.add(new Pos(Cw,Ch));
		map[Ch][Cw]=0;
		while(!fr.isEmpty()) {
			Pos p = fr.iterator().next();
			fr.remove(p);
			int nowscore = map[p.y][p.x];
			if(p.x>0) {
				if(map[p.y][p.x-1]!=-2&&map[p.y][p.x-1]>nowscore) {
					map[p.y][p.x-1] = nowscore;
					fr.add(new Pos(p.x-1,p.y));
				}
			}
			if(p.y>0) {
				if(map[p.y-1][p.x]!=-2&&map[p.y-1][p.x]>nowscore) {
					map[p.y-1][p.x] = nowscore;
					fr.add(new Pos(p.x,p.y-1));
				}
			}
			if(p.x<W-1) {
				if(map[p.y][p.x+1]!=-2&&map[p.y][p.x+1]>nowscore) {
					map[p.y][p.x+1] = nowscore;
					fr.add(new Pos(p.x+1,p.y));
				}
			}
			if(p.y<H-1) {
				if(map[p.y+1][p.x]!=-2&&map[p.y+1][p.x]>nowscore) {
					map[p.y+1][p.x] = nowscore;
					fr.add(new Pos(p.x,p.y+1));
				}
			}
			for(int x=Math.max(0,p.x-2);x<=Math.min(W-1,p.x+2);x++) {
				for(int y=Math.max(0,p.y-2);y<=Math.min(H-1,p.y+2);y++) {
					if(map[y][x]!=-2&&map[y][x]>nowscore+1) {
						map[y][x] = nowscore+1;
						fr.add(new Pos(x,y));
					}
				}
			}
		}
		if(map[Dh][Dw]>=0&&map[Dh][Dw]!=Integer.MAX_VALUE) {
			print(map[Dh][Dw]);
		}else {
			print("-1");
		}
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

class Pos{
	public int x,y;
	
	public Pos(int x, int y){this.x=x;this.y=y;}
}
