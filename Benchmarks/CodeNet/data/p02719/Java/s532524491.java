import java.util.Scanner;

public class Main {

	
	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	static void log(long i) {
		System.out.println(i);
	}

	static void log(double d) {
		System.out.printf("%.12f\n",d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// n k
		long n = sc.nextLong();
		long k = sc.nextLong();
		

		// Convert to string to get digits
		String sN = Long.toString(n);
		String sK = Long.toString(k);
		
		int lenSn = sN.length();
		int lenSk = sK.length();
		
//		log( new String("123").substring(1));
		
		// 1000000000000000000 1
		
//		long nNew, kNew;
		if (lenSn > lenSk) {
//			long temp = Long.parseLong(sN);
			n = Long.parseLong(sN.substring((lenSn-lenSk)));
		}
		else if (lenSk > lenSn) {
			k = Long.parseLong( sK.substring((lenSk-lenSn)));
		}
		
//		log("new n:" + n + "  new k:" + k);

		long min=n;
		long prevMin=n;
		
		long nextN=n;
		boolean breakFlg = true;
	
		do {
			prevMin = nextN;
			nextN = nextN - k;
			if (nextN<0)  nextN=nextN * (-1);
			if (min < nextN)
				break;
			if (nextN < min)
				min=nextN;
			if (nextN == 0)
				break;
		}while( breakFlg );
		
		log( min );
		sc.close();
		
	}

}
