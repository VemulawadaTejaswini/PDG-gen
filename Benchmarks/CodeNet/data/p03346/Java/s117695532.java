

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N =scanner.nextInt();

		int[] P =new int[N];

		for (int i =0;i<N;i++) {
			P[i]=scanner.nextInt();
		}

		int max =0;
		int truemax =0;
		for(int k=0;k<N;k++){
			max=0;
		for(int i=k;i<N;i++) {
			if(P[i]==(max+1)) {
				max+=1;
				if(truemax<max){
					truemax =max;
				}
			}
		}
	}

		int ans;
		ans=N-truemax;
		System.out.println(ans);

	}

}
