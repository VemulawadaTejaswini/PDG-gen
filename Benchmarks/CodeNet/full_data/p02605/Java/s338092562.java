import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	static int[] read_line_int;
	static int read_line_int_ptr;
	static long[] read_line_long;
	static int read_line_long_ptr;
	static String[] read_line;
	static int read_line_ptr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int N = readInt();
		
		ArrayList<ArrayList<Plane>> xlist = new ArrayList<>(200001);
		ArrayList<ArrayList<Plane>> ylist = new ArrayList<>(200001);
		for(int i=0;i<200001;i++) {
			xlist.add(new ArrayList<>());
			ylist.add(new ArrayList<>());
		}
		
		for(int n=0;n<N;n++) {
			String[] tmp = readLine();
			int x = Integer.parseInt(tmp[0]);
			int y = Integer.parseInt(tmp[1]);
			Dir u;
			switch(tmp[2]) {
				case "U":
					u = Dir.U;break;
				case "R":
					u = Dir.R;break;
				case "D":
					u = Dir.D;break;
				case "L":
					u = Dir.L;break;
				default:
					print("Err");u = Dir.U;break;
			}
			xlist.get(x).add(new Plane(new Pos(x,y),u));
			ylist.get(y).add(new Plane(new Pos(x,y),u));
		}
		
		Plane[][] xlista = new Plane[200001][];
		Plane[][] ylista = new Plane[200001][];
		for(int i=0;i<200001;i++) {
			xlista[i] = xlist.get(i).toArray(new Plane[xlist.get(i).size()]);
			ylista[i] = ylist.get(i).toArray(new Plane[ylist.get(i).size()]);
			Arrays.sort(xlista[i], new Comparator<Plane>(){

				@Override
				public int compare(Plane o1,Plane o2){ 
				return o1.p.y - o2.p.y; }
			});
			Arrays.sort(ylista[i], new Comparator<Plane>(){

				@Override
				public int compare(Plane o1,Plane o2){ 
				return o1.p.x - o2.p.x; }
			});
		}
		
		long ans = Long.MAX_VALUE;
		for(int x=0;x<200001;x++) {
			Plane[] xlistn = xlista[x];
			for(int pid = 0; pid<xlistn.length; pid++) {
				Plane p = xlistn[pid];
				if(p.u==Dir.U) {
					for(int yd=1;yd+p.p.y<200001;yd++) {
						for(Plane pc : ylista[yd+p.p.y]) {
							if(pc.p.x==p.p.x-yd && pc.u==Dir.R) {
								ans = Math.min(ans,yd*10);break;
							}else if(pc.p.x==p.p.x+yd && pc.u==Dir.L) {
								ans = Math.min(ans,yd*10);break;
							}
						}
					}
					if(pid<xlistn.length-1&&xlistn[pid+1].u==Dir.D) {
						ans = Math.min(ans,(xlistn[pid+1].p.y-p.p.y)*5);
					}
				}else if(p.u==Dir.D) {
					for(int yd=-1;yd+p.p.y>=0;yd--) {
						for(Plane pc : ylista[yd+p.p.y]) {
							if(p.p.x==pc.p.x-yd && pc.u==Dir.R) {
								ans = Math.min(ans,-yd*10);break;
							}else if(p.p.x==pc.p.x+yd && pc.u==Dir.L) {
								ans = Math.min(ans,-yd*10);break;
							}
						}
					}
					/*if(pid>0&&xlistn[pid-1].u==Dir.U) {
						ans = Math.min(ans,(-xlistn[pid-1].p.y+p.p.y)*5);
					}*/
				}
			}
		}
		for(int y=0;y<200001;y++) {
			Plane[] ylistn = ylista[y];
			for(int pid = 0; pid<ylistn.length; pid++) {
				Plane p = ylistn[pid];
				if(p.u==Dir.R) {
					for(int xd=1;xd+p.p.x<200001;xd++) {
						for(Plane pc : xlista[xd+p.p.x]) {
							if(pc.p.y==p.p.y-xd && pc.u==Dir.U) {
								ans = Math.min(ans,xd*10);break;
							}else if(pc.p.y==p.p.y+xd && pc.u==Dir.D) {
								ans = Math.min(ans,xd*10);break;
							}
						}
					}
					if(pid<ylistn.length-1&&ylistn[pid+1].u==Dir.L) {
						ans = Math.min(ans,(ylistn[pid+1].p.x-p.p.x)*5);
					}
				}else if(p.u==Dir.L) {
					for(int xd=-1;xd+p.p.x>=0;xd--) {
						for(Plane pc : xlista[xd+p.p.x]) {
							if(p.p.y==pc.p.y-xd && pc.u==Dir.U) {
								ans = Math.min(ans,-xd*10);break;
							}else if(p.p.y==pc.p.y+xd && pc.u==Dir.D) {
								ans = Math.min(ans,-xd*10);break;
							}
						}
					}
					/*if(pid>0&&ylistn[pid-1].u==Dir.R) {
						ans = Math.min(ans,(-ylistn[pid-1].p.x+p.p.x)*5);
					}*/
				}
			}
		}
		
		if(ans<Long.MAX_VALUE) {
			print(ans);
		}else {
			print("SAFE");
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

class Plane{
	public Dir u;
	public Pos p;
	
	public Plane(Pos p, Dir u){ this.p = p; this.u = u; }
}

class Pos{
	public int x,y;
	public Pos(int x, int y) {this.x = x;this.y = y;}
}

enum Dir{
	U,R,D,L
}