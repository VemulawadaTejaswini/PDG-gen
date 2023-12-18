import java.util.Scanner;

import java.util.*;	
public class Main {
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
		int[][] parts = new int[3][N];
		long count = 0;
		int  foundA=0;
		int  foundB=0;
	    for(int i=0; i<3; i++) {
			for(int j = 0;j<N;j++){
	    		parts[i][j]=sc.nextInt();
	    	}
			 Arrays.sort(parts[i]);
	    }
	    for(int i = 0; i<N; i++) {
	    	  foundA = lower(parts[0],parts[1][i]);
	    	  foundB = upper(parts[2],parts[1][i]);
	    	  count+=(long)((foundA)*(N-foundB));
	    		
	     }
	    System.out.println(count);
	}
}

