import java.util.*;
import java.io.*;

class Main{
    static int largest;
    static int l,r,H;
    static int[] A;
    public static void main(String args[]){
	int i,j;
	A = new int[500001];
	try{
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	    String str = buffer.readLine();
	    H = Integer.parseInt(str);
	    StringTokenizer st = new StringTokenizer(buffer.readLine());
	    for(i=1;i<=H;i++){
		A[i] = Integer.parseInt(st.nextToken());
	    }
	}catch(Exception e){
	    System.out.println("error");
	}
	buildMaxHeap(A);
	StringBuffer sb = new StringBuffer();
	for(i=1;i<=H;i++){
	    sb.append(" "+A[i]);
	}
	System.out.println(sb);	
    }

    static void buildMaxHeap(int A[]){
	int i;
	for(i=H/2;i>0;i--){
	    maxHeapify(A,i);
	}
    }

    static int left(int x){
	return 2*x;
    }
    static int right(int x){
	return 2*x+1;
    }
    static void maxHeapify(int A[],int i){
	int temp;
	l = left(i);
	r = right(i);
	if(l <= H && A[l] > A[i]){
	    largest = l;
	}
	else{largest = i;}

	if(r <= H && A[r] > A[largest]){
	    largest = r;
	}
	if(largest != i){
	    temp = A[i];
	    A[i] = A[largest];
	    A[largest] = temp;
	    maxHeapify(A,largest);
	}
    }
}

