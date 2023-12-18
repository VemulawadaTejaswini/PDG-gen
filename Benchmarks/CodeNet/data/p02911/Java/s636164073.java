import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int A[] = new int[Q];
		int P[] = new int[N];
		for(int i = 0 ; i < Q ; ++i){
			A[i] = sc.nextInt() - 1;
			int a = A[i];
			P[a]++;
		}
		for(int i = 0 ; i < N ; ++i){
			int neg = Q - P[i];
			int p = K - neg;
			if(p <= 0){
				System.out.println("No");
			}else{
				System.out.println("Yes");				
			}
		}
	}
}
