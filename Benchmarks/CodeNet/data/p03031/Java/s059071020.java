import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public class Restaurant{
		int point = 0 ;
		String city = "" ;
		int No = 0 ;
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
			this.point = point;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getNo() {
			return No;
		}
		public void setNo(int no) {
			No = no;
		}

	}

	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();

		int k[] = new int[M];
		int s[][] = new int[M][];
		int p[] = new int[M] ;


		int kmin = 10 ;
		int kminIdx = 0 ;
		for(int i = 0 ; i < M; i ++) {
			k[i] = sc.nextInt();
			s[i] = new int[k[i]] ;
			for(int j = 0 ; j < k[i]; j ++) {
				s[i][j] = sc.nextInt();
			}
			if(k[i] < kmin) {
				kmin = k[i] ;
				kminIdx = i ;
			}
		}

		for(int i = 0 ; i < M; i ++) {
			p[i] = sc.nextInt();
		}


		//最もKが小さいケースで検証する？
		int okCount = 0 ;
		for(int i = 0 ; i < Math.pow(2, N); i ++) {
			BigInteger num = new BigInteger(i+"") ;
			//System.out.println(num.toString(2));
			boolean ok = true ;
			for(int j = 0; j < M; j ++) {
				int sum = 0 ;
				for(int idx = 0 ; idx < k[j]; idx ++) {
					if(num.testBit(s[j][idx] - 1)) {
						sum ++ ;
					}
				}
				if(sum%2 != p[j]) {
					//System.out.println((j+1) + "番目の電球がNG(sum=" + sum + ",p[" + (j+1)+ "]=" + p[j] );
					ok = false ;
					break ;
				}
			}
			if(ok) {
				okCount++ ;
			}
		}
		System.out.println(okCount);

//
//
//
//
//
//		System.out.println("N=" + N + ",M=" + M);
//
//		for(int i = 0 ; i < M ; i ++) {
//			int kk = k[i] ;
//			System.out.print("k[" + (i+1) + "]=" + kk);
//			for(int j = 0 ; j < kk ; j ++) {
//				System.out.print(" s[" + (i+1) + "][" + (j+1) + "]=" + s[i][j]);
//			}
//			System.out.println() ;
//		}
//
//		for(int i = 0 ; i < M; i ++) {
//			System.out.print("p[" + (i+1) + "]=" + p[i] + " ");
//		}
//


//		Restaurant restaurants[] = new Restaurant[N];
////		List<Restaurant> list = new ArrayList<Restaurant>() ;
////		String S[] = new String[N];
////		int P[] = new int[N];
//
//		Comparator c = new Comparator<Restaurant>() {
//            @Override
//            public int compare(Restaurant obj1, Restaurant obj2) {
//            	int cmp = obj1.getCity().compareTo(obj2.getCity()) ;
//            	if(cmp != 0 ) {
//            		return cmp ;
//            	}
//                return obj2.getPoint() - obj1.getPoint();
//            }
//        };
//		for(int i = 0 ; i < N ; i ++) {
//			restaurants[i] = this.new Restaurant() ;
//			restaurants[i].setCity(sc.next());
//			restaurants[i].setPoint(sc.nextInt());
//			restaurants[i].setNo(i + 1);
////			list.add(restaurants[i]) ;
//		}
//		Arrays.sort(restaurants,c);
////		System.out.println("N=" + N);
////		for(int i = 0 ; i < N ; i ++) {
//			//System.out.println("S[" + (i+1) + "]=" + restaurants[i].getCity() + ",P[" + (i+1) + "]=" + restaurants[i].getPoint());
////			restaurants[i].setPage(i+1);
////		}
//		for(int i = 0 ; i < N ; i ++) {
//			System.out.println(restaurants[i].getNo());
//		}
//
		// 出力
		//System.out.println(pi);

	}

}
