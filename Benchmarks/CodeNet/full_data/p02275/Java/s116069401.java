import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int k=0;
	int[] A,B;
	int[] C = new int[10001];
	
	public void input() {
		n = sc.nextInt();
		A = new int[n+1];
		B = new int[n+1];
		for(int i=0; i<n; i++) A[i+1] = sc.nextInt();
	}
	
	public void CountingSort() {
		for(int i=0; i<n; i++) C[ A[i+1] ]++;
		for(int i=1; i<10000; i++) C[i] = C[i] + C[i-1];
		for(int j=1; j<=n; j++) {
			B[ C[ A[j] ] ] = A[j];
			C[ A[j] ]--;
		}
	}
	
	public void output() {
		System.out.print(B[1]);
		for(int i=2; i<=n; i++) System.out.print(" "+B[i]); 
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.CountingSort();
		obj.output();
	}
}

