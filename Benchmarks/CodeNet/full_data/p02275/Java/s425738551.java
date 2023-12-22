import java.util.*;
import java.io.*;
class Main{
    public static int[] A;
    public static int[] B;
    public static int n;
    public static void main(String args[]){
	int i,j,k=0;
	A= new int[2000000];
	B= new int[2000000];
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	for(i=0;i<n;i++){
	    A[i] = scan.nextInt();
	    if(k<=A[i]){k = A[i];}
	}
	CountingSort(A,B,k);
	
	for(i=1;i<=n;i++){
	    if(i==n){System.out.println(B[i]);break;}
	    System.out.print(B[i]+" ");
	}
	
    }
    
    public static void CountingSort(int A[],int B[],int k){
	int i,j;
	int C[] = new int[2000000];
	for(i=0;i<k+1;i++){
	    C[i] = 0;
	}
	for(j=0;j<n;j++){
	    C[A[j]] = C[A[j]] + 1;
	}
	for(i=1;i<k+1;i++){
	    C[i] = C[i] + C[i-1];
	}
	for(j=n-1;j>=0;j--){
	    B[C[A[j]]] = A[j];
	    C[A[j]] = C[A[j]] - 1;
	}
    }
    
}

