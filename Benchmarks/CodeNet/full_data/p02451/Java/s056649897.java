import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int[] a = new int[n];
		str = br.readLine().split(" ");
		for(int i = 0; i < n; i++) a[i] = Integer.parseInt(str[i]);
		str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int k = Integer.parseInt(str[0]);
			if(Arrays.binarySearch(a, k) >= 0) System.out.println(1);
			else System.out.println(0);
		}
	}
}

