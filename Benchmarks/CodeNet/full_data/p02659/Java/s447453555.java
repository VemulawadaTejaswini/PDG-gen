import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		double B = sc.nextDouble();
		int C = (int)(B*100);      
		System.out.println(A*C/100);
	}
}
