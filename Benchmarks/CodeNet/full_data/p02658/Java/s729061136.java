package rensyuu;

import java.util.*;

public class Bmondai {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N= keyboard.nextInt();
		long[] a = new long[N];
		
		for(int i =0; i<N; i++) {
			a[i] = keyboard.nextLong();			
		}
		
		long ans = 1;
		for(int k =0; k<N; k++) {
			if(a[k] == 0) {
				System.out.print(-1);
				keyboard.close();
				return;
			}
		}

		
		long cons = 1000000000000000000L;

		
		for(int j=0; j<N; j++) {
			if(a[j] !=0) {
				if(a[j] <= cons/ans) {
					ans = ans*a[j];	
				}else {
					ans = -1;
					break;
				}
			}else{
				ans = 0;
				break;
			}
		}
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}



