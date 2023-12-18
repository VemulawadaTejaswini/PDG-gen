import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
	static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	static void heapify(int index, int[] arr, int n){
		int parent = index;
		int l = 2*parent + 1;  
		int r = 2*parent + 2; 
		int next_parent = parent;
    	if (l < n && arr[l] < arr[parent]) 
        	next_parent = l; 
    	if (r < n && arr[r] < arr[next_parent]) 
        	next_parent = r; 
    	if (next_parent != parent){ 
        	swap(arr,parent,next_parent); 
        	heapify(next_parent, arr, n); 
    	}
	}
	static void buildHeap(int[] arr, int n){
		int last_non_leaf_node = (n/2) - 1;
		for(int i=last_non_leaf_node;i>=0;--i)
			heapify(i,arr,n);
	}
	static void heapifyM(int index, int[] arr, int n){
		int parent = index;
		int l = 2*parent + 1;  
		int r = 2*parent + 2; 
		int next_parent = parent;
    	if (l < n && arr[l] > arr[parent]) 
        	next_parent = l; 
    	if (r < n && arr[r] > arr[next_parent]) 
        	next_parent = r; 
    	if (next_parent != parent){ 
        	swap(arr,parent,next_parent); 
        	heapifyM(next_parent, arr, n); 
    	}
	}
	static void buildHeapMax(int[] arr, int n){
		int last_non_leaf_node = (n/2) - 1;
		for(int i=last_non_leaf_node;i>=0;--i)
			heapifyM(i,arr,n);
	}
	static void rev(int[] arr){
		int end = arr.length - 1;
		int start = 0;
		while (start < end){
			swap(arr,start,end);
			++start;
			--end;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int na = sc.nextInt();
		int nb = sc.nextInt();
		int nc = sc.nextInt();

		int[] a = new int[na];
		int[] b = new int[nb];
		int[] c = new int[nc];
		
		for(int i=0;i<na;++i) a[i] = sc.nextInt();
		for(int i=0;i<nb;++i) b[i] = sc.nextInt();
		for(int i=0;i<nc;++i) c[i] = sc.nextInt();
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		rev(a);
		rev(b);
		rev(c); 
		
		int[] heapA = new int[x];
		int[] heapB = new int[y];
		
		for(int i=0;i<x;++i) heapA[i] = a[i];
		for(int i=0;i<y;++i) heapB[i] = b[i];
		
		long valA = 0;
		long valB = 0;
		for(int i=0;i<y;++i) valA += heapA[i];
		for(int i=0;i<x;++i) valB += heapB[i];
		
		buildHeap(heapA,x);
		buildHeap(heapB,y);

		buildHeapMax(c,nc);

		// System.out.println(Arrays.toString(heapA));
		// System.out.println(Arrays.toString(heapB));
		// System.out.println(Arrays.toString(c));
		// System.out.println(valA + " " + valB);

		while (c[0] > heapA[0] || c[0] > heapB[0]){
			if (heapA[0] < heapB[0]){
				if (c[0] > heapA[0]){
					valA -= heapA[0];
					valA += c[0];
					int temp1 = heapA[0];
					heapA[0] = c[0];
					c[0] = temp1;
					heapifyM(0,c,nc);
					heapify(0,heapA,x);
				}
			}
			else{
				if (c[0] > heapB[0]){
					valB -= heapB[0];
					valB += c[0];
					int temp2 = heapB[0];
					heapB[0] = c[0];
					c[0] = temp2;
					heapifyM(0,c,nc);
					heapify(0,heapB,y);
				}
			}
		}

		System.out.println(valA + valB);
	}
}