import java.util.*;
import java.io.*;
class Main{
    public static int count=0;
    public static int[] l;
    public static int[] r;
    public static void main(String args[]){
	l = new int[100000];
	r = new int[100000];
	int i,n;
	int s[] = new int[100000];
	Scanner scan = new Scanner(System.in);
	
	n = scan.nextInt();
	for(i=0;i<n;i++){
	    s[i] = scan.nextInt();
	}
	mergeSort(s,0,n);
	for(i=0;i<n;i++){
	    if(i==n-1){
		System.out.println(s[i]);
		System.out.println(count);
		continue;
	    }
	    System.out.print(s[i]+" ");
	}
    }

    public static void merge(int s[],int left,int mid,int right){
	int i,j,k,n1,n2;
	n1 = mid -left;
	n2 = right - mid;
	
	for(i=0;i<n1;i++){
	    l[i] = s[left+i];
	}
	for(i=0;i<n2;i++){
	    r[i] = s[mid+i];
	}
	l[n1] = 2147483647;
	r[n2] = 2147483647;
	i=0;
	j=0;
	for(k=left;k<right;k++){
	    if(l[i]<=r[j]){
		s[k] = l[i];
		i = i+1;
		count++;
	    }
	    else{
		s[k] = r[j];
		j = j+1;
		count++;
	    }
	}
    }
    
    public static void mergeSort(int s[],int left,int right){
	int mid=0;
	// int a[] = new int[100000];
	if(left+1<right){ /*分割する*/
	    mid = (left+right)/2;
	    mergeSort(s,left,mid);
	    mergeSort(s,mid,right);
	    merge(s,left,mid,right);
	}
    }
    
}

