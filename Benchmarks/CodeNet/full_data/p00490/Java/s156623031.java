package kadai_2;

import java.util.*;

public class BestPizza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] D = new int[k];
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < k; i++){
			D[i] = sc.nextInt();
		    int kc = C/A;
		    int tc = D[i]/B;
		    
		    if(tc > kc){
		    	x = x+D[i];
		    	y = y+1;
		    }
		}
		System.out.println((C+x)/(A+B*y));

	}

}