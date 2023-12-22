import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


public class Main{
	static int[] parent;
	static int[] leftChild;
	static int[] rightBrother;
	static int[] D;
	static String[] type;
	static String[] child;
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(r);
		st.nextToken();
//		Scanner s = new Scanner(System.in);
		int cnt = (int) st.nval;
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
			st.nextToken();
			int val = (int) st.nval;
			st.nextToken();
			int childCnt = (int)st.nval;
//			String[] tmp = s.nextLine().split(" ");
			int[] array = new int[childCnt+2];
			array[0] = val;
			array[1] = childCnt;
			for(int j=2 ; j<childCnt+2 ; j++) {
				st.nextToken();
				array[j] = (int) st.nval;
			}
			String disp = "";
			for(int a=0 ; a<array[1] ; a++) {
				disp += array[a+2] + ", ";
			}
			if(!disp.equals("")) {
				child[array[0]] = disp.substring(0, disp.length()-2);
			}else{
				child[array[0]] = "";
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
//			String a = "";
//			for(int k=0 ; k<parent.length ; k++) {
//				if(parent[k]==j)
//					a += k + ", ";
//			}
//			if("".equals(a)) {
//				child[j] = "";
//			}else{
//				child[j] = a.substring(0, a.length()-2);
//			}
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

//		int[][] array = new int[cnt][cnt];
//		for(int i=0 ; i<cnt ; i++) {
//			String[] a = s.nextLine().split(" ");
//			int[] inArray = new int[a.length];
//			for(int j=0 ; j<a.length ; j++ ) {
//				inArray[j] = new Integer(a[j]).intValue();
//			}
//			array[i] = inArray;
//		}
//		disp(array);
//	}
//
//	public static void disp(int[][] array) {
//		String[][] result = new String[array.length][4];
//		for(int i=0 ; i<result.length ; i++) {
//			result[i][0] = "-1";
//			result[i][1] = "0";
//			result[i][2] = "root";
//			result[i][3] = "[]";
//		}
//
//		for(int j=0 ; j<array.length ; j++) {
//			if(array[j][1] == 0){}
//			else{
//				if("leaf".equals(result[j][2])) {
//					result[j][2] = "internal node";
//				}
//				String str = "[";
//				for(int k=0 ; k<array[j][1] ; k++) {
//					if(k+1<array[j][1]) {
//						str += array[j][k+2] + ", ";
//					}else {
//						str += array[j][k+2] + "";
//					}
//				}
//				result[array[j][0]][3] = str + "]";
//				for(int l=0 ; l<array[j][1] ; l++) {
//					//parent
//					result[array[j][l+2]][0] = array[j][0]+"";
//					//depth
//					int tmp = (new Integer(result[array[j][0]][1]).intValue() + 1);
//					result[array[j][l+2]][1] = tmp + "";
//					//type
//					result[array[j][l+2]][2] = "leaf";
//				}
//			}
//
//		}
//		for(int m=0 ; m<result.length ; m++) {
//			System.out.println("node " + m + ": parent = " + result[m][0] + ", depth = " + result[m][1] + ", " + result[m][2] + ", " + result[m][3]);
//		}
//	}