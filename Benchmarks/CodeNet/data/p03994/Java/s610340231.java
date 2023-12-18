
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String str=sc.next();
	
	char ar[]=str.toCharArray();
	int L=ar.length;
	
	int left=sc.nextInt();
	for (int i = 0; i < L-1; i++) {
	    int aaa=va((int) ar[i]);
	    
	    if(aaa!=26&&aaa<=left){
		ar[i]='a';
		left-=aaa;
	    }
	}
	while(left>0){
	    if(left>=26){
		left%=26;
	    }else{
		ar[L-1]+=left;
		left=0;
		if(ar[L-1]>122)
		    ar[L-1]+=97-123;
		    
	    }
	
	}
	
	System.out.println(String.valueOf(ar));
	
    }

static int va(int aa){
    return -aa+97+26;
        
}
 
    
    
}
