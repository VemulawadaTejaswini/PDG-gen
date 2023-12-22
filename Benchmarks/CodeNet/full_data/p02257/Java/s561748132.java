import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int i=0;
	int Prime_COUNT = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str_A = br.readLine();
	
	int n = Integer.parseInt(str_A);
	
	int A[];
	A = new int[n];
	 
	for(i=0;i<A.length;i++){
	    String a = br.readLine();
	    A[i] = Integer.parseInt(a);
	}
	
	for(i=0;i<A.length;i++){
	    isPrime(A[i]);
	    if(isPrime(A[i]) == true) Prime_COUNT++;
	}
	
	System.out.println(Prime_COUNT);
	return ;
    }

    public static boolean isPrime(int x){
	if(x == 2) return true;
	if(x<2 || x%2 == 0) return false;

	int i = 3;
	while(i<= Math.sqrt((double)x)){
	    if(x%i == 0) return false;
	    i = i+2;
	}

	return true;
    }
}
      

