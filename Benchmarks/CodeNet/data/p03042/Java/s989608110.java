import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String S = sc.next();
		String p = S.substring(0, 2);
		String o = S.substring(2);

		boolean pIs = isMonth(p);
		boolean oIs = isMonth(o);

		if(pIs && oIs){
			System.out.println("AMBIGUOUS");
		}else{
			if(oIs){
				System.out.println("YYMM");
			}else if(pIs){
				System.out.println("MMYY");
			}else{
				System.out.println("NA");
			}
		}

		System.out.println("");

		sc.close();
	}

	private static boolean isMonth(String S){
		if (S.equals("01") || S.equals("02") || S.equals("03") || S.equals("04") || S.equals("05")
				|| S.equals("06") || S.equals("07") || S.equals("08") || S.equals("09") || S.equals("10")
				|| S.equals("11") || S.equals("12")) {
			return true;
		}

		return false;
	}
}
