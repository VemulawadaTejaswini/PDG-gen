

import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] L = new int[N];
        int[] count = new int[N-1];
        
        for(int i = 0; i < N-1; i++) {
        	for(int j = i + 1; j < N; j++) {
        		L[i] = Math.min(j-i, 
        								Math.min(Math.abs(X-i) + 1 + Math.abs(Y-j),
        										 Math.abs(Y-i) + 1 + Math.abs(X-j) ));
        		count[L[i] -1 ] ++;
        	}
        }
        
        for(int ans : count) {
        	System.out.println(ans);
        }

        
	}
}

 