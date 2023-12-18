public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int sum=0;

		for(int i=1; i<n+1; i++) {
			sum += i;
		}

		System.out.print(sum);
	}

}
