import java.util.Scanner;
public class Main {

	private static int N;
	private static int M;
	private static String S;
	private static String T;
	private static int L;
	private static String[] SS;
	private static boolean flag = true;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		S = sc.next();
		T = sc.next();
		L = (int)(lcm((long)N, (long)M));
		SS = new String[L];


		flag = insert(N,S);
		if(flag) flag = insert(M,T);

//	    for (String s : SS) {
//	    	String ls = s==null ? "t" : s;
//	        System.out.print(ls);
//	    }
		if(flag) {
		    System.out.println(L);
		}else {
			System.out.println("-1");
		}
	    sc.close();
	}

    private static boolean insert(int x,String z) {
		int p = 0;
		for(int i=0;i<x;i++) {


			if(SS[p] == null) {
				SS[p] = z.substring(i, i+1);
			}else if(!SS[p].equals(z.substring(i, i+1))) {
				return false;
			}
			p += L/x;
		}
		return true;
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }


}
