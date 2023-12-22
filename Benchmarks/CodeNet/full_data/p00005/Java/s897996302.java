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
	if(b==0)
	    return a;
	else return getGCD(b ,a%b);
	
	    }

      static long getLCM(long a,long b){
	  return a*b/(getGCD(a,b));
    }
}