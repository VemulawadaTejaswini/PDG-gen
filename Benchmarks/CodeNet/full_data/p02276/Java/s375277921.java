import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	//配列の要素数
	int n;
	//配列Aの最後の要素を示す変数
	int x;
	//交換のための変数
	int swap;
	//partition発見のための変数
	int i;
	//要素が格納される配列
	int[] A;
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) A[i] = sc.nextInt();
	}
	
	public void partition() {
		x = A[n-1];
		i = -1;
		for(int j=0; j<n-1; j++) {
			if(A[j] <= x) {
				i++;
				swap = A[i];
				A[i] = A[j];
				A[j] = swap;
			}
		}
		swap = A[i+1];
		A[i+1] = A[n-1];
		A[n-1] = swap;
	}
	
	public void output() {
		for(int j=0; j<n; j++) {
			if(j == n-1) System.out.print(A[j]);
			else if(j == i+1 ) System.out.print("["+A[j]+"] ");
			else System.out.print(A[j]+" ");
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.partition();
		obj.output();
	}
}

