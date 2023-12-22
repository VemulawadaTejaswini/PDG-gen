

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < S.length; i++) {
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < T.length; i++) {
			T[i] = scan.nextInt();
		}
		
		System.out.println(linearSearch(S, T));
		scan.close();
	}

	public static int linearSearch(int[] S, int[] T) {
		int ans = 0;
		for(int t: T){
			for(int s: S){
				if (t== s) {
					ans++;
					break;
				}
			}
		}
		
		return ans;
	}
}