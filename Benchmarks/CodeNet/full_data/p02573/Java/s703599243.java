import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
		int gencnt = 0;
		int concatcnt = 0;
		
		
		int N = readInt();
		int M = readInt();
		int[] netsize = new int[N];
		Person[] personsP = new Person[N];
		for(int i=0;i<N;i++) {
			personsP[i] = new Person();
			personsP[i].g = null;
		}
		Group[] groupsP = new Group[N];
		Group[] groups = new Group[N];
		int groupptr = 0;
		for(int m=0;m<M;m++) {
			int A = readInt()-1;
			int B = readInt()-1;
			if(A>B) {int c=A;A=B;B=c;}
			if(personsP[A].g==null&&personsP[B].g==null) {
				Group g = new Group();
				g.persons.add(personsP[A]);
				g.persons.add(personsP[B]);
				personsP[A].g = g;
				personsP[B].g = g;
				groups[groupptr++] = g;
				gencnt++;
			}else if(personsP[A].g==null) {
				personsP[B].g.persons.add(personsP[A]);
				personsP[A].g = personsP[B].g;
			}else if(personsP[B].g==null) {
				personsP[A].g.persons.add(personsP[B]);
				personsP[B].g = personsP[A].g;
			}else if(personsP[A].g!=personsP[B].g) {
				//concat
				personsP[A].g.persons.addAll(personsP[B].g.persons);
				for(Person p : personsP[B].g.persons) {
					p.g = personsP[A].g;
				}
				personsP[B].g.persons.clear();
				personsP[B].g = null;
				concatcnt++;
			}
		}
		int ans = 1;
		for(Group g : groups) {
			if(g==null) {continue;}
			ans = Math.max(g.persons.size(),ans);
		}
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

class Group{
	HashSet<Person> persons = new HashSet<>();
}
class Person{
	Group g;
}
