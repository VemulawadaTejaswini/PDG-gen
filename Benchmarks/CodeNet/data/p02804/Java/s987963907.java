package e;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long ans = 0;
		if(k > 1){
		for(int i = 0; i < n; i++){
			for(int j = i + k - 1; j < n; j++){
				ans += (a[j] - a[i]) * calcNumOfCombination(j-i-1,k-2);
				ans %= 1000000007;
			}
		}
		}
		System.out.print(ans);


	}

	//組み合わせの数nCrを計算
	public static long calcNumOfCombination(int n, int r){
	    long num = 1;
	    for(int i = 1; i <= r; i++){
	        num = num * (n - i + 1) / i;
	        num %= 1000000007;
	    }
	    return num;
	}

}
