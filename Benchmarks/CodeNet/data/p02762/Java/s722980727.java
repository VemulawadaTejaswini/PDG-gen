import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		int N=sc.nextInt(),M=sc.nextInt(),K=sc.nextInt();
		int A[]=new int[M];
		int B[]=new int[M];
		int C[]=new int[K];
		int D[]=new int[K];
		int tomodati[]=new int[100000];
		int toho[]=new int[100000];
		int f=0;
		for(int i=0;i<M;i++) {
			A[i]=sc.nextInt();
			B[i]=sc.nextInt();
		}
		for(int i=0;i<K;i++) {
			C[i]=sc.nextInt();
			D[i]=sc.nextInt();
		}
		for(int i=1;i<=N;i++) {
			for(int a=0;a<M;a++) {
				if(A[a]==i) {
					tomodati[f]=B[a];
					f++;
				}
				if(B[a]==i) {
					tomodati[f]=A[a];
					f++;
				}
			}
		}
	}
}