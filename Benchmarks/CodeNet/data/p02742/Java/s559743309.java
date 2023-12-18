import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//A
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//
//        //System.out.println(str);
//        scan.close();
//
//		int[] dataArr = new int[] {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
//
//		System.out.println(dataArr[Integer.parseInt(str,10)-1]);

//B
		int H,W,R1,C1,R2,C2;
		Scanner scan = new Scanner(System.in);
		String strIn = scan.nextLine();
		String[] strInArr = strIn.split(" ");

		R1=1;
		C1=1;

		H=Integer.parseInt(strInArr[0]);
		W=Integer.parseInt(strInArr[1]);

		int count = 0;

		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {

				R2 = i+1;
				C2 = j+1;

				if (R1==R2 && C1==C2) {
					//除外
				} else if (R1+C1 == R2+C2 || R1-C1 == R2-C2) {
					count++;
				} else {
					//除外
				}

			}
		}

		System.out.println(count);
	}

}