import java.util.Scanner;


public class _1001_BinaryTreeIntersectionAndUnion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int order = scan.next().equals("i") ? 0 : 1;

			boolean[] tree1 = decode(scan.next());
			boolean[] tree2 = decode(scan.next());
			print(tree1,tree2,order);
		}
	}

	public static boolean[] decode(String str){
		boolean[] tree = new boolean[101];
		int pos = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='('){
				tree[pos]=true;
				pos = pos*2+1;
			}
			if(ch==','){
				pos = pos+1;
			}
			if(ch==')'){
				pos = (pos-1)/2;
			}
		}
		return tree;
	}

	public static Tree[] tr;

	public static void print(boolean[] tree1,boolean[] tree2,int order){
		tr = new Tree[101];
		for (int i = 0; i < 101; i++) {
			boolean a = tree1[i];
			boolean b = tree2[i];
			boolean leaf = order==0 ? (a && b) : (a || b);

			if(leaf){
				int par = (i-1)/2;
				if(i==0) tr[i] = new Tree();
				else{
					tr[i] = new Tree();
					if(i%2==0) tr[par].r=tr[i];
					else tr[par].l=tr[i];
				}
			}
		}

		System.out.println(trp(tr[0]));
	}

	public static String trp(Tree tree){
		String str = "(";
		if(tree.l!=null) str+=trp(tree.l);
		str+=",";
		if(tree.r!=null) str+=trp(tree.r);
		str+=")";
		return str;
	}
}

class Tree{
	Tree l=null,r=null;
}