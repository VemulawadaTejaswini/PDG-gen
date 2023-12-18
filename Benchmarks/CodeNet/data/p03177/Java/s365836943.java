
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	static int mod = (int) 1e9 + 7;

	static long[][] base(int n) {
		long mat[][] = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = (i == j) ? 1 : 0;
			}
		}
		return mat;
	}

	static long[][] multiply(long[][] m1, long m2[][]) {
		int n = m1.length;
		long ans[][] = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
				 long temp= (m1[i][k] * m2[k][j])%mod;
				 ans[i][j]=(ans[i][j]+temp)%mod;
				 

				}
			}
		}
		return ans;

	}

	static long[][] exponentiation(long m[][], long k) {
		long ans[][] = base(m.length);
		for (int i = 0; (1L << i) <= k; i++) {
			if (((1L << i) & k)!=0) {
				ans = multiply(ans, m);
			}
			m = multiply(m, m);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long k = scn.nextLong();
		long mat[][] = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scn.nextLong();
			}
		}
		long an[][] = exponentiation(mat, k);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans = (ans + an[i][j]) % mod;
			}
		}
		System.out.println(ans);

	}

}