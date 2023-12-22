import java.io.*;
import java.util.*;
class Main{
    public static int[] A;
    public static int[] B;
    public static int[] C;
    public static int n;
    public static void main(String[] args) {
	int i,k=0;
	A = new int[2000000];
	B = new int[2000000];
	C = new int[2000000];
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	try{
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String str = buffer.readLine();
	    String[] strs = str.split(" ");
	    for(i=0;i<n;i++){
		A[i] = Integer.parseInt(strs[i]);
		if(k<=A[i]){k = A[i];}
	    }
	}catch(Exception e){
	    System.out.println("error");
	}
	CountingSort(A,B,k);
	
	for(i=1;i<=n;i++){
	    if(i==n){System.out.print(B[i]);break;}
	    System.out.print(B[i]+" ");
	}
    }
    
    public static void CountingSort(int A[],int B[],int k){
	int i,j;
	for(i=0;i<k+1;i++){
	    C[i] = 0;
	}
	for(j=0;j<n;j++){
	    C[A[j]]++;
	}
	for(i=1;i<k+1;i++){
	    C[i] = C[i] + C[i-1];
	}
	for(j=n-1;j>=0;j--){
	    B[C[A[j]]] = A[j];
	    C[A[j]]--;
	}
    }
    
}

