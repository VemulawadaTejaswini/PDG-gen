import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	//並び替える対象の配列の要素数：0...n-1
	int n;
	//対象の配列の中の最大値
	//int k=0;
	//ソート対象の配列A, 登場数を記録する配列B
	int[] A,B;
	int[] C = new int[10001];

	public void input() {
		n = sc.nextInt();
		A = new int[n];
		B = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			C[ A[i] ]++;
		}
	}
	
	public void solve() {
		for(int i=1; i<10001; i++) C[i] += C[i-1];
		for(int i=n-1; i>=0; i--){
            B[ C[ A[i] ]-1 ] = A[i];
            C[ A[i] ]--;
        }
		for(int i=0; i<n-1; i++) output.append(B[i]+" ");
        System.out.println(output.toString()+B[n-1]);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.solve();
	}
}

