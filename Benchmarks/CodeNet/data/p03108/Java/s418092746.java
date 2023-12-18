import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numI = sc.nextInt();
		int numB = sc.nextInt();
		long ans[] = new long[numB];
		int bridge[][] = new int[numB][2];
		for(int i = 0; i < numB; i ++) {
			bridge[i][0] = sc.nextInt() - 1;
			bridge[i][1] = sc.nextInt() - 1;
		}

		int pair[] = new int[numI];
		for(int i = 0; i < numI; i ++) {
			pair[i] = 1;
		}

		ans[numB - 1] = 0;
		for(int i = numB - 1; i > 0; i --) {
			ans[i - 1] = ans[i];
			if(bridge[i][0] != bridge[i][1]) {
				ans[i - 1] -= combi2(pair[bridge[i][0]]) + combi2(pair[bridge[i][1]]);
				pair[bridge[i][0]] += pair[bridge[i][1]];
				pair[bridge[i][1]] = 0;
				ans[i - 1] += combi2(pair[bridge[i][0]]) + combi2(pair[bridge[i][1]]);
				for(int j = 0; j < numB; j ++) {
					for(int k = 0; k < 2; k ++) {
						if(bridge[j][k] == bridge[i][1]) {
							bridge[j][k] = bridge[i][0];
						}
					}
				}
			}
		}

		long all = combi2(numI);
		for(int i = 0; i < numB; i ++) {
			ans[i] = all - ans[i];
			System.out.println(ans[i]);
		}
	}
	public static long combi2(int n){
		return n * (n - 1) / 2;
	}
}