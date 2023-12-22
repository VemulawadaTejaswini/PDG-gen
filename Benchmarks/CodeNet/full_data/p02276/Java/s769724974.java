import java.util.Scanner;
class Main{
    public static void main(String args[]){
	int A[] = new int[100000];
	int i,j,n,l,count=0;
	Scanner scan = new Scanner(System.in);
	
	n = scan.nextInt();
	
	for(i=0;i<n;i++){
	    A[i] = scan.nextInt();
	}
	
	l = partition(A,0,n-1);
	
	for(i=0;i<n;i++){
	    if(A[l]==A[i]){
		count++;
	    }
	}
	
	for(i=0;i<n;i++){
	    if(A[l]==A[i]){
		count--;
		if(count<1){
		System.out.print("["+A[i]+"] ");
		continue;
		}
	    }
	    if(i==n-1){
		System.out.println(A[i]);
		break;
	    }
	    System.out.print(A[i]+" ");
	}
    }
    
    public static int partition(int A[],int p,int r){
	int i,j,x,temp=0;
	
	x = A[r];
	i = p-1;
	for(j=p;j<r;j++){
	    if(A[j]<=x){
		i++;
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	    }
	}
	temp = A[i+1];
	A[i+1] = A[r];
	A[r] = temp;
	return i+1;
    }
}

