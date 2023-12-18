import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		executeCountBalls();
//		executeTaxIncrease();
		executeStringFormation();
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

		double tax8 = (double)in.nextInt();
		double tax10 = (double)in.nextInt();

		int taxExclude_min = (int)Math.ceil((tax8 * 100)/TAX_RATE_8);

		int taxExclude_max = 0;
		if( ((tax8 + 1)*100)%8 == 0 ) {
			taxExclude_max = (int)(((tax8 + 1) * 100)/TAX_RATE_8 - 1);
		}	else {
			taxExclude_max = (int)Math.floor(((tax8 + 1) * 100)/TAX_RATE_8);
		}

//		System.out.println(taxExclude_min + " " + taxExclude_max);

		int taxExclude_fix = -1;
		for( int val = taxExclude_min; val <= taxExclude_max; val++) {
			if ( (int)Math.ceil(val/TAX_TATE_10) == tax10 ) {
				taxExclude_fix = val;
				break;
			}
		}
		System.out.println(taxExclude_fix);
	}


	public static void executeStringFormation() {

		Scanner in = new Scanner(System.in);

		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int num =Integer.parseInt(s2);

		List<String> queryList = new ArrayList<String>();

		for(  int i=0; i<num; i++ ) {
			queryList.add(in.nextLine());
		}

		List<String> inputList = Arrays.asList(s1.split(""));
		List<String> combList = new ArrayList<String>();
		combList.addAll(inputList);

		for( int i=0; i<num; i++ ) {
			String query = queryList.get(i);

			String[] queryArray = query.split(" ");
			if( "1".equals(queryArray[0]) ) {
				// 反転
				combList = exchangeList(combList);

			} else if( "2".equals(queryArray[0]) ) {
				// 追加
				if( "1".equals(queryArray[1] )) {
					// 先頭追加
					combList = addListHead(combList, queryArray[2]);

				} else if( "2".equals(queryArray[1])) {
					// 末尾追加
					combList = addListTail(combList, queryArray[2]);
				} else {
					;
				}
			} else {
				;
			}
		}

		for( String s : combList ) {
			System.out.print(s);
		}
		System.out.println();

	}



	private static List<String> exchangeList(List<String> charList){

		List<String> tmpList = new ArrayList<String>();

		int offset = charList.size()-1;

		for( int count = 0; count < charList.size(); count++ ){
			tmpList.add(charList.get(offset));
			offset--;
		}

		return tmpList;
	}

	private static List<String> addListTail(List<String> charList, String c) {

		charList.add(c);
		return charList;

	}

	private static List<String> addListHead(List<String> charList, String c) {

		List<String> addedlist = new ArrayList<String>();

		addedlist.add(c);
		addedlist.addAll(charList);

		return addedlist;

	}
}
