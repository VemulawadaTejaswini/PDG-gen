public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int A = Integer.parseInt(lines[0]);
		int B = Integer.parseInt(lines[1]);

		if(B > 12) {
			System.out.println(A);
		}else if(B > 5) {
			System.out.println(A/2);
		}else {
			System.out.println(0);
		}
	}

}