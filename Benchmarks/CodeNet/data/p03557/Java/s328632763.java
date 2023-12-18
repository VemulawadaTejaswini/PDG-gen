import java.util.Scanner;

import java.util.*;	
public class Main1 {
	public static int lower(int A[],int key) {
		int left=-1;
		int right = A.length;
		int mid=0;
		while(right-left>1) {
			mid = (right + left)/2;
			 if(A[mid]>key){
				right = mid;
				
			}else if(A[mid]<key){
				left = mid;
			}else {
				return mid;
			}
			
		}
		return left+1 ;
		
	}
	public static int upper(int A[],int key) {
		int left=-1;
		int right = A.length;
		int mid=0;
		while(right-left>1) {
			mid = (right + left)/2;
			 if(A[mid]>key){
				right = mid;
				
			}else if(A[mid]<key){
				left = mid ;
			}else {
				return mid+1;
			}
			
		}
		return right;
	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		long count = 0;
		long  foundA=0;
		long  foundB=0;
	    for(int i=0; i<N; i++) {		
	    		A[i]=sc.nextInt();
	    	}
	    for(int i=0; i<N; i++) {		
    		B[i]=sc.nextInt();
    	}
	    for(int i=0; i<N; i++) {		
    		C[i]=sc.nextInt();
    	}
	    Arrays.sort(A);
	    Arrays.sort(B);
	    Arrays.sort(C);
	    
	    for(int i = 0; i<N; i++) {
	    	  foundA = lower(A,B[i]);
	    	  foundB = upper(C,B[i]);	    	  
	    	  count+=(long)((foundA)*(N-foundB));
	    		
	     }
	    System.out.println(count);
	}
}
