import java.util.*;

public class D{
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	Integer A[]= new Integer[N];
	int a[]= new int[N];
	int front=0,rear=N-1;
	boolean flag=true;
	int com=0;
	
	for(int i=0; i<N; i++){
	    A[i]=sc.nextInt();
	}
	Arrays.sort(A, Comparator.reverseOrder());
	for(int i=0; i<N; i++){
	    if(i!=0 && A[i]==A[i-1] && flag){
		a[rear]=A[i];
		if(rear!=N-1){
		    com=com+a[rear+1];
		}else{
		    com=com+a[front-1];
		}
		rear=rear-1;
		flag=false;
	    }else{
		a[front]=A[i];
		if(front==0){
		    com=0;
		}else{
		    com=com+a[front-1];
		}
		front++;
		flag=true;
	    }
	}
	System.out.println(com);
	
    }
}
