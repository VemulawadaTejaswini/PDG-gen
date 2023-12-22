

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		long b = sc.nextLong();
		long n = sc.nextLong();

		if(b == 1){
			System.out.println(0);
			return;
		}

//		for(int i = 1; i < 20; i++){
//			System.out.println(Math.floor((double)a*i/b) - a*Math.floor(i/b));
//		}

		long tmpA = a;
		long tmpB = b;

		long gcd = gcd(tmpA, tmpB);

		long tmpX = b/gcd;

		if(n >= tmpX - 1){
			System.out.println((long)(Math.floor((double)a*(tmpX - 1)/b) - a*Math.floor((tmpX - 1)/b)));
		}
		else {
			System.out.println((long)(Math.floor((double)a*n/b) - a*Math.floor(n/b)));
		}
	}

	static long gcd(long a, long b){
    	long tmp;

    	while (a % b != 0)
    	{
    		tmp = b;
    		b = a % b;
    		a = tmp;
    	}
    	return b;
    }
}
