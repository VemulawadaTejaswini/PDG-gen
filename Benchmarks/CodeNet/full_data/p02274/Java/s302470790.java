import java.util.Scanner;

class Main{
    private static int[] A;
    private static long  count=0;
    private static int max = 1100000000;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	A = new int[n];
	int p = n;
	for(int i=0;i<n;i++){
	    A[i] = sc.nextInt();
 
	}
       
	mergeSort(0,n);
       
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
	    }else{
		A[k] = R[j];
		j++;
		count += n1-i;
		
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

