import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
	Scanner s = new Scanner(System.in);
	long a,b;
	
	while(s.hasNext()){
	    a=s.nextInt();
	    b=s.nextInt();
	    System.out.println(getGCD(a,b)+" "+getLCM(a,b));
	    /* System.out.println(a*b);*/
	}
    }
    
    
  
    
    static long getGCD(long a, long b){
	for(long i=a;i>0;i--){
	    if(a%i==0 &&b%i==0 )
		return i;
	}
	return 1;
    }

      static long getLCM(long a,long b){
	  return a*b/(getGCD(a,b));
    }
}