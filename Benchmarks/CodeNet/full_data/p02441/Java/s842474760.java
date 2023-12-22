import java.util.*;
import java.lang.Math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int b = sc.nextInt();
			int e = sc.nextInt();
			int k = sc.nextInt();
			int res = 0;
			for(int j = b; j < e; j++)
				if(a[j] == k) res++;
			System.out.println(res);
		}
	}
}

