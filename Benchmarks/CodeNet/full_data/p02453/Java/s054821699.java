import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int[] a = new int[n + 1];
		a[0] = -1000000001;
		str = br.readLine().split(" ");
		for(int i = 0; i < n; i++) a[i + 1] = Integer.parseInt(str[i]);
		str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int k = Integer.parseInt(str[0]);
			int lb = 0;
			int ub = n + 1;
			while(ub - lb > 1){
				int mid = lb + (ub - lb) / 2;
				if(a[mid] >= k) ub = mid;
				else lb = mid;
			}
			System.out.println(ub - 1);
		}
	}
}

