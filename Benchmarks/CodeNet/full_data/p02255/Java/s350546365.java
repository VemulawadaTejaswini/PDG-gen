import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int N;	//要素数
	int v=0;	//保存用変数
	int j=0;	//添字のための変数
	int[] A;
	
	public void input() {
		N = sc.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++) { A[i] = sc.nextInt(); }
	}
	
	//ソート部分
	public void conpute() {
		output();
		for(int i=1; i<=N-1; i++) {
			v = A[i];
			j = i-1;
			while(j>=0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			output();
		}
	}
	
	public void output() {
		System.out.print(A[0]);
		for(int i=1; i<N; i++) {
			System.out.print(" "+A[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.conpute();
	}
}

