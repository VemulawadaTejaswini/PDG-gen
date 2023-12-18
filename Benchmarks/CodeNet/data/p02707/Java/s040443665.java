
import java.util.*;
import java.io.*;

class C {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[] = new int[N-1];
        int M[] = new int[N];
        

        for(int i=0;i<N;i++) {
        	M[i] = 0;
        }
        
        
        for(int i=0;i<N-1;i++) {
        	A[i] = Integer.parseInt(sc.next());;
          	for(int j=0;j<N;j++) {
        		if(A[i]-1 == j) {
        			M[j] ++;
        		}
        	}
        }       
        
        
       
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<N;i++){
        System.out.println(M[i]);
        }
        out.flush();
        
        
	}
}

