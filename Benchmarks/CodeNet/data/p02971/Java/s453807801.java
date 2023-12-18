import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),sum=0,left=0;
		int[] A = new int[N + 1],B = new int[N];
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for(int i=0;i<N;i++) B[i]=sc.nextInt();
		for (int i = N-1; i >=0; i--) {
			int temp = B[i];
			if(temp>=A[i+1]){
				temp -= A[i+1];
				if(A[i]>temp) A[i] -= temp;
				else A[i] = 0;
				A[i+1]=0;
			}else A[i+1] -= temp;
		}
		for(int i=0;i<=N;i++) left += A[i];
		System.out.println(sum-left);
	}
}