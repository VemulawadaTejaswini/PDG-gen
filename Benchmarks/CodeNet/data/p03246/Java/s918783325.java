
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();

		int am[] = new int[112345];
		int bm[] = new int[112345];
		int tmp[] = am;
		int swp[] = bm;
		int t[];
		for (int i = 0; i < n; i++) {
			tmp[sc.nextInt()]++;

			t = tmp;
			tmp = swp;
			swp = t;
		}

		int mt1 = 0;
		int mt2 = 0;
		int mti1 = 0;
		int mti2 = 0;
		int ms1 = 0;
		int ms2 = 0;
		int msi1 = 0;
		int msi2 = 0;
		for (int i = 0; i < 112345; i++) {
			if(tmp[i] >= mt1){
				mt2 = mt1;
				mti2 = mti1;
				mt1 = tmp[i];
				mti1 = i;
			}else if(tmp[i] >= mt2){
				mt2 = tmp[i];
				mti2 = i;
			}
			if(swp[i] >= ms1){
				ms2 = ms1;
				msi2 = msi1;
				ms1 = swp[i];
				msi1 = i;
			}else if(swp[i] >= ms2){
				ms2 = swp[i];
				msi2 = i;
			}
		}

		if(mti1 != msi1){
			System.out.println(n - mt1 - ms1);
		}else{
			int max = Math.max((mt1+ms2), (mt2+ms1));
			System.out.println(n-max);
		}

	}
}
