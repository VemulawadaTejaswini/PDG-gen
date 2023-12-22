import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.next());
      	int K = Integer.parseInt(sc.next());
      	long[] A = new long[N];
      	for (int i=0; i<N; i++) {A[i] = sc.nextLong();}
      
      	long[] R = new long[N - K + 1];//評価を格納
      	long delta;//評価の差
      	long multi = 1;//掛け算の値
      	
      	for (int i = 0; i < N - K + 1; i++) {
          	multi = 1;//initialize
        	for (int j = i; j < i + K; j++) {
              	multi *= A[j];
            	}
          	R[i] = multi;//memorize
          	if (i > 0) {
            	delta = R[i] - R[i - 1];
              	if (delta > 0) {
              	System.out.println("Yes");
            	} else {System.out.println("No");}
            }
        }
	}
}