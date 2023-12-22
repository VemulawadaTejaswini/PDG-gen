import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
	int i =0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str_n = br.readLine();
	String str_A = br.readLine();

	int n = Integer.parseInt(str_n);
	
	int[] A = new int[n];
	int[] B = new int[n];
	int[] D = new int[n];

	Scanner sc_A = new Scanner(str_A).useDelimiter("\\s* \\s*");

	while(sc_A.hasNext()){
	    A[i] = sc_A.nextInt();
	    i++;
	}

	int k = maxSearch(A);

	CountingSort(A,B,D,k);

	for(i=0;i<n;i++){
	   System.out.print(B[i]);
	   if(i!=n-1) System.out.print(" ");
	    
	}
	
	System.out.println("");
	sc_A.close();
	
    }

    private static int maxSearch(int A[]){
	int max = A[0];
	
	for(int i=0;i<A.length;i++){
	    if(max<A[i]){
		max = A[i];
	    }
	}
	return max;
    }
    
    private static void CountingSort(int A[],int B[], int D[] ,int k){
	int[] C = new int[k+1];
	
	for(int i=0;i<k;i++){
	    C[i]=0;
	}

	for(int j=0;j<A.length;j++){
	    C[A[j]]++;
	}

	for(int i=1;i<k+1;i++){
	    C[i] = C[i] + C[i-1];
	}

	for(int j=A.length;0<j;j--){//A = new int[j]宣言で A[0]からA[j-1](要素A[j]はない)まで
	    B[C[A[j-1]]-1] = A[j-1];
	    C[A[j-1]]--;
	}
    }
}

