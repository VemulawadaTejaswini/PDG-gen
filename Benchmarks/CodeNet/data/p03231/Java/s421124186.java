import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int ans = -1;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		
		int L = N*M;
		
		String a[] = new String[L];
		String b[] = new String[L];
		
		for(int i = 0 ; i<N ; i++) {
			char c1 = S.charAt(i);
			a[M*i ] = String.valueOf(c1);
		}
		for(int i = 0 ; i<M ; i++) {
			char c2 = T.charAt(i);
			b[N*i] = String.valueOf(c2);
		}
		outside : {
			for(int i = 0 ; i<L ; i++) {
		
				if((a[i]!=null)&&(b[i]!=null)) {
					
					if(!(a[i].equals(b[i]))) {
						break outside;
					}
					
				}
			}
			
			flag = true;
			
		}
		
		if(flag) {
			int temp;
			while((temp = N%M)!=0) {
				N = M;
				M = temp;
			}
			ans =  (int)(L/M);
		}
		
		
		
		
		
		System.out.println(ans);
		sc.close();
	}

}