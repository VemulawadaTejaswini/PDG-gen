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
	static int[] DAYS;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int[] NKC = readLineInt();
		final int N = NKC[0];
		final int K = NKC[1];
		final int C = NKC[2];
		
		char[] days_chars = readLine()[0].toCharArray();
		int cnt = 0;
		for(char c : days_chars) {
			if(c=='o') {cnt++;}
		}
		DAYS = new int[cnt];
		cnt = 0;
		for(int i=0;i<days_chars.length;i++) {
			if(days_chars[i]=='o') {
				DAYS[cnt] = i;
				cnt++;
			}
		}
		int DL = DAYS.length;
		boolean[][][] dft = new boolean[K][DL][DL];//dft[出勤回数][ノードfrom][ノードto]
		boolean[][] active = new boolean[K][DL];//active[出勤回数][ノード]
		//dft[0]
		for(int t=0;t<DL;t++) {
			dft[0][0][t] = true;
		}
		for(int d=1;d<K;d++) {
			for(int f=0;f<DL;f++) {
				boolean found = false;
				for(int ff=f;ff>=0;ff--) {
					if(dft[d-1][ff][f]) {
						found = true;
						break;
					}
				}
				if(!found) {continue;}
				for(int t=f+1;t<DL;t++) {
					if(DAYS[f]<DAYS[t]-C) {
						for(int tt=t;tt<DL;tt++) {
							dft[d][f][tt] = true;
							active[d][tt] = true;
						}
						break;
					}
				}
			}
		}
		for(int d=K-1;d>0;d--) {
			for(int f=DL-1;f>=0;f--) {
				boolean found = false;
				for(int t=f+1;t<DL;t++) {
					if(dft[d][f][t]&&active[d][t]) {
						found = true;
						break;
					}
				}
				if(!found) {
					for(int ff = f-1; ff>=0; ff--) {
						dft[d-1][ff][f] = false;
					}
					active[d-1][f] = false;
				}
			}
		}
		
		for(int d=0;d<K;d++) {
			printd("Day "+d);
			StringBuilder sbt = new StringBuilder("a:");
			for(int t=0;t<DL;t++) {
				sbt.append((active[d][t])?"o":" ");
			}
			printd(sbt.toString());
			for(int f=0;f<DL;f++) {
				StringBuilder sb = new StringBuilder(f+":");
				for(int t=0;t<DL;t++) {
					sb.append((dft[d][f][t])?"o":" ");
				}
				printd(sb.toString());
			}
		}
		
		int last_start = DL-1;
		int first_fin = 0;
		boolean foundt = false;
		for(int t=DL-1;t>=0;t--) {
			if(dft[0][0][t]) {
				last_start = t;
				foundt = true;
				break;
			}
		}
		foundt = false;
		for(int t=0;t<DL;t++) {
			for(int f=t-1;f>=0;f--) {
				if(dft[K-1][f][t]) {
					first_fin = t;
					foundt = true;
					break;
				}
			}
			if(foundt) {break;}
		}
		
		for(int T=last_start;T<=first_fin;T++) {
			boolean found = false;
			for(int d=0;d<K;d++) {
				for(int f=T-1;f>=0;f--) {
					for(int t=T+1;t<DL;t++) {
						if(dft[d][f][t]) {
							found = true;
							break;
						}
					}
					if(found) {break;}
				}
				if(found) {break;}
			}
			if(!found) {print(DAYS[T]+1);}
		}
		
		
		
		//String[] s = readLine();
		//print(num);
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
