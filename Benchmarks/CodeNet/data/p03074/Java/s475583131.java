import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxTime = sc.nextInt();
		String str = sc.next();
		int startHS = str.charAt(0) == '1' ? 1 : 0;
		int group[] = new int[num];
		int crt = 1;
		int numG = 0;
		for(int i = 1; i < num; i ++) {
			if(str.charAt(i) == str.charAt(i - 1)) {
				crt ++;
			}else {
				group[numG] = crt;
				numG ++;
				crt = 1;
			}
		}
		group[numG] = crt;
		numG ++;

		if((numG + 1 - startHS) / 2 <= maxTime) {
			System.out.println(num);
		}else {
			int sum[] = new int[numG + 1];
			sum[0] = 0;
			for(int i = 1; i < numG + 1; i ++) {
				sum[i] = group[i - 1] + sum[i - 1];
			}
			int can[] = new int[numG];
			for(int i = 0; i < numG; i ++) {
				can[i] = 0;
			}
			for(int i = 1 - startHS; i < numG; i += 2) {
				can[i] = sum[i + 1] - sum[Math.max(0, i - maxTime * 2)];
			}
			int max = 0;
			for(int i = 0; i < numG; i ++) {
				max = Math.max(max, can[i]);
			}
			System.out.println(max);
		}
	}
}