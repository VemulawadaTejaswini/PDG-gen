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




		if(N >= M){
			int cc = 1;
			int ccc = 1;

			for(int x= 1;x < 5;x++){
				boolean jug = true;
				ans *= x;
				ArrayList<Long> tList = new ArrayList<Long>();
				ArrayList<Long> sList = new ArrayList<Long>();

				for(long i = 0;ccc <= N;){					
						tList.add(i);
				
					i =  (ans/N)*ccc;
					ccc++;

				}
				for(long i = 0;cc <= M;){
					
						tList.add(i);
					

					i = (ans/M)*cc;
					cc++;
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
							jug = false;
							break;
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
							jug = false;
							break;

						}else{
							cc ++;
							ccc++;
						}
					}
				}
				if(jug){
					System.out.println(ans);
					return;
				}
			}

			System.out.println("-1");

		}else{
			int cc = 1;
			int ccc = 1;

			for(int x= 1;x < 5;x++){
				boolean jug = true;
				ans *= x;
				ArrayList<Long> tList = new ArrayList<Long>();
				ArrayList<Long> sList = new ArrayList<Long>();

				for(long i = 0;ccc <= M;){
					
						tList.add(i);
					

					i = (ans/M)*ccc;
					ccc++;

				}
				for(long i = 0;cc <= N;){
					
						tList.add(i);
					

					i = (ans/N)*cc;
					cc++;

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
							jug = false;
							break;
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
							jug = false;
							break;

						}else{
							cc ++;
							ccc++;
						}
					}
				}
				if(jug){
					System.out.println(ans);
					return;
				}


			}
			System.out.println("-1");


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


