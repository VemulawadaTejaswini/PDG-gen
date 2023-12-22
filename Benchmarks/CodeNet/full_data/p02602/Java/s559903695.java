//クラス名は必ずMainにする必要があります。

import java.util.*;

public class Main {
  	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		long a = 1;
		long b = 1;
		
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i <= n-k; i++){
			for(int j = i; j < k+i; j++){
				b *= ary[j]; 
				
			}
	
			if(a < b || i == 0){
				
				a = b;
				b = 1;
				
				if(i >= 1){
					System.out.println("Yes");
				}
			}else{
				a = b;
				b = 1;
				System.out.println("No");
			}
		}
		
	}
	
}
