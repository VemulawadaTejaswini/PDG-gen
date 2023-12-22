import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static int count = 0;
    //番兵
    
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] A = new int[N];
	for(int i = 0;i < N;i++){
	    A[i] = sc.nextInt();
	}
	mergeSort(A,0,N);
			
	for (int i = 0; i < N - 1; i ++) {
	    System.out.print(A[i] + " ");
	}
	System.out.println(A[N - 1]);
	System.out.println(count);
		
    }

    static void merge(int[] A,int left,int mid,int right){
	//分割
	int n1 = mid - left;
	int n2 = right - mid;
	
	int[] L = new int[n1 + 1];
	int[] R = new int[n2 + 1];
	
	for(int i = 0;i < n1;i++)L[i] = A[left + i];
	for(int i = 0;i < n2;i++)R[i] = A[mid + i];
	L[n1] = R[n2] = Integer.MAX_VALUE;
	int i = 0,j = 0;
	for(int k = left;k < right;k++){
	    count++;
	    /*配列L,Rに入ってる要素の小さい方から先に入れ、インクリメントを行う*/
	    if(L[i] <= R[j]){
		A[k] = L[i++];
	    }else{
		A[k] = R[j++];
	    }
	}
	

    }
        static void  mergeSort(int[] A,int left,int right){
    	if(left+1 < right){
    	    int mid = (left + right)/2;
    	    mergeSort(A, left, mid);
    	    mergeSort(A, mid, right);
    	    merge(A, left, mid, right);
    	}

    }
}

