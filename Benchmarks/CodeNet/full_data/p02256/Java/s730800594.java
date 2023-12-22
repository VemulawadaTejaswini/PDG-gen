import java.util.*;
public class Main {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		Main calc = new Main(); 
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(calc.GCF(a, b));
	}	
	public long GCF(long a, long b) {
	    if (b == 0) return a;
	    else return (GCF (b, a % b));
	}
}