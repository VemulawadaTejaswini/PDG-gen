

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int T[] = new int[N];
		int A[] = new int[N];
		for(int i=0;i<N;i++){
			T[i] = sc.nextInt();
			A[i] = sc.nextInt();
		}
		sc.close();

		int voteT = T[0];
		int voteA = A[0];

		for(int i=1;i<N;i++){
			if(!(voteT % T[i] == 0 && voteA % A[i] ==0 && voteT / T[i] == voteA / A[i]) && (T[i] != T[i-1] || A[i] != A[i-1])){
				if(T[i] < A[i]){
					if(T[i] != 1) voteT += (T[i] - voteT % T[i]);
					voteA = voteT / T[i] * A[i];
				}else if(T[i] > A[i]){
					if(A[i] != 1) voteA += (A[i] - voteA % A[i]);
					voteT = voteA / A[i] * T[i];
				}else{
					voteT = Math.max(voteT, voteA);
					voteA = Math.max(voteT, voteA);
				}
			}
		}
		System.out.println(voteT + voteA);



	}

}
