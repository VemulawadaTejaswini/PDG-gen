
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = new java.util.Scanner(System.in).nextInt();
		String SecondLine = new java.util.Scanner(System.in).nextLine();
//		String[] ArrayN = SecondLine.split(" "); //見やすい？
		int[] ArrayNint = new int[N];
		for (int i = 0; i < N; i++) {
//			ArrayNint[i] = Integer.parseInt(ArrayN[i]); //見やすい？
			ArrayNint[i]= Integer.parseInt(SecondLine.split(" ")[i]);
		}


		int cnt = 0;
		boolean trigger;
		trigger = true;
		while (trigger) {
			for (int i =0 ; i< ArrayNint.length ; i++ ) {
				if (ArrayNint[i]% 2 == 1) {
					trigger = false ;
					break;
				} else {
					ArrayNint[i] = ArrayNint[i] / 2;
				} // if
			} // for
			if (trigger) {
			cnt++;

			}
		} // while
		System.out.println(cnt);

	}
}
