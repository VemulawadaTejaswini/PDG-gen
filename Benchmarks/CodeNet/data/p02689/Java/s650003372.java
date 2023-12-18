import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[M];
		int[] B = new int[M];
		int[] H = new int[N];

		int i = 0;
		while(i < N) {
			H[i] = sc.nextInt();
			i++;
		}

		i = 0;
		while(i < M) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
			i++;
		}

		int max;
		int counter = 0;

		for(i = 0; i <N;i++) {
			max = 0;
			for(int j = 0; j < M;j++) {
				if(A[j] == i && max < H[B[j]]) {
					max = H[B[j]];
				}else if(B[j] == i && max < H[A[j]]) {
					max = H[A[j]];
				}
			}
			if(max < H[i]) {
				counter++;
				System.out.print(i);
			}
		}
		
		System.out.println("¥n "+ counter);
	
	}

}
