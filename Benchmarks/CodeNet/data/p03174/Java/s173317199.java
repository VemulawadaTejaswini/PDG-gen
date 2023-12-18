
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int[][] arr = input(n,n);
		long td[][] = new long[n][ (1<<22)+1]; 
		for(long[] key :td)Arrays.fill(key, -1);
		long ans = find(arr , 0 , 0 , td);
		System.out.println(ans);
	}
static long mod = 1000000007; 
	private static long find(int[][] arr, int index, int allocated , long [][] td) {
		if(index==arr.length) {
			return 1 ;
		}
		if(td[index][allocated]!=-1)return td[index][allocated];

		int n = arr.length ;
		long ans = 0 ;
		for(int i = 0 ; i < n; i++) {
			if(arr[index][i]==0 ||( (allocated & (1<<i))==(1<<i) ))continue;
			ans = ans + find(arr , index +1 , allocated | (1<<i)  , td);
			ans %=mod;
		}
		td[index][allocated] = ans%mod;
		return ans;
	}

	public static long[] input(int n) throws Exception {

		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		return arr;
	}

	public static int[][] input(int n, int m) throws Exception {

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
