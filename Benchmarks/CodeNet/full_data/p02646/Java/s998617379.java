import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		long itCoord = input.nextLong();
		long itSpeed = input.nextLong();
		long altC = input.nextLong();
		long altS = input.nextLong();
		long T = input.nextLong();
		long diff = itSpeed-altS;
		if (altC<itCoord) System.out.println("NO");
		else if (diff*T>=itCoord-altC) System.out.println("YES");
		else System.out.println("NO");
	}
}
