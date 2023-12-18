import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] natural = new int[101];
			int[] yakusu = new int[101];
			int ans = 0;
			int cnt74 = 0;
			int cnt24 = 0;
			int cnt14 = 0;
			int cnt5 = 0;
			int cnt4 = 0;
			int cnt2 = 0;

			for (int i = 0; i < 101; i++) {
				natural[i] = i;
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 2; j <= i; j++) {
					while (natural[i] % j == 0) {
						natural[i] = natural[i]/j; 
						yakusu[j]++;
					}
					if (natural[i] == 1) {
						break;
					}
				}
			}
			//yakusu is gotten	
			//Now to choose
			for (int i = 0; i <= n; i++) {
				if (yakusu[i] >= 74) {
					cnt74++;
				}
				if (yakusu[i] >= 24) {
					cnt24++;
				}
				if (yakusu[i] >= 14) {
					cnt14++;
				}
				if (yakusu[i] >= 4) {
					cnt4++;
				}
				if (yakusu[i] >= 2) {
					cnt2++;
				}
			}
			ans = cnt74+
			cnt24*(cnt2-1)+
			cnt4*(cnt4-1)*(cnt2-2)/2 +
			cnt14*(cnt4-1);
			//75,3-5-5,3-25,5-15
			System.out.println(ans);
		    sc.close(); }

	public static boolean isEven(int n ) {
		if (n % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}

	
}