import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int X = s.nextInt();
	int count = 1;
	int src = X;
	while(src != 0){
		src = (src+X)%360;
		count++;
	}
	System.out.println(count);

    
  }
}