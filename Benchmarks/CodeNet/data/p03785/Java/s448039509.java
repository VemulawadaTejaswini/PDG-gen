package GrandContest011A;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1行目の入力
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		//2行目以降の入力
		int[] T = new int[N];
		for(int i=0; i<N; i++){
			T[i]  = sc.nextInt();
		}
		//T[i]を並び替える
		for(int i=1; i<T.length; i++){
			int val = T[i];
			int j = i;
			while(j>0 && T[j-1]>val){
				T[j] = T[j-1];
				j--;
			}
			T[j] =val;
		}
		//バスの数をカウントする
		int count = 1;
		int firstPassenger = 0;
		for(int i=0; i<N; i++){
			if(i-firstPassenger==C || T[i]>T[firstPassenger]+K){
				count++;
				firstPassenger = i;
			}
		}
		//出力
		System.out.println(count);

	}

}
