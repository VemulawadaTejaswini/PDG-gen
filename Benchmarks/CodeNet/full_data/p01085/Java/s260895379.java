package training;

import java.util.Scanner;

public class Main {

	static int m;
	static int nMin;
	static int nMax;
	static int gap;
	static int maxNum;
	static int score;

	static int[] scores;

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		while(true){
			m = sc.nextInt();
			nMin = sc.nextInt();
			nMax = sc.nextInt();

			if(m==0){
				break;
			}

			scores = new int[m];
			for(int i=0;i<m;i++){
				score = sc.nextInt();
				scores[i]=score;
			}

			int maxGap =0;

			for(int i=nMin;i<nMax;i++){
				gap = scores[nMin]-scores[i];

				if(gap>maxGap){
					maxGap = gap;
					maxNum = i;
				}
			}

			System.out.println(maxNum);

		}

	}

}