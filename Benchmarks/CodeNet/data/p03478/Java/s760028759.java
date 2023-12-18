package com.algorithm.atcoder;

import java.util.*;

public class Main {

    private static void solution(int N, int A, int B) {

		int sum = 0;
		for(int i = 1; i <= N; i++) {
			if(isBoundedSum(i, A, B)) {
				sum += i;
			}
		}

		System.out.println(sum);

	}

	private static boolean isBoundedSum(int value, int A, int B) {

		int sum = 0;

		while(value != 0) {
			int reminder = value % 10;
			sum += reminder;

			if (sum > B) {
				return false;
			}

			value = value / 10;
		}

		if (sum < A) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		solution(N, A, B);
	}


}