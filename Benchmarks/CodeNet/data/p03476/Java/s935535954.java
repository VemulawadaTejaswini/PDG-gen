

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int q = cin.nextInt();
		int[] flag = new int[100009];
		int[] a = new int[100009];
		Arrays.fill(flag, 0);
		flag[1] = 1; 
		for(int i=2; i<=100000; i++) {
			for(int j=2*i; j<=100000; j+=i) {
				flag[j] = 1;
			}
		}
		for(int i=1; i<=100000; i++) {
			if(flag[i]==0 && flag[(i+1)/2]==0 && i!=2) {
				a[i] = a[i-1] + 1;
			}else
				a[i] = a[i-1];
		}
		while((q--)>0) {
			int l = cin.nextInt();
			int r = cin.nextInt();
			System.out.println(a[r]-a[l-1]);
		}
	}
}
