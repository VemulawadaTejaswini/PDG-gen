import java.util.ArrayList;
import java.util.Scanner;

public class DigitNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<int[]> dataList = new ArrayList<int[]>();
		for (int i = 0; i < 200; i++) {
			String str = scan.next();
			if (str.equals("end"))
				break;
			dataList.add(new int[2]);
			((int[]) dataList.get(i))[0] = Integer.parseInt(str);
			((int[]) dataList.get(i))[1] = Integer.parseInt(scan.next());
			scan.reset();
		}
		scan.close();
		for (int i = 0; i < dataList.size(); i++) {
			int sum = ((int[]) dataList.get(i))[0]
					+ ((int[]) dataList.get(i))[1];
			System.out.println((int) (Math.log10(sum) + 1));
		}

	}

}