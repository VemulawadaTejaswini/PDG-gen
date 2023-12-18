import java.util.*;
public class Main{
	static long NumOfDiv(long n, long p){
		if(n<0)return 0;
      	else return n/p + 1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		System.out.println(NumOfDiv(b, x)-NumOfDiv(a-1, x));
	}
}