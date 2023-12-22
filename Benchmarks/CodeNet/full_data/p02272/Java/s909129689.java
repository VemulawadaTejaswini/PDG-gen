//17D8101026B 横川　大貴
//Java

import java.util.Scanner;

class Main{
    private static int[] A;
    private static int count=0;
    private static int max = 1100000000;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	A = new int[n];
	for(int i=0;i<n;i++){
	    A[i] = sc.nextInt();
	}
       
	mergeSort(0,n);

	for(int i=0;i<n; i++){	
	    System.out.print(A[i]);
		if(i<n-1){
		    System.out.print(" ");
		}else{
		    System.out.println();
		}
	}
	System.out.println(count);
	
	
    }
    public static void merge(int left, int mid, int right){
	int n1 = mid - left;
	int n2 = right - mid;
	int[] L = new int[n1+1];
	int[] R = new int[n2+1];
	for(int i=0; i<n1; i++){
	    L[i] = A[left+i];
	}
	for(int i=0; i<n2; i++){
	    R[i] = A[mid+i];
	}
	L[n1]=max;
	R[n2]=max;
	int i=0;
	int j=0;
	for(int k=left;k<right;k++){	    
	    if(L[i] <= R[j]){
		A[k] = L[i];
		i++;
		count++;
	    }else{
		A[k] = R[j];
		j++;
		count++;
	    }
	}
    }
    public static void mergeSort(int left,int right){
	if(left+1<right){
	    int mid = (left+right)/2;
	    mergeSort(left, mid);
	    mergeSort(mid, right);
	    merge(left,mid, right);
	}
    }
}

