import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		String S,T;
		N=sc.nextInt();
		M=sc.nextInt();
		sc.nextLine();
		S=sc.nextLine();
		T=sc.nextLine();
		int indS=0,indT=0;
		int L=lcm(N,M);
//		if(Math.max(N, M)%Math.min(N, M)==0) {
//			L*=Math.max(N, M)/Math.min(N, M);
//		}
		boolean isOK=true;

		int rangeN=L/N;
		int rangeM=L/M;
		int cN=0,cM=0;
		char[] aN=new char[L];
		char[] aM=new char[L];
		for(int j=0;j<L;j++) {
			aN[j]='0';
			aM[j]='0';
		}
//		for(int j=0;j<L;j++) {
//			System.out.print(aN[j]);
//		}
//		System.out.println();
//		for(int j=0;j<L;j++) {
//			System.out.print(aM[j]);
//		}
//		System.out.println();
		int longer=Math.max(N, M);
		int shorter=Math.min(N, M);
		int i;
		int minner=1;char minc;
		for(i=0;i<shorter;i++) {
			aN[rangeN*i]=S.charAt(i);
			aM[rangeM*i]=T.charAt(i);
		}
//		if(N<=M)
//		for(i=shorter;i<longer;i++) {
//			aM[rangeM*i]=T.charAt(i);
//		}
//		else
//		for(i=shorter;i<longer;i++) {
//			aN[rangeN*i]=S.charAt(i);
//		}

//		for(int j=0;j<L;j++) {
//			System.out.print(aN[j]);
//		}
//		System.out.println();
//		for(int j=0;j<L;j++) {
//			System.out.print(aM[j]);
//		}
//		System.out.println();
		for(int j=0;j<L;j++) {
			if(aN[j]!='0'&&aM[j]!='0') {
				if(aN[j]!=aM[j]) {
					isOK=false;
				}
			}
		}

		if(isOK)System.out.println(L);
		else System.out.println(-1);
	}
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static int lcm(int m, int n) {
        return m * n / gcd(m, n);
    }
}
