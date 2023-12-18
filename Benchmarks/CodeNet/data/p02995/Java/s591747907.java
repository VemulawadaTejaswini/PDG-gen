import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		System.out.println( (B-A+1) - (B/C+B/D-B/(C*D)) + (A/C+A/D-A/(C*D)) );     
	}
}
