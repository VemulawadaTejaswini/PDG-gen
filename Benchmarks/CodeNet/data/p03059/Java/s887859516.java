public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int t = scan.nextInt();

        int ans = t / a * b;
        System.out.println(ans);
        scan.close();

	}

}