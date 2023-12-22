class Main {

    private static final int CONST= 1000000007;
    public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        long M = Integer.parseInt(sc.next());
        long N = Integer.parseInt(sc.next());
        System.out.println(myPow(M, N));
        sc.close();
    }

    private static long myPow(long m, long n){
        if(n == 0)  return 1;

        long res = myPow(m*m%CONST, n/2);
        if(n%2 == 1) res = res * m %CONST;
        return res;
    }
}
