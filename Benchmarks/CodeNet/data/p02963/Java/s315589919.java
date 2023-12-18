import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		Long S = new Long(sc.nextLong());
		Long[] ans = getTriangle(S) ;

		System.out.print(ans[0] + " ");
		System.out.print(ans[1] + " ");
		System.out.print(ans[2] + " ");
		System.out.print(ans[3] + " ");
		System.out.print(ans[4] + " ");
		System.out.println(ans[5]);
	}

//	public void test() { ;
//		// TODO 自動生成されたメソッド・スタブ
//		{
//			BigInteger num = new BigInteger("9999999999990000") ;
//			for( int i  = 1 ; i < 100000 ; i ++) {
//				num = num.nextProbablePrime() ;
////			long S = new Long("100000000000000000") - (long)i ;
//			long S = num.longValue() ;
////			long S = (long)i ;
//			BigInteger[] ans = getTriangle(S) ;
//
//			System.out.print(ans[0] + " ");
//			System.out.print(ans[1] + " ");
//			System.out.print(ans[2] + " ");
//			System.out.print(ans[3] + " ");
//			System.out.print(ans[4] + " ");
//			System.out.println(ans[5]);
//
//			BigDecimal s = getTriangleS(ans[0],ans[1],ans[2],ans[3],ans[4],ans[5]) ;
//			BigDecimal s2 = (new BigDecimal(0.5)).multiply(new BigDecimal(S)) ;
//			System.out.println("S/2 = " + s2);
//			System.out.println("s   = " + s);
//			if(s.equals(s2)) {
//				if(1000000000 < ans[0].longValue()
//				 ||	1000000000 < ans[1].longValue()
//				 ||	1000000000 < ans[2].longValue()
//				 ||	1000000000 < ans[3].longValue()
//				 ||	1000000000 < ans[4].longValue()
//				 ||	1000000000 < ans[5].longValue()
//				 ||	ans[0].longValue() < 0
//				 ||	ans[1].longValue() < 0
//				 ||	ans[2].longValue() < 0
//				 ||	ans[3].longValue() < 0
//				 ||	ans[4].longValue() < 0
//				 ||	ans[5].longValue() < 0
//				) {
//					System.out.println("S=" + S + "error!");
//					break ;
//				}else {
//					System.out.println("S=" + S + "success!");
//				}
//			}else {
//				System.out.println("S=" + S + "error!");
//				break ;
//			}
//		}
//		}
//	}

//	public BigDecimal getTriangleS(BigInteger X1,BigInteger Y1,BigInteger X2,BigInteger Y2,BigInteger X3,BigInteger Y3) {
//
//		BigInteger x1 = X2.subtract(X1) ;
//		BigInteger y1 = Y2.subtract(Y1) ;
//		BigInteger x2 = X3.subtract(X1) ;
//		BigInteger y2 = Y3.subtract(Y1) ;
//
//		BigDecimal ans = (new BigDecimal(0.5)).multiply(new BigDecimal(x1.multiply(y2).subtract(x2.multiply(y1)))) ;
//
//		return ans ;
//	}


	public Long[] getTriangle(Long S) {
		Long X1 = new Long(0) ;
		Long Y1 = new Long(0) ;


		//S = |X2*Y3 - X3*Y2|
		//X2 = (S + X3 * Y2)/Y3
		//Y3 = (S + X3 * Y2)/X2

		Long X2 = (long)Math.sqrt((double)S.longValue()) ;// <= SQRT(S)
		//X2の平方数との差を求める
		Long Z = X2*X2 ;
		Long C = Z - S ;

		Long Y2 = new Long(1) ;
		Long X3 = C ;
		Long Y3 = (S + X3 * Y2)/X2 ;


//		while(1000000000 < X2) {
//			X3 = X3 - 1 ;
//			Y2 = new Long(1) ;
//			X2 = new Long(1) ;
//			Y3 = (S + X3 * Y2)/X2 ;
//		}

		if(X3 < 0) {
			X1 = 0 - X3 ;
			X2 = X2 - X3 ;
			X3 = new Long(0) ;
		}

//		Long[] ans = {X1,Y1,new BigInteger(X2.toString()),new BigInteger(Y2.toString()),new BigInteger(X3.toString()),new BigInteger(Y3.toString())} ;
		Long[] ans = {X1,Y1,X2,Y2,X3,Y3};
		return ans;
	}



}
