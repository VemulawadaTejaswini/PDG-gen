import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
      	long b = sc.nextLong();
      	long c = sc.nextLong();
      	long d = sc.nextLong();
      	sc.close();
      
		long min = count(a - 1, c, d);
		long max = count(b, c, d);
      	System.out.println(max - min);
    }
  
  	public static long count(long x, long c, long d) {
    	return (x - ((x / c) + (x / d) - (x / (lcm(c, d)))));
    }
  
  	public static long lcm(long a, long b) {
    	long g = gcd(a, b);
      	return (a * b) / g;
    }
  
  	public static long gcd(long a, long b) {
    	if (a > b) {
			long tmp = a;
          	a = b;
          	b = tmp;
        }
      	if (a == 0) return b;
      	return gcd(b % a, a);
    }
}