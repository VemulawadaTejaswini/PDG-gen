
import java.util.Scanner;
import java.lang.Math;

public class Main {
	private static int[] treeList;
	private static int n;
	private static int tempIdx;
	
	public static int getLeft(int idx) {
		tempIdx = idx*2;
		if (tempIdx > n) {
			return -99999;
		}
		return treeList[tempIdx];
	}
	public static int getRight(int idx){
		int tempIdx = idx*2+1;
		if(tempIdx >n) {
			return -99999;
		}
		return treeList[tempIdx];
	}
	public static int getParent(int idx) {
		int tempIdx = (int) Math.floor(idx/2);
		if (tempIdx < 1) {
			return -99999;
		}
		return treeList[tempIdx];
	}
	public static int getKey(int idx) {
		return treeList[idx];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		treeList =  new int[n+1];
		
		// Take inputs to build an array of binary trees
		for (int i=1; i <= n; i++) {
			treeList[i] = input.nextInt();
		}
		input.close();
		
		for (int i=1; i<=n;i++) {
			// String result = "node "+i+": key = "+getKey(i)+", ";
			System.out.print("node "+i+": key = "+getKey(i)+", ");
			
			if (getParent(i)!=-99999) {
				// result += "parent key = "+getParent(i)+", ";
				System.out.print("parent key = "+getParent(i)+", ");
			}
			if (getLeft(i)!=-99999) {
				// result += "left key = "+getLeft(i)+", ";
				System.out.print("left key = "+getLeft(i)+", ");
			}			
			if (getRight(i)!=-99999) {
				// result += "right key = "+getRight(i)+", ";
				System.out.print("right key = "+getRight(i)+", ");
			}
			System.out.println();
		}	
	}
}

