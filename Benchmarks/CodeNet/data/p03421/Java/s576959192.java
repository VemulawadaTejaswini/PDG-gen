import java.util.*;
import java.io.*;

public class Main {
    public static String reverse(long start, long end){
    	//print "end end-1 ... start+1 start"
    	String ans ="";
    	for(long i=end;i>start;i--) ans=ans+i+" ";
    	ans=ans+start;
    	return ans;
    }
    
    public static void ans(long N, long A, long B){
    	if(A*B<N || A+B-1>N){
    	    System.out.println(-1);
    	    return;
    	}
    	String ans="";
    	
    	ans=ans+reverse(1,B)+" ";
    	long next = B+1;
    	long leftBlocks=A-1;
    	while(next<=N){
    	    long leftElms = N-next+1;
    	    if(B-1+leftBlocks<=leftElms){
    	    	ans = ans+ reverse(next,next+B-1)+" ";
    	    	next = next+B;
    	    	leftBlocks--;
    	    }else{
    	    	ans = ans+ reverse(next,N-leftBlocks+1)+" ";
    	    	next=N-leftBlocks+2;
    	    	leftBlocks--;
    	    }
    	}
    	System.out.println(ans.substring(0,ans.length()-1));
    	
    	
    	
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        ans(N,A,B);
        
    }
}