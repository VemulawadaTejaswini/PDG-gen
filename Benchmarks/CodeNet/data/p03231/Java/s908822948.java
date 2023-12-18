import java.util.ArrayList;
import java.util.Collections;
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

			ArrayList<Long> tList = new ArrayList<Long>();
			ArrayList<Long> sList = new ArrayList<Long>();

			for(long i = 0;i < (N-1)*ans/N;){
				if(i == 0){
					tList.add(i);
					ccc++;
				}else {
					tList.add(i);
				}

				i = i + (ans/N)*ccc;

			}
			for(long i = 0;i < (M-1)*ans/M;){
				if(i == 0){
					tList.add(i);
					cc++;
				}else {
					tList.add(i);
				}

				i = i + (ans/M)*cc;

			}

			Collections.sort(tList);

			for(int i = 0;i < tList.size()-1;i++){
				if(tList.get(i) == tList.get(i+1)){
					tList.remove(i);
				}
			}
			

			cc = 0;
			ccc = 0;



			for(int i = 0;i < tList.size();i++){

				long key = tList.get(i);
				if(key == 0){
					if(!(s.substring(0,1).equals(t.substring(0,1)))){
						System.out.println("-1");
						return;
					}else{
						cc ++;
						ccc++;
					}
				}
				else if((key % (ans/N)) == 0 && !(key % (ans/M)  == 0 )){
					cc++;
				}
				else if((key % (ans/M)  == 0 && !(key % (ans/N)  == 0 ))){
					ccc++;
				}

				else	if((key % (ans/N) == 0) && (key % (ans/M)  == 0 )){
					if(!(s.substring(cc,cc+1).equals(t.substring(ccc,ccc+1)))){
						//						System.out.println("cc " +cc+" ccc "+ccc+" i "+i);

						System.out.println("-1");
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
			int z = 0;

			ArrayList<Long> tList = new ArrayList<Long>();
			ArrayList<Long> sList = new ArrayList<Long>();

			for(long i = 0;i < (M-1)*ans/M;){
				if(i == 0){
					tList.add(i);
					ccc++;
				}else {
					tList.add(i);
				}

				i = i + (ans/M)*ccc;

			}
			for(long i = 0;i < (N-1)*ans/N;){
				if(i == 0){
					tList.add(i);
					cc++;
				}else {
					tList.add(i);
				}

				i = i + (ans/N)*cc;

			}

			Collections.sort(tList);
			for(int i = 0;i < tList.size()-1;i++){
				if(tList.get(i) == tList.get(i+1)){
					tList.remove(i);
				}
			}
			

			cc = 0;
			ccc = 0;
			for(int i = 0;i < tList.size();i++){

				long key = tList.get(i);
				if(key == 0){
					if(!(t.substring(0,1).equals(s.substring(0,1)))){
						System.out.println("-1");
						return;
					}else{
						cc ++;
						ccc++;
					}
				}
				else if((key % (ans/N)) == 0 && !(key % (ans/M)  == 0 )){
					cc++;
				}
				else if((key % (ans/M)  == 0 && !(key % (ans/N)  == 0 ))){
					ccc++;
				}

				else if((key % (ans/N) == 0) && (key % (ans/M)  == 0 )){
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


