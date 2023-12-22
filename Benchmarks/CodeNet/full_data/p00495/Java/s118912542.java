import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		
		short[] a_array = new short[A];
		short[] b_array = new short[B];
		
		for(int i = 0; i < A; i++){
			a_array[i] = sc.nextShort();
		}
		
		for(int i = 0; i < B; i++){
			b_array[i] = sc.nextShort();
		}
		
		short[][] dp = new short[A+1][B+1];
		int max = 0;
		for(int i = 0; i < A; i++){
			for(int j = 0; j < B; j++){
				if(a_array[i] == b_array[j]){
					dp[i+1][j+1] = (short) (dp[i][j] + 1);
				}else{
					dp[i+1][j+1] = dp[i][j+1];
				}
			}
		}
		
		for(int i = 0; i <= B; i++){
			max = Math.max(max, dp[A][i]);
		}
		/*
		for(int i = 0; i <= A; i++){
			System.out.print((i == 0 ? " " : a_array[i-1]) + " :");
			for(int j = 0; j <= B; j++){
				System.out.print(" " + dp[i][j]);
			}
			System.out.println();
		}
		*/
		System.out.println(max);
	}

}