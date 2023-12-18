import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int [] a = new int[A];
		int [] b = new int[B];
		int min1 =1000000;
		int min2 =1000000;
		int min3 =2000000;
		
		for(int i=0; i<A;i++){
		    a[i] = sc.nextInt();
		    if(min1>a[i]){
		        min1 = a[i];
		    }
		}
		
		for(int i=0; i<B; i++){
		    b[i] = sc.nextInt();
		    if(min2>b[i]){
		        min2 = b[i];
		    }
		}
		
    	int [] x = new int[M];
		int [] y = new int[M];
		int [] c = new int[M];
		
		for(int i=0; i<M; i++){
		    x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            c[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<M; i++){
		   if( a[x[i]-1]+b[y[i]-1]-c[i] <min3){
		        min3 = a[x[i]-1]+b[y[i]-1]-c[i];
		    }
		}
		
		if(min1+min2 >= min3){
		    System.out.println(min3);
		}
		else{
	
		System.out.println(min1+min2);
		}
 	}
}