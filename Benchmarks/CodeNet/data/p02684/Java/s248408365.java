import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long K = sc.nextLong();

		int[][] counter = new int[N][2];
		int[] A = new int[N];

		int i = 0;
		while(i < N) {
			A[i] = sc.nextInt()-1;
			i++;
		}

		int cycle = 0;
		int head = 0;

		counter[0][0] = 1;
		for(i = 0; i < N; i++) {
			if(counter[A[i]][0] == 0) {
				counter[A[i]][0] = 1;
				counter[A[i]][1] = i;
			}else {
				cycle=i - counter[A[i]][1];
				head = counter[A[i]][1];
				break;
			}
		}

		if(i == N) {
			System.out.println(A[i-1]+1);
		}else if (head != 0){
			int target = (int)(head + 1 +(K - head)%cycle);
			System.out.println(A[target]+1);
		}else {
			int target = (int)(head  +(K - head)%cycle);
			System.out.println(A[target]+1);
		}

	}

}

