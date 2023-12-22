import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int h=Integer.parseInt(br.readLine());

	int a[]=new int[h+1];
	String str[]=br.readLine().split(" ");
	
	for(int i=0;i<h;i++){
	    a[i+1]=Integer.parseInt(str[i]);
	}

	for(int i=h/2;i>=1;i--){
	    maxHeapify(a,h,i);
	}

	for(int i=1;i<=h;i++){
	    System.out.print(" "+a[i]);
	}
	System.out.println();
    }

    static void maxHeapify(int a[],int h,int i){
	    int left=getLeft(i);
	    int right=getRight(i);

	    int max=0;

	    if(left<=h && a[left]>a[i]){
		max=left;
	    }else{
		max=i;
	    }

	    if(right<=h && a[right]>a[max]){
		max=right;
	    }

	    if(max!=i){
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
		maxHeapify(a,h,max);	
	    }
    }
    
    static int getParent(int i){
	return i/2;
    }

    static int getLeft(int i){
	return 2*i;
    }

    static int getRight(int i){
	return 2*i+1;
    }
}

