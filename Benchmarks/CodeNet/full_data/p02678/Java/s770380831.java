import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
		
		int[] A = new int[M];
		int[] B = new int[M];
		ArrayList<IntTreeNode> tn = new ArrayList<>();
		for(int n=0;n<N;n++) {
			IntTreeNode tnp = new IntTreeNode();
			tnp.item = new Integer[] {-1,-1,n};
			tn.add(tnp);
		}
		for(int i=0;i<M;i++) {
			int[] uvw = readLineInt();//vertex info
			int u = uvw[0]-1;
			int v = uvw[1]-1;
			int w = 1;
			if(u>v) {
				int tmp = u;
				u = v;
				v = tmp;
			}
			tn.get(v).addNeighbor(tn.get(u),w);
		}
		tn.get(0).item[0] = 0;
		tn.get(0).item[1] = -1;
		ArrayList<TreeNode<Integer[],Integer>> checking = new ArrayList<>();
		checking.add(tn.get(0));
		while(!checking.isEmpty()) {
			TreeNode<Integer[],Integer> tnc = checking.remove(0);
			for(TreeNode<Integer[],Integer> v : tnc.neighbor) {
				if(v.item[0]==-1) {
					v.item[0] = tnc.item[2];
					v.item[1] = tnc.item[1]+1;
					checking.add(v);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		try {
			Iterator<IntTreeNode> tni = tn.iterator();
			tni.next();
			for(int i=1;i<N;i++) {
				IntTreeNode tt = tni.next();
				if(tt.item[0]==-1) {throw new Exception();}
				sb.append(tt.item[0]+1).append("\n");
			}
			print("Yes");
			print(sb.toString().trim());
		}catch(Exception e) {
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

/**
 * 
	//templates to be written in Main.main()
	int N;//node count
	ArrayList<IntTreeNode> tn = new ArrayList<>();
	for(int n=0;n<N;n++) {
		IntTreeNode tnp = new IntTreeNode();
		tnp.item = -1;
		tn.add(tnp);
	}
	for(int i=1;i<N;i++) {
		int[] uvw = readLineInt();//vertex info
		int u = uvw[0]-1;
		int v = uvw[1]-1;
		int w = uvw[2];
		if(u>v) {
			int tmp = u;
			u = v;
			v = tmp;
		}
		tn.get(v).addNeighbor(tn.get(u),w);
	}
 * @author yuta-pc
 *
 */


class IntTreeNode extends TreeNode<Integer[],Integer>{
	@Override
	public boolean finished(){
		return false;
	}
	//@Override
	/*public Integer[] nextItem(TreeVertex<Integer[],Integer> v,TreeNode<Integer[],Integer> n){
		return (v.item+this.item)%2;
	}*/
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


