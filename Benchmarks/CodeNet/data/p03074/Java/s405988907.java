

import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String[] Num = s.split("");
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(Num[i]);
		}
		int ans = 0;
		int change = 0;
		int j = 1;
		while(j < n) {
			if(num[j-1] + num[j] == 1) {
				if(num[j-1] == num[j+1]) {
					change ++;
					j += 2;
				}else {
					change ++;
					j += 1;
				}
			}else {
				j ++;
			}
		}
		int nums = change*2 + 1;
		int[] tng = new int[nums];
		int ind = 0;
		tng[0] ++;
		for(int i = 1; i < n; i++) {
			if(num[i-1] + num[i] != 1) {
				tng[ind] ++;
			}else {
				ind ++;
				tng[ind] ++;
			}
		}

		int[] sum = new int[nums+1];
		for(int i = 0; i < tng.length; i++) {
			sum[i+1] = sum[i] + tng[i];
		}
		/*for(int i = 0; i < nums; i++) {
			System.out.print(tng[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < nums+1; i++) {
			System.out.print(sum[i] + " ");
		}
		System.out.println();*/
		for(int i = num[0]; i < nums; i+=2) {
			int left = i;
			int right = Math.min(i + k*2+1, tng.length - 1);
			int tmp = sum[right] - sum[left];
			ans = Math.max(ans, tmp);
		}
		if(change <= k && num[0] == 1) {
			ans = n;
		}else if(change < k && num[0] == 0) {
			ans = n;
			//System.out.println("jack");
		}
		System.out.println(ans);

		sc.close();
	}

}

