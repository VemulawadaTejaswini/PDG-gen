import java.io.*;
import java.util.*;

public class Main{

    static int count=0;
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());
	String str[]=br.readLine().split(" ");
	int a[]=new int[n];
	
	for(int i=0;i<n;i++){
	    a[i]=Integer.parseInt(str[i]);
	}

	mergeSort(a,0,n);

	System.out.print(a[0]);
	for(int i=1;i<n;i++){
	    System.out.print(" "+a[i]);
	}
	System.out.print("\n");
	System.out.println(count);
    }
    static void mergeSort(int a[],int left,int right){
	if (left+1 < right){
	    int mid = (left + right)/2;
	    mergeSort(a, left, mid);
	    mergeSort(a, mid, right);
	    merge(a, left, mid, right);
	}
    }

    static void merge(int A[], int left, int mid, int right){
	int n1 = mid - left;
	int n2 = right - mid;

	int L[]=new int[n1+1];
	int R[]=new int[n2+1];

	int i=0;
	int j=0;
	
	for (i = 0;i<n1;i++)
	    L[i] = A[left + i];
	for (i = 0;i<n2;i++)
	    R[i] = A[mid + i];
	L[n1] = Integer.MAX_VALUE;
	R[n2] = Integer.MAX_VALUE;
	i=0;
	j=0;
	for (int k = left; k<right;k++){
	    if (L[i] <= R[j]){
		A[k] = L[i];
		i = i + 1;
	    }else{ 
		A[k] = R[j];
		j = j + 1;
	    }
	    count++;
	}
    }
}

