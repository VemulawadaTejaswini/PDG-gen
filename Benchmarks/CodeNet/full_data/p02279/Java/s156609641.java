import java.util.Scanner;


public class Main{
	static int[] parent;
	static int[] leftChild;
	static int[] rightBrother;
	static int[] D;
	static String[] type;
	static String[] child;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = new Integer(s.nextLine()).intValue();
		parent = new int[cnt];
		leftChild = new int[cnt];
		rightBrother = new int[cnt];
		D = new int[cnt];
		type = new String[cnt];
		child = new String[cnt];
		for(int a=0 ; a<parent.length  ; a++){
			parent[a] = -1;
			leftChild[a] = -1;
			rightBrother[a] = -1;
		}


		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			int[] array = new int[tmp.length];
			for(int j=0 ; j<tmp.length ; j++) {
				array[j] = new Integer(tmp[j]).intValue();
			}
			//parent
			for(int k=0 ; k<array[1] ; k++) {
				parent[array[k+2]] = array[0];
			}
			//leftChild
			if(array[1]!=0)
				leftChild[array[0]] = array[2];
			//rightBrother
			for(int l=0 ; l<array[1]-1 ; l++) {
				rightBrother[array[l+2]] = array[l+3];
			}
		}
		int root = -1;
		for(int i=0 ; i<parent.length ; i++) {
			if(parent[i] == -1)
				root = i;
		}
		setDepth(root, 0);

		for(int j=0 ; j<cnt ; j++) {
			if(parent[j]==-1)
				type[j] = "root";
			else if(leftChild[j]==-1)
				type[j] = "leaf";
			else
				type[j] = "internal node";
			String a = "";
			for(int k=0 ; k<parent.length ; k++) {
				if(parent[k]==j)
					a += k + ", ";
			}
			if("".equals(a)) {
				child[j] = "";
			}else{
				child[j] = a.substring(0, a.length()-2);
			}
			System.out.println("node " + j + ": parent = " + parent[j] + ", depth = " + D[j] + ", " + type[j] + ", [" + child[j] + "]");
		}

	}

	public static void setDepth(int root, int depth) {
		D[root] = depth;
		if(rightBrother[root]!=-1)
			setDepth(rightBrother[root], depth);
		if(leftChild[root]!=-1)
			setDepth(leftChild[root], depth+1);

	}
}