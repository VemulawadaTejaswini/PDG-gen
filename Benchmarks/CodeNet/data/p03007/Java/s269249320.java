
import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] x = new Integer[N];
        for(int i = 0; i<N; i++) {
        	x[i] = sc.nextInt();
        }
        Arrays.sort(x, Comparator.reverseOrder());
//        for(int i = 0; i<N; i++) {
//        	System.out.println(x[i]);
//        }
        int M = 0;
        for(int i=0;i<N;i++) {
        	if(N%2==0) {
        		if(i<N/2) {
        			M = M + x[i];
        		}else {
        			M = M - x[i];
        		}
        	} else {
        		if(i<N/2+1) {
        			M = M + x[i];
        		}else {
        			M = M - x[i];
        		}        		
        	}
        }
        System.out.println(M);
        
		int tmp=0;
        if(N%2==0) {
        	for(int j=0;j<N-1;j++) {
        		// A最大-最小
        		if(j==0) {
            		System.out.println(x[j] + " " + x[N-(j+1)]);
            		tmp = x[j]-x[N-(j+1)];
//            		System.out.println("最初tmp= " + tmp);
        		}
        		else if(j%2==1) {
        			System.out.println(x[N-(j/2+2)] + " " + tmp);
        			tmp = x[N-(j/2+2)] - tmp;
//            		System.out.println("奇数tmp= " + tmp);
        		} else {
        			System.out.println(x[j/2] + " " + tmp);
        			tmp = x[j/2] - tmp;
//            		System.out.println("偶数tmp= " + tmp);
        		}	
        	}
        }
        else {
        	for(int j=0;j<N-2;j++) {
        		// A最大-最小
        		if(j==0) {
            		System.out.println(x[N-(j+1)] + " " + x[j+1]);
            		tmp = x[N-(j+1)] - x[j+1];
//            		System.out.println("最初tmp= " + tmp);
        		}
        		else if(j%2==0) {
        			System.out.println(x[N-(j/2+1)] + " " + tmp);
        			tmp = x[N-(j/2+1)] - tmp;
//            		System.out.println("奇数tmp= " + tmp);
        		} else {
        			System.out.println(x[j/2 + 2] + " " + tmp);
        			tmp = x[j/2 + 2] - tmp;
 //           		System.out.println("偶数tmp= " + tmp);
        		}	
        	}
			System.out.println(x[0] + " " + tmp);
        	tmp = x[0] - tmp;
        }
        
        int ans=tmp;
        if(N>1) {          	
         ans = tmp;	
        }
//        System.out.println(ans);
    }
}
