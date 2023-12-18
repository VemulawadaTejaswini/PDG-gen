import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		executeCountBalls();
		executeTaxIncrease();
	}

	private static void execute() {

		Scanner in = new Scanner(System.in);

		try {
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			String s3 = in.nextLine();

			int  a = Integer.parseInt(s1);
			String[] s2Array = s2.split(" ");
			int b = Integer.parseInt(s2Array[0]);
			int c = Integer.parseInt(s2Array[1]);

			int sum  = a + b + c;

//			System.out.println(a + "," + b + "," + c );

			System.out.println(sum + " " + s3);
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("");
//			e.printStackTrace();
		}

	}

	public static void execute_product() {

		Scanner in = new Scanner(System.in);

		try {
			int a  = in.nextInt();
			int b  = in.nextInt();

			if( (a*b)%2 == 0 ) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void executeCountBalls() {
		Scanner in = new Scanner(System.in);

		try {
			long N = in.nextLong();
			long A = in.nextLong();
			long B = in.nextLong();

			long surplus = N%(A+B);
			long surplusA = surplus >= A ? A : surplus;

			 long countA = N/(A+B) * A + surplusA;

			System.out.println(countA);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}


	public static final int TAX_RATE_8 = 8;
	public static final int TAX_TATE_10 = 10;

	public static void executeTaxIncrease(){

		Scanner in = new Scanner(System.in);

		int tax8 = in.nextInt();
		int tax10 = in.nextInt();

		int taxExclude_min = (int)Math.ceil((tax8 * 100)/8);
		int taxExclude_max = 0;
		if( ((tax8 + 1)*100)%8 == 0 ) {
			taxExclude_max = ((tax8 + 1) * 100)/8 - 1;
		}	else {
			taxExclude_max = (int)Math.floor(((tax8 + 1) * 100)/8);
		}

		int taxExclude_fix = -1;
		for( int val = taxExclude_min; val <= taxExclude_max; val++) {
			if ( (int)Math.ceil(val/10) == tax10 ) {
				taxExclude_fix = val;
				break;
			}
		}
		System.out.println(taxExclude_fix);
	}
}
