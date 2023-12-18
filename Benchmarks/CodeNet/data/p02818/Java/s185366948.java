import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	long A = s.nextLong();
	long B = s.nextLong();
	long K = s.nextLong();

	if(A >= K){
		A = A - K;
		K = 0;
	}else{
		A = 0;
		K = K - A;
	}

	if(K > 0){
		if(B >= K){
			K = 0;
			B = B - K;
		}else{
			K = 0;
			B = 0;
		}
	}
	
	System.out.println(A + " " + B);

    
  }
}