
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String S = sc.next();


		int mae = Integer.parseInt(S.substring(0, 2));
		int ato = Integer.parseInt(S.substring(2, 4));

		String ans;
		boolean maeM=false;
		boolean atoM=false;
		if ((mae>=1)&(mae<=12)) {
			maeM = true;
		}
		if ((ato>=1)&(ato<=12)) {
			atoM = true;
		}

		if(maeM) {
			if (atoM) {
				ans = "AMBIGUOUS";
			} else {
				ans = "MMYY";
			}
		} else {
			if (atoM) {
				ans = "YYMM";
			} else {
				ans = "NA";
			}
		}

		System.out.println(ans);

	}


}