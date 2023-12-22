import java.util.*;
public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	//---入力に必要な変数---
	//要素数を示す変数
	int n;
	//n個の整数を格納する配列
	int[] S;
	
	//---マージ、マージソートに必要な変数---
	int n1,n2;
	int i,j;
	int counter=0;
	
	public void input() {
		n = sc.nextInt();
		S = new int[n];
		for(int i=0; i<n; i++) {
			S[i] = sc.nextInt();
		}
	}
	
	public void output() {
		mergeSort(S, 0, n);
		System.out.print(S[0]);
		for(int i=1; i<n; i++) {
			System.out.print(" "+S[i]);
		}
		System.out.println("\n"+counter);
	}
	
	//整列された配列をマージ（結合）するメソッド
	public void merge(int[] A, int left, int mid, int right) {
		n1 = mid - left;
		n2 = right - mid;
		
		int[] L = new int[n1+1];
		//0...n1の配列Lを宣言した。
		int[] R = new int[n2+1];
		//0...n2の配列Rを宣言した。
		
		//配列L,Rに要素を代入する。
		for(int i=0; i<=n1-1; i++) L[i] = A[left+i];
		for(int i=0; i<=n2-1; i++) R[i] = A[mid+i];
		
		L[n1] = (int) Double.POSITIVE_INFINITY;
		R[n2] = (int) Double.POSITIVE_INFINITY;
		//配列L,Rの最後に最も大きい値（正の∞）を代入した。
		
		i = 0;
		j = 0;
		
		for(int k=left; k<=right-1; k++) {
			if(L[i] <= R[j]) {
				A[k] = L[i];
				i++;
				counter++;
			}else {
				A[k] = R[j];
				j++;
				counter++;
			}
		}
	}
	
	//対象の配列をマージソートするメソッド
	public void mergeSort(int[] A, int left, int right) {
		int mid;
		if(left+1 < right) {
			mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

