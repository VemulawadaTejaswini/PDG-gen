public class Main060 {

	public static void main(String[] args) {
		// キーボード入力をint配列へ詰める
		int intAry[] = new int[2];
		Scanner in1 = new Scanner(System.in);
		for (int i = 0;i <= intAry.length; i++) {
			intAry[i] = in1.nextInt();
		}
		in1.close();
		
		// 
		int intAry2[] = new int[intAry[0]];
		Scanner in2 = new Scanner(System.in);
		for (int i = 0;i <= intAry2.length; i++) {
			intAry2[i] = in2.nextInt();
		}
		in2.close();
		
		// パターンカウント
		int result = 0;
		
		int sum = 0;
		int avg = 0;
		
		for (int c = 0; c <= intAry2.length; c++) {
			// average
			sum += intAry2[c];
			avg = sum /intAry2.length;
			
			if (avg == intAry[1]) {
				result = result + 1;
			}
			
			if (intAry2[c] == intAry[1]) {
				result = result + 1;
			}
		}
		
		System.out.println(result);
	}
}