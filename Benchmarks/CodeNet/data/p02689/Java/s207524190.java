import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
		int[] NM = readLineInt();
		int N = NM[0];
		int M = NM[1];
		int[] H = readLineInt();
		boolean[] good = new boolean[N];
		boolean[][] path = new boolean[N][];
		for(int i=0;i<N;i++) {
			path[i] = new boolean[N-i];
		}
		Arrays.fill(good,true);
		for(int m=0;m<M;m++) {
			int[] AB = readLineInt();
			int A = AB[0]-1;
			int B = AB[1]-1;
			if(A>B) {
				int c = A;
				A=B;
				B=c;
			}
			if(path[A][B-A]) {
				good[A]=good[B]=false;
			}else{
				if(H[A]<H[B]) {good[A]=false;}
				else if(H[B]<H[A]) {good[B]=false;}
				path[A][B-A] = true;
			}
		}
		int ans = 0;
		for(boolean gooda: good) {
			if(gooda) {ans++;}
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

class IntTreeNode extends TreeNode<Integer,Integer>{
	@Override
	public boolean finished(){
		return item>=0;
	}
	@Override
	public Integer nextItem(TreeVertex<Integer,Integer> v,TreeNode<Integer,Integer> n){
		return (v.item+this.item)%2;
	}
}

class TreeNode<V,E>{
	HashSet<TreeNode<V,E>> neighbor = new HashSet<>();
	HashSet<TreeVertex<V,E>> vertexes = new HashSet<>();
	V item;
	public void addNeighbor(TreeNode<V,E> neighbor, E item) {
		this.neighbor.add(neighbor);
		neighbor.neighbor.add(this);
		addVertex(neighbor,item);
		return;
	}
	public void addVertex(TreeNode<V,E> to, E item) {
		TreeVertex<V,E> v = new TreeVertex<>();
		v.item = item;
		v.node1 = this;
		v.node2 = to;
		this.vertexes.add(v);
		to.vertexes.add(v);
	}
	public TreeVertex<V,E> getVertexTo(TreeNode<V,E> node){
		for(TreeVertex<V,E> v : vertexes) {
			if(v.node1==this&&v.node2==node || v.node1==node&&v.node2==this) {
				return v;
			}
		}
		return null;
	}
	public boolean finished() {
		return true;
	}
	public V nextItem(TreeVertex<V,E> v, TreeNode<V,E> n) {
		return null;
	}
	public void dfs(V item) {
		this.item = item;
		for(TreeVertex<V,E> v : this.vertexes) {
			TreeNode<V,E> n = v.another(this);
			if(n.finished()) {continue;}
			n.dfs(nextItem(v,n));
		}
	}
	@Override
	public String toString(){
		return item.toString();
	}
}

class TreeVertex<V,E>{
	TreeNode<V,E> node1;
	TreeNode<V,E> node2;
	E item;
	public TreeNode<V,E> another(TreeNode<V,E> from){
		if(node1==from) {return node2;}
		else if(node2==from) {return node1;}
		else {return null;}
	}
	@Override
	public String toString(){
		return node1.toString()+"<- ["+item.toString()+"] ->"+node2.toString();
	}
}
