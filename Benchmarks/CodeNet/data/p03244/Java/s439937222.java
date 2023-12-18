import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int NHalf = N/2;
		int a[] = new int [NHalf];
		int b[] = new int [NHalf];

		for(int i = 0; i < NHalf; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		Arrays.sort(b);

		int cnt = 0;int maxcnt = 0;int maenum = 0;int nibannum = 0;int nibancnt = 0;int maxnum = 0;
		for(int i = 0; i < NHalf; i++) {

			if(i == 0) {
				maenum = a[i];
				continue;
			}


			if(maenum == a[i]) {
			//	前の整数と同じ場合
				cnt ++;

				if(i+1 == NHalf) {
					if(maxcnt <= cnt){
						if(nibancnt <= maxcnt) {
							nibancnt = maxcnt;
							nibannum = maxnum;
						}
						maxcnt = cnt;
						maxnum = a[i];
						cnt = 0;
					}else {
						if(nibancnt <= cnt) {
							nibancnt = cnt;
							nibannum = a[i];
						}
						cnt = 0;
					}
				}
			}else if(maxcnt <= cnt){

				if(nibancnt <= maxcnt) {
					nibancnt = maxcnt;
					nibannum = maxnum;
				}
				maxcnt = cnt;
				maxnum = a[i];
				cnt = 0;
			}else {
				if(nibancnt <= cnt) {
					nibancnt = cnt;
					nibannum = a[i];
				}
				cnt = 0;
			}
			maenum = a[i];
		}

		int Amaxnum = maxnum;
		int Amaxcnt = maxcnt;
		int Anibannum = nibannum;
		int Anibancnt = nibancnt;

		cnt = 0;maxcnt = 0;maenum = 0;nibannum = 0;nibancnt = 0;maxnum = 0;
		for(int i = 0; i < NHalf; i++) {

			if(i == 0) {
				maenum = b[i];
				continue;
			}

			if(maenum == b[i]) {
			//	前の整数と同じ場合
				cnt ++;

				if(i+1 == NHalf) {
					if(maxcnt <= cnt){
						if(nibancnt <= maxcnt) {
							nibancnt = maxcnt;
							nibannum = maxnum;
						}
						maxcnt = cnt;
						maxnum = b[i];
						cnt = 0;
					}else {
						if(nibancnt <= cnt) {
							nibancnt = cnt;
							nibannum = b[i];
						}
						cnt = 0;
					}
				}
			}else if(maxcnt <= cnt){

				if(nibancnt <= maxcnt) {
					nibancnt = maxcnt;
					nibannum = maxnum;
				}
				maxcnt = cnt;
				maxnum = b[i];
				cnt = 0;
			}else {
				if(nibancnt <= cnt) {
					nibancnt = cnt;
					nibannum = b[i];
				}
				cnt = 0;
			}
			maenum = b[i];
		}


		int ans = 0;
		if(N == 2) {
			if(a[0] != b[0]){
				ans = 2;
			}else {
				ans = 1;
			}
		}else if(Amaxnum != maxnum) {
			ans = Amaxcnt + maxcnt + 2;
		}else {
			if((Amaxcnt + nibancnt) >= (maxcnt + Anibancnt)){
				ans = Amaxcnt + nibancnt + 2;

			}else {
				ans = maxcnt + Anibancnt +2;
			}

			if(nibannum == 0 && Anibannum == 0) {
				ans --;
			}
		}
		System.out.println((N-ans));
	}

}