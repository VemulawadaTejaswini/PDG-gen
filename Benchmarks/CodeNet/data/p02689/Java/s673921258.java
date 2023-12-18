import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[M];
		int[] B = new int[M];
		Long[] H = new Long[N];
		int[] counter = new int[N];

		int i = 0;
		while(i < N) {
			H[i] = sc.nextLong();
			counter[i] = 1;
			i++;
		}

		i = 0;
		while(i < M) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
			i++;
		}

		for(i = 0; i < M;i++) {
			if(H[A[i]] > H[B[i]]) {
				if(counter[A[i]]==1) {
					counter[A[i]]=1;
					counter[B[i]]=0;
				}else {
					counter[A[i]]=0;
					counter[B[i]]=0;
				}
			}else if(H[A[i]] < H[B[i]]) {
				if(counter[B[i]]==1) {
					counter[B[i]]=1;
					counter[A[i]]=0;
				}else {
					counter[A[i]]=0;
					counter[B[i]]=0;
				}
			}else {
				counter[A[i]]=0;
				counter[B[i]]=0;
			}
		}

		int result =0;

		for(i = 0;i < N;i++) {
			if(counter[i] == 1) {
				result++;
			}
		}

		System.out.println(result);

	}

}
