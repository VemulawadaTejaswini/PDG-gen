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
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		//int N = 20;
		//while(true) {
		//boolean[] on = new boolean[N];
		
			
		String s = readLine()[0];
		int N = s.length();
		boolean[] on = new boolean[N];
		boolean[] erased = new boolean[N];
		char[] cs = s.toCharArray();
		int oddsum = 0;
		int evensum = 0;
		for(int i=0;i<N;i++) {
			on[i] = cs[i]==(char)'1';
			//on[i] = Math.random()<0.5;
			if(on[i]) {
				if(i%2==0) {
					oddsum++;
				}else {
					evensum++;
				}
			}
		}
		int zerocnt = N-evensum-oddsum;
		int leftptr = -1;
		int lefteven = 0;
		int leftodd = 0;
		int lefterased = 0;
		int rightptr = N;
		int rightmost = N;
		int righton = 0;
		long ans = 0;
		for(int k=N;k>0;k--) {//k:left
			if(zerocnt==0) {break;}
			ans+=oddsum;
			if(oddsum<evensum) {
				for(leftptr++;leftptr<rightptr;leftptr++) {
					if(!erased[leftptr]&&!on[leftptr]) {break;}
					else {
						if((leftptr+lefterased)%2==0) {lefteven++;}else {leftodd++;}
					}
				}
				if(leftptr==rightptr) {
					print("ERR1");return;
				}
				erased[leftptr]=true;
				oddsum+= -lefteven+leftodd;
				evensum+= -leftodd+lefteven;
				int tmp = oddsum;
				oddsum = evensum;
				evensum = tmp;
				lefterased++;
			}else {
				for(rightptr--;leftptr<rightptr;rightptr--) {
					if(!erased[rightptr]&&!on[rightptr]) {break;}
					righton++;
				}
				if(leftptr==rightptr) {
					print("ERR2");return;
				}
				erased[rightptr]=true;
				if(rightptr==rightmost-1) {
					rightmost--;
				}else {
					if(righton%2==1) {
						if((rightptr+lefterased)%2==1) {
							oddsum--;evensum++;
						}else {
							oddsum++;evensum--;
						}
					}
				}
			}
			zerocnt--;
			/*
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<N;i++) {
				if(!erased[i]) {
					sb.append(on[i]?"1":"0");
				}
			}
			sb.append("   o").append(oddsum).append(" e").append(evensum);
			print(sb.toString());
			*/
		}
		if(oddsum==evensum) {
			
		}else if(oddsum==evensum+1) {
			ans+=oddsum;oddsum--;
		}else {
			print("ERR3");
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<N;i++) {
				sb.append(on[i]?"1":"0");
			}
			print(sb.toString());
			return;
		}
		ans+=oddsum*((long)oddsum+1);
		//}
		print(ans);
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
