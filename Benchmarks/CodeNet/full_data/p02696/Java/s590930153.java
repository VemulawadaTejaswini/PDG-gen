import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long n = stdIn.nextLong();

		Func func = new Func(a,b);

		long maxMod = getMaxMod(a,b,n);
		long max = func.getValue(maxMod);

		System.out.println(max);
		for(int i = 1; i <= 1000000; i++) {
			maxMod = maxMod + b;
			if(maxMod < n) {
				break;
			}
		}

		stdIn.close();
	}

	public static long getMaxMod(long a,long b,long n) {
		if(b-1 > n) {
			return n;
		}
		return b-1;
	}
}

class Func {
	long a;
	long b;


	public Func(long a, long b) {
		super();
		this.a = a;
		this.b = b;
	}


	public long getValue(long x) {
		return (long)Math.floor((((double)a/(double)b))*(double)x) - a * (long)Math.floor((double)x/(double)b);
	}
}