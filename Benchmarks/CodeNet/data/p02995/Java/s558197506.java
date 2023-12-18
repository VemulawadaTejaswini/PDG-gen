import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long disC = B/C - (A-1)/C;
		long disD = B/D - (A-1)/D;
		long disCD = B/(C*D) - (A-1)/(C*D);
		System.out.println( (B-A+1) + disCD - disC - disD );
	}
}
