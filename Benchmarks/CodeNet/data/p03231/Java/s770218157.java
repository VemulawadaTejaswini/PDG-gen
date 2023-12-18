import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static int[][] dp;

	static	boolean[] flag ;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);			//文字の入力
		N = scanner.nextInt();
		M = scanner.nextInt();

		long ans = lcm(N, M);

		String s = scanner.next();
		String t = scanner.next();

		int sl = s.length();
		int tl = t.length();

		StringBuilder sb = new StringBuilder();

		int c = 0;


		//		for(int i = 0;i < (sl-1)*ans/N;i++){
		//			if(i == 0 || i % (ans/N) == 0 ){
		//				sb.append(s.substring(c, c+1));
		//				c++;
		//			}else{
		//				sb.append("1");
		//			}
		//
		//		}

		if(N >= M){
			int cc = 0;
			int ccc = 0;


			for(int i = 0;i < (N-1)*ans/N;i++){

				if(i == 0){
					if(!(s.substring(0,1).equals(t.substring(0,1)))){
						System.out.println("-3");
						return;
					}else{
						cc ++;
						ccc++;
					}
				}
				else if((i % (ans/N)) == 0 && !(i % (ans/M)  == 0 )){
					cc++;
				}
				else if((i % (ans/M)  == 0 && !(i % (ans/N)  == 0 ))){
					ccc++;
				}

				else	if((i % (ans/N) == 0) && (i % (ans/M)  == 0 )){
					if(!(s.substring(cc,cc+1).equals(t.substring(ccc,ccc+1)))){
						System.out.println("cc " +cc+" ccc "+ccc+" i "+i);

						System.out.println("-2");
						return;
					}else{
						cc ++;
						ccc++;
					}
				}

			}
			System.out.println(ans);

		}else{
			int cc = 0;
			int ccc = 0;


			for(int i = 0;i < (M-1)*ans/M;i++){

				if(i == 0){
					if(!(t.substring(0,1).equals(s.substring(0,1)))){
						System.out.println("-1");
						return;
					}else{
						cc ++;
						ccc++;
					}
				}
				else if((i % (ans/N)) == 0 && !(i % (ans/M)  == 0 )){
					cc++;
				}
				else if((i % (ans/M)  == 0 && !(i % (ans/N)  == 0 ))){
					ccc++;
				}

				else	if((i % (ans/N) == 0) && (i % (ans/M)  == 0 )){
					if(!(t.substring(ccc,ccc+1).equals(s.substring(cc,cc+1)))){

						System.out.println("-1");
						return;
					}else{
						cc ++;
						ccc++;
					}
				}

			}
			System.out.println(ans);


		}




	}
	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
	static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}


