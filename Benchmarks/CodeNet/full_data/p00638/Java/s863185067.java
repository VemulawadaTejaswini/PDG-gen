//2013 6/29
import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[])
    {	
	while(true){
	    int N = sc.nextInt();
	    if(N==0) break;
	    
	    int[] v = new int[N];
	    int[] w = new int[N];
	    for(int i=0; i<N; i++){
		v[i] = sc.nextInt();
		w[i] = sc.nextInt();
	    }

	    int[] tmp = new int[2];
	     for(int i=0; i<N-1; i++){
		 for(int j=i+1; j<N; j++){
		     if(w[i] == w[j] && v[i] >v[j]){
			 tmp[0] = w[i];
			 tmp[1] = v[i];
			 w[i] = w[j];
			 v[i] = v[j];
			 w[j] = tmp[0];
			 v[j] = tmp[1];
		     }
		     if(w[i] > w[j]){
			 tmp[0] = w[i];
			 tmp[1] = v[i];
			 w[i] = w[j];
			 v[i] = v[j];
			 w[j] = tmp[0];
			 v[j] = tmp[1];
		     }
		     
		 }	 
	    }
	     
	     
	     int t = 0;
	     boolean f = true;
	     for(int i=0;i<N;i++){
		 t+=v[i];
		 if(t > w[i]){
		     System.out.println("No");
		     f = false;
		     break;
		 }
	     }
	     
	     if(f) System.out.println("Yes");
	}
    }
}
	    
	    