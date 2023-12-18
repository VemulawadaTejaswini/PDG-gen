import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = true;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int Q = readLineInt()[0];
		long[][] abcds = new long[Q][];
		for(int i=0;i<Q;i++) {
			abcds[i] = readLineLong();
		}
		for(int i=0;i<Q;i++) {
			long[] abcd = abcds[i];
			Pos p1 = new Pos(abcd[0]-1,abcd[1]-1);
			Pos p2 = new Pos(abcd[2]-1,abcd[3]-1);
			int clv = getCommonLv(p1,p2);
			long step = 0;
			
			for(int l=1;l<clv;l++) {
				int xx1 = (int)(p1.x%3);
				int yy1 = (int)(p1.y%3);
				int xx2 = (int)(p2.x%3);
				int yy2 = (int)(p2.y%3);
				int d1 = getDirFromXXYY(xx1,yy1);
				int d1p = getDirFT(p1,p2);
				step += getMinLength(l,d1,d1p);
				int d2p = getDirFT(p2,p1);
				int d2 = getDirFromXXYY(xx2,yy2);
				step += getMinLength(l,d2p,d2);
				if(d1p%2==0) {step-=2;}//真ん中に寄る件の対策
				p1.abst();
				p2.abst();
			}
			int xx1 = (int)(p1.x%3);
			int yy1 = (int)(p1.y%3);
			int xx2 = (int)(p2.x%3);
			int yy2 = (int)(p2.y%3);
			int d1 = getDirFromXXYY(xx1,yy1);
			int d2 = getDirFromXXYY(xx2,yy2);
			step += getMinLength(clv,d1,d2);
			print(step);
		}
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	
	//from,to
	/*
	 *  7 6 5
	 *  8 X 4
	 *  1 2 3
	 * */
	
	private static int getCommonLv(Pos p1,Pos p2) {
		long p1x = p1.x;
		long p1y = p1.y;
		long p2x = p2.x;
		long p2y = p2.y;
		
		for(int lv = 0;lv<=20;lv++) {
			if(p1x==p2x && p1y==p2y) {
				return lv;
			}else {
				p1x/=3;
				p1y/=3;
				p2x/=3;
				p2y/=3;
			}
		}
		return -1;
	}
	
	private static long getMinLength(int lv, int from, int to) {
		if(from>2) {
			to -= (from-1)/2*2;
			from -= (from-1)/2*2;
			if(to<=0) {to+=8;}
		}
		switch(from) {
			case 1:
				if(to==1) {return 0;}
				else if(to==2||to==8) {return 1;}
				else if(to==3||to==7) {return pow(3,lv-1)+1;}
				else if(to==4||to==6) {return pow(3,lv-1)+2;}
				else {return pow(3,lv-1)*2+2;}
			case 2:
				if(to==2) {return 0;}
				else if(to==1||to==3) {return 1;}
				else if(to==8||to==4) {return 2;}
				else if(to==7||to==5) {return pow(3,lv-1)+2;}
				else {return pow(3,lv-1)+3;}
			default:
				return -1;//err
		}
	}
	
	private static int getDirFT(Pos from, Pos to) {
		long dx=to.x-from.x;
		long dy=to.y-from.y;
		if(dx<0) {
			if(dy<0) {return 7;}
			else if(dy==0) {return 8;}
			else {return 1;}
		}
		else if(dx>0) {
			if(dy<0) {return 5;}
			else if(dy==0) {return 4;}
			else {return 3;}
		}else {
			if(dy<0) {return 6;}
			else if(dy==0) {return -1;}//err
			else {return 2;}
		}
	}
	
	public int getDirRev(int dir) {
		return (dir+4)%8;
	}
	
	private static int getDirFromXXYY(int xx, int yy) {
		switch(yy) {
			case 2:
				return xx+1;
			case 1:
				return 8-xx*2;
			case 0:
				return 7-xx;
			default:
				return 5;//err
		}
	}
	
	private static long pow(long base, long exp) {
		if(exp<=0) {return 1;}
		if(exp==1) {return base;}
		else {return base*pow(base,exp-1);}
	}

	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
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
	public long x;
	public long y;
	Pos(long x, long y){
		this.x = x;
		this.y = y;
	}
	public void abst() {
		this.x/=3;
		this.y/=3;
	}
}