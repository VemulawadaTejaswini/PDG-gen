

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int nNum = 0;
		int mNum = 0;

		int count = 0;

		int[] nBook = new int[n];
		int[] mBook = new int[m];


		for(int i=0 ; i<n ; i++) {
			nBook[i] = sc.nextInt();

		}
		for(int i=0 ; i<m ; i++) {
			mBook[i] = sc.nextInt();
		}

		while(k >= 0) {
			if(k >= nBook[nNum] || k >= mBook[mNum]) {
				if(nBook[nNum] <= mBook[mNum]) {
					k -= nBook[nNum];
					if(nNum + 1< nBook.length) {
						nNum++;
					}else {
						nBook[nNum] = 1000000001;
					}
				}else {
					k -= mBook[mNum];
					if(mNum + 1< mBook.length) {
						mNum++;
					}else {
						mBook[mNum] = 1000000001;
					}
				}
				count ++;
			}else {
				break;
			}
		}





		System.out.println(count);




		sc.close();

	}

}
