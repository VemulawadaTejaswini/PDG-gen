import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int k=0;
	int[] A,B;
	int[] C = new int[10001];
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		B = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			if(A[i] > k) k=A[i];
		}
	}
	
	public void CountingSort() {
		for(int i=0; i<n; i++) C[ A[i] ]++;
		for(int i=1; i<k+1; i++) C[i] += C[i-1];
		for(int j=A.length-1; j>=0; j--) {
			C[ A[j] ]--;
			B[ C[ A[j] ] ] = A[j];
		}
	}
	
	public void output() {
		System.out.print(B[0]);
		for(int i=1; i<n; i++) System.out.print(" "+B[i]); 
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.CountingSort();
		obj.output();
	}
}


