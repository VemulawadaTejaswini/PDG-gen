import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	final static byte TYPE_AB = 0;
	final static byte TYPE_BC = 1;
	final static byte TYPE_AC = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int[] NABC = readLineInt();
		int N =NABC[0];
		int A =NABC[1];
		int B =NABC[2];
		int C =NABC[3];
		byte[] type = new byte[N];
		TreeNode root = new TreeNode();
		root.status = new int[] {A,B,C};
		for(int i=0;i<N;i++) {
			switch(readLine()[0]) {
				case "AB":
					type[i]=TYPE_AB;
					break;
				case "BC":
					type[i]=TYPE_BC;
					break;
				case "AC":
					type[i]=TYPE_AC;
					break;
				default:
					print("err "+i);
					return;
			}
		}
		try {
			print("Yes"+root.dfs(type,0));
		}catch(NoAnswerException e) {
			print("No");
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

class TreeNode{
	final static byte TYPE_AB = 0;
	final static byte TYPE_BC = 1;
	final static byte TYPE_AC = 2;
	final static String[] CHARS = new String[] {"A","B","C"};
	ArrayList<TreeNode> children = new ArrayList<>();
	TreeNode parent = null;
	int[] status = new int[3];
	int val = -1;
	public TreeNode(){
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	String dfs(byte[] type,int depth) throws NoAnswerException {
		if(depth==type.length) {
			return "";
		}
		int soeji1, soeji2;
		switch(type[depth]) {
			case TYPE_AB:
				soeji1=0;
				soeji2=1;
				break;
				
			case TYPE_BC:
				soeji1=1;
				soeji2=2;
				break;
				
			case TYPE_AC:
				soeji1=0;
				soeji2=2;
				break;
			
			default:
				return null;
		}

		if(status[soeji2]>0) {
			try {
				TreeNode tn = new TreeNode();
				tn.parent = this;
				tn.status = Arrays.copyOf(this.status,3);
				tn.status[soeji1]++;
				tn.status[soeji2]--;
				children.add(tn);
				return "\n"+CHARS[soeji1]+tn.dfs(type,depth+1);
			}catch(NoAnswerException e) {
				
			}
		}
		if(status[soeji1]>0) {
			try {
				TreeNode tn = new TreeNode();
				tn.parent = this;
				tn.status = Arrays.copyOf(this.status,3);
				tn.status[soeji1]--;
				tn.status[soeji2]++;
				children.add(tn);
				return "\n"+CHARS[soeji2]+tn.dfs(type,depth+1);
			}catch(NoAnswerException e) {
				
			}
		}
		throw new NoAnswerException();
	}
}

class NoAnswerException extends Exception{
	
}
