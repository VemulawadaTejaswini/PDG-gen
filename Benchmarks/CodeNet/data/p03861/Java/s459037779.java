import java.util.*;
public class Main{
	static long NumOfDiv(long n, long p){
		return n/p;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		System.out.println(NumOfDiv(b, x)-NumOfDiv(a-1, x));
	}
}