import java.util.Scanner;

import java.util.*;

public class Main{

	
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int k = scan.nextInt();



		Long[] a = new Long[x];
		Long[] b = new Long[y];
		Long[] c = new Long[z];
		for(int i = 0; i < x; i++){
			a[i] = scan.nextLong();
		}
		for(int i = 0; i < y; i++){
			b[i] = scan.nextLong();
		}
		for(int i = 0; i < z; i++){
			c[i] = scan.nextLong();
		}

		Long[] all = new Long[x*y*z];
		
		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b, Collections.reverseOrder());
		Arrays.sort(c, Collections.reverseOrder());
		int p = 0;
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				for(int l = 0; l < z; l++){
					all[p++] = a[i]+ b[j]+c[l];
				}
			}
		}
		Arrays.sort(all, Collections.reverseOrder());

		for(int i = 0; i < k; i++){
			System.out.println("" + all[i]);
		}
		// Arrays.sort(all, Collections.reverseOrder());

		// int ap = 0;
		// int bp = 0;
		// int cp = 0;

		// System.out.println(a[ap] + b[bp] + c[cp]);
		// for(int i = 0 ; i < k; i++){
		// 	System.err.println("" + ap + ":" + bp + ":" +cp);

		// 	long _a = 0;
		// 	long _b = 0;
		// 	long _c = 0;
		// 	if (ap + 1 < a.length){
		// 		_a  = a[ap+1];
		// 	}
		// 	if (bp + 1 < b.length){
		// 		_b  = b[bp+1];
		// 	}
		// 	if (cp + 1 < c.length){
		// 		_c  = c[cp+1];
		// 	}

		// 	if(_a >  _b &&   _a > _c ){
		// 		System.out.println(a[ap+1] + b[bp] + c[cp]);
		// 	}else if(_b >  _a &&   _b > _c ){
		// 		System.out.println(a[ap] + b[bp+1] + c[cp]);
		// 	}else{
		// 		System.out.println(a[ap] + b[bp+1] + c[cp+1]);
		// 	}

			
		// }
		
	}
}
