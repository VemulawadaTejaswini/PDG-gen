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
    public static void printReverse(long start, long end){
    	//print "end end-1 ... start+1 start"
    	for(long i=end;i>start;i--) System.out.print(i+" ");
    	System.out.print(start);
    }
    
    public static void ans(long N, long A, long B){
    	if(A*B<N || A+B-1>N){
    	    System.out.println(-1);
    	    return;
    	}
    	if(A==1&&B==N){
    		printReverse(1,N);
    		return;
    	}
    	
    	printReverse(1,B);
    	
    	long next = B+1;
    	long leftBlocks=A-1;
    	if(next<=N) System.out.print(" ");
    	while(next<=N){
    	    long leftElms = N-next+1;
    	    if(B-1+leftBlocks<=leftElms){
    	    	printReverse(next,next+B-1);
    	    	next = next+B;
    	    	leftBlocks--;
    	    	if(next<=N) System.out.print(" ");
    	    }else{
    	    	printReverse(next,N-leftBlocks+1);
    	    	next=N-leftBlocks+2;
    	    	leftBlocks--;
    	    	if(next<=N) System.out.print(" ");
    	    }
    	}
    	
    	
    	
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        ans(N,A,B);
        
    }
}