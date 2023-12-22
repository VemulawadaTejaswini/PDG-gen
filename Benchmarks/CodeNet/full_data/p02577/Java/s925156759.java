import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String N = s.next();
	
	long count = 0;
	for(int i = 0; i < N.length(); i++){
		count = count + (long)N.charAt(i);
	}
	
	if(count%9==0){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}

    
  }
}