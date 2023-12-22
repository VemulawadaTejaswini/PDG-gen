//クラス名は必ずMainにする必要があります。

import java.util.*;

public class Main {
  	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
		final int n = Integer.parseInt(sc.next());
		final int k = Integer.parseInt(sc.next());
		long a = 1;
		long b = 1;
		
		int[][] ary = new int[n][1];
		for(int i = 0; i < n; i++){
			ary[i][0] = Integer.parseInt(sc.next());
		}
		
		
		for(int i = 0, i_limit = n-k ; i <= i_limit; i++){
			for(int j = i, j_limit = k+i; j < j_limit; j++){
				b *= ary[j][0];
			}
			if(i != 0){
				if(a < b){
				
					System.out.println("Yes");
					
				}else{
					System.out.println("No");
				}
			}
			
			a = b;
			b = 1;
		}
		
	}
	
}
