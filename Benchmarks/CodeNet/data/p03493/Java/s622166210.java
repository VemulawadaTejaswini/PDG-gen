import java.util.Scanner;
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int tama = 0;
		if (s1 == 1 ) {
			tama++;
		}
		if (s2 == 1 ) {
			tama++;
		}
		if (s3 == 1 ) {
			tama++;
		}

		System.out.println(tama);




	}

}
