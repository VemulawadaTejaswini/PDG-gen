import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int all = X*Y*Z;
    int K = sc.nextInt();
    long[] A = new long[X];
    long[] B = new long[Y];
    long[] C = new long[Z];
    for(int i = 0; i < A.length; i++) {
    	A[i] = sc.nextLong();
    }
    for(int i = 0; i < A.length; i++) {
    	B[i] = sc.nextLong();
    }
    for(int i = 0; i < A.length; i++) {
    	B[i] = sc.nextLong();
    }
    long[] total = new long[all];
    long buffer = 0;
    long buffer2 = 0;
    long buffer3 = 0;
    
    for(int i = 0; i < K; i++) {
    	for(int n = 0; n < X; n++) {
    		if(buffer < A[n]) {
    			buffer = A[n];
    		}
    	}
    	for(int n = 0; n < Y; n++) {
    		if(buffer2 < B[n]) {
    			buffer2 = B[n];
    		}
    	}
    	for(int n = 0; n < Z; n++) {
    		if(buffer3 < C[n]) {
    			buffer3 = C[n];
    		}
    	}
    	
    	total[i] += buffer + buffer2 + buffer3;
    }
    for(int t = 0; t < K; t++) {
    	System.out.println(total[t]);
    }
    
  }
  
}