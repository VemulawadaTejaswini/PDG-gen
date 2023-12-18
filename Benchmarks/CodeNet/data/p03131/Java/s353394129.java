import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		long a=0;//hit my pocket
		long b=0;//bisquit to yen
		long c=0;//yen to biscuit
		if (A+1>=B) {
			System.out.println(K+1);
		}else {
			a+=K-A-1;
			K-=K-A-1;
			if (K%2==0) {
				b=K/2;
				c=K/2;
			}else if(K%2==1) {
				b=(K-1)/2;
				c=(K-1)/2;
				a++;
			}
			long bisquit = 1+a+(B-A)*b;
			System.out.println(bisquit);
		}
	}
}