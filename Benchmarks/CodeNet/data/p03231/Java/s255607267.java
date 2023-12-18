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

		for(int i = 0;i < ans;i++){
			if(i == 0 || i % (ans/N) == 0 ){
				sb.append(s.substring(c, c+1));
				c++;
			}else{
				sb.append("1");
			}
		
		}
//		System.out.println("ans "+ans);

		String aa = sb.toString();
//		System.out.println(aa);
		
		c= 0;
		for(int i = 0;i < (tl-1)*ans/M;i++){

			if(i == 0 || i % (ans/M) == 0){
//				System.out.println("i "+i);
//				System.out.println(aa.substring(i,i+1) );


				if(!(aa.substring(i,i+1).equals(t.substring(c, c+1))) && !(aa.substring(i,i+1).equals("1")) ){
					System.out.println("-1");
					return;
				}
				c++;
			}
			
		}
		System.out.println(ans);
		





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


