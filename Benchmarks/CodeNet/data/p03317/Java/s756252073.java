import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int answer = 1;

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int A[] = new int[K];
		for(int i=0; i<K; i++){
			A[i] = sc.nextInt();
		}

		int x = N-K;

		if(x<=0) System.out.println(answer);
		else {
			while(x>0){
				x = x - (K-1);
				answer++;
			}
			System.out.println(answer);
		}

		sc.close();
    }
}
