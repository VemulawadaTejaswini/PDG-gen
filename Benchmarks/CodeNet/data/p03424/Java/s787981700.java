public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] S = new int[N];
		boolean flg = false;
		for(int i = 0;i < N;i++){
			flg |= s.next().equals("Y");
		}
		
		System.out.println(flg ? "Four" : "Three");
		
		
	}

}
