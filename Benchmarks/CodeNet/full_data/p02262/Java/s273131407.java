import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void printseq(int[] s){
		for (int i = 0; i<s.length ; i++) {
			if ( i == s.length-1) {
				System.out.println(s[i]);
			}else{
				System.out.print(s[i] + " ");
			}
		}
	}

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		for (int i = 0; i<n ; i++ ) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		int m = 1;
		int judge = m*3 + 1;
		while(judge < num.length){
			m++;
			judge = judge*3 + 1;
		}
		int[] g = new int[m];
		for ( int i = 0; i<m ; i++ ) {
			judge = (judge-1)/3;
			g[i] = judge;
		}

		for (int i = 0; i<m ; i++ ) {
			for (int k = g[i]; k<n ; k++ ) {
				int v = num[k];
				int j = k - g[i];
				while(j >= 0 && num[j] > v){
					num[j+g[i]] = num[j];
					j = j-g[i];
					cnt++;
					// System.out.println(Arrays.toString(num));
				}
				num[j+g[i]] = v;
			}
		}




		System.out.println(m);
		printseq(g);
		System.out.println(cnt);
		for (int i = 0 ; i<num.length ; i++ ) {
			System.out.println(num[i]);
		}
	}
}