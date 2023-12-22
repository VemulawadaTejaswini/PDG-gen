import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cnt = new int[10010];
		for(int i = 0; i < 10010; i++) {
			cnt[i] = 0;
		}
		
		for(int i = 1; i < Math.pow((double)n, 1.0/2.0); i++) {
			for(int j = 1; j < Math.pow((double)n, 1.0/2.0); j++) {
				for(int k = 1; k < Math.pow((double)n, 1.0/2.0); k++) {
					if(i == j && j == k) {
						cnt[i*i+j*j+k*k+i*j+j*k+k*i] += 1;
					}else if((i == j && j != k) || (j == k && k != i) || (k == i && i != j)) {
						cnt[i*i+j*j+k*k+i*j+j*k+k*i] += 1;
					}else if(i != j && j != k && k != i) {
						//System.out.println(i+ " " + j + " " + k +" " + i*i+j*j+k*k+i*j+j*k+k*i);
						cnt[i*i+j*j+k*k+i*j+j*k+k*i] += 2;
					}
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(cnt[i]);
		}
		
		
		
		/*for(int i = 1; i < Math.pow((double)n, 1.0/2.0); i++) {
			cnt[6*i*i] += 1;
		}
		for(int i = 1; i < Math.pow((double)n, 1.0/2.0); i++) {
			cnt[i*i + 2 * i + 3] += 3;
		}
		for(int i = 1; i < Math.pow((double)n, 1.0/2.0); i++) {
			cnt[i*i + 2 * i + 3] += 3;
		}*/
	}
}
