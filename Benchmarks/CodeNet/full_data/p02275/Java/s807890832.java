import java.io.*;
import java.util.*;

public class Main{
	public static int max = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] st = (br.readLine()).split(" ");
		int[] a = new int[n];
		int[] b = new int[n];
		toInt(st,a);
		int[] c = new int[max+1];


		for (int j = 0; j<n ; j++ ) {
			c[a[j]]++;
		}

		for (int i = 1; i<=max ; i++ ) {
			c[i] = c[i] + c[i-1];
		}

		for (int j = n-1; j>=0 ; j-- ) {
			b[c[a[j]]-1] = a[j];
			c[a[j]]--;
		}

		printing(b);
	}
	public static void toInt(String[] st,int[] a){
		for (int i = 0; i<st.length ; i++ ) {
			a[i] = Integer.parseInt(st[i]);
			max = Math.max(max,a[i]);
		}
	}

	public static void printing(int[] a){
		for (int i = 0; i<a.length ; i++ ) {
			if (i == a.length-1) {
				System.out.println(a[i]);
			}else{
				System.out.print(a[i] + " ");
			}
		}
	}
}