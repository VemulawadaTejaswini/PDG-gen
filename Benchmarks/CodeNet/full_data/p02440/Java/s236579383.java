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
			int com = sc.nextInt();
			int b = sc.nextInt();
			int e = sc.nextInt();
			if(com == 0){
				int res = 1000000001;
				for(int j = b; j < e; j++) res = Math.min(res, a[j]);
				System.out.println(res);
			}else{
				int res = -1000000001;
				for(int j = b; j < e; j++) res = Math.max(res, a[j]);
				System.out.println(res);
			}
		}
	}
}

