public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		//プログラムはここに記入

		if(num>=30) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		scan.close();
	}
}
