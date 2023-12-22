

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
			maxNum =1;
			int index = 0;
			if(nMin==0||nMin==1){
				index = 0;
			}
			index = nMin-1;

			for(int i=index;i<nMax+1;i++){
				gap = scores[i-1]-scores[i];

				if(gap>=maxGap){
					maxGap = gap;
					maxNum = i;
				}
			}

			System.out.println(maxNum);

		}

	}

}