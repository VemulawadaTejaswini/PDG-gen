import java.util.Scanner;


public class Main{

	static int[] unionFindTree;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int productCnt = Integer.parseInt(s.nextLine());
		String[][] productList = new String[productCnt][2];
		for(int i=0 ; i<productCnt ; i++) {
			String[] line = s.nextLine().split(" ");
			productList[i][0] = line[0];
			productList[i][1] = line[1];
		}

		int magicCnt = Integer.parseInt(s.nextLine());
		unionFindTree = new int[productCnt];
		for(int i=0 ; i<productCnt ; i++) {
			unionFindTree[i] = i;
		}

		for(int i=0 ; magicCnt > i ; i++) {
			String[] magic = s.nextLine().split(" ");
			int left=0,right=0,leftV=0,rightV=0;
			for(int j=0 ; j<productCnt ; j++) {
				if(magic[0].equals(productList[j][0])) {
					left = j;
					leftV = Integer.parseInt(productList[j][1]);
				}
				if(magic[1].equals(productList[j][0])) {
					right = j;
					rightV = Integer.parseInt(productList[j][1]);
				}
			}

			int leftP = getParent(left);
			int rightP = getParent(right);
			if(Integer.parseInt(productList[leftP][1]) > Integer.parseInt(productList[rightP][1])) {
				unionFindTree[leftP] = rightP;
			}
			if(Integer.parseInt(productList[leftP][1]) <= Integer.parseInt(productList[rightP][1])) {
				unionFindTree[rightP] = leftP;
			}
		}

		int result = 0;
		for(int i=0 ; i<productCnt ; i++) {
			int pa = getParent(i);
			result+=Integer.parseInt(productList[pa][1]);
		}
		System.out.println(result);
	}

	public static int getParent(int index) {
		if(unionFindTree[index]==index)
			return index;
		return getParent(unionFindTree[index]);
	}
}