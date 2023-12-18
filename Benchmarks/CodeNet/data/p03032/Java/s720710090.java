
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int v[] = new int[n];
//		int valueSum = 0;
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
//			valueSum += v[i];
		}
		
		int result = 0;
		//残る部分のサイズ
		for(int i = 0; i <= n; i++) {
//			System.out.println("i = "+i);
			if(n - i > k) {
				continue;
			}
			for(int j = 0; j < n ; j++) {
				if(j + i > n) {
					break;
				}
				int mask[] = new int[n];
				Arrays.fill(mask, 1);
				
				for(int l = j; l < j + i; l++) {
					mask[l] = 0;
				}
				
				int resArray[] = new int[n];
				
				for(int l = 0; l < n; l++) {
					resArray[l] = mask[l]*v[l];
					//debug
//					System.out.print(resArray[l]+" ");
				}
//				System.out.println();
				
				Arrays.sort(resArray);
				
				for(int l = 0; l < k - (n - i) ; l++) {
					if(resArray[l] >= 0) {
						break;
					}
					resArray[l] = 0;
				}
				
				
				int tmpSum = 0;
				for(int l = 0; l < n; l++) {
					tmpSum += resArray[l];
				}
				result = Math.max(result, tmpSum);
			}
		}
		
		System.out.println(result);
	}

}
