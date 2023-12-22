import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int count = 0;
	int R = sc.nextInt();
	int[] A = new int[R];
	for(int i = 0;i < R;i++){
	    A[i] = sc.nextInt();
	}
	int N = sc.nextInt();
	int[] B = new int[N];
	for(int j = 0;j < N;j++){
	    B[j] = sc.nextInt();
	}
	for(int j = 0;j < N;j++){
	    if(binarySearch(A,B[j])){
		count++;
	    }
	}
	System.out.println(count);
    }
 //     public static boolean linearSearch(int[] A,int key){
//     	int i = 0;
//     	for(i = 0;i < A.length;i++){
//     	    if(A[i] == key){
//     		return true;
//     	    }
//     	}
//     	return false;
//     }
// }
    public static boolean binarySearch(int[] A,int key){
    	int left = 0;
    	int right = A.length;
    	int mid = 0;
    	while(left < right){
    	    mid = (left + right) / 2;
	 
    	    if(A[mid] == key){
    		return true;
    	    }else if(key < A[mid]){
    		right = mid;
    	    }else{
    		left = mid + 1;
    	    }
    	}
    	return false;
    }
}

