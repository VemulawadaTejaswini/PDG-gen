import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] ok = new int [N];
        int cost = 0;
        int max = 9999;
        for(int i = 0; i<N; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
        for (int i = 0; i<N; i++) {
        	for (int z = 0; z<N; z++) {
        		ok[z] = 0;        		
        	}
        	int a = x[i];
        	int b = y[i];
        	ok[i] = 1;
        	cost = 1;
        	// A１～N-1までループ
        	for (int j = 0; j<N; j++ ) {
        		// p,qを設定
        		int p = x[j] - a;
        		int q = y[j] - b;
        		System.out.println("p=" + p + ",q=" + q );
        		ok[j] = 1;
        		int wa = x[j];
        		int wb = y[j];
        		for (int k = 1; k<9999; k++) {
        			// Aコストを増やさずできるか判定
        			if (wa + p == x[k] && wb + q == y[k] && ok[k] == 0) {
        				wa = wa + p;
        				wb = wb + q;
        				ok[k] = 1;
        			} else if(wa - p == x[k] && wb - q == y[k] && ok[k] == 0) {
        				wa = wa - p;
        				wb = wb - q;
        				ok[k] = 1;        				
        			} else {
        				if (ok[k]==0) {
       						wa = x[k];
       						wb = y[k];
       						ok[k] = 1;
        					cost++;
        				}
        			}
        			
        			// A終了か判定
    				int flg=0;
					for (int z=0;z<N;z++) {
						if (ok[z]==0) {
							flg =1;
						}
					}
    				if (flg==0) {
    					System.out.println(cost);
    					if (max > cost) {
    						max = cost;
    					}
    					break;
    				}
        		}
        	}
        }
        int ans=1;
        if(N>1) {          	
         ans = max;	
        }
        System.out.println(ans);
    }
}