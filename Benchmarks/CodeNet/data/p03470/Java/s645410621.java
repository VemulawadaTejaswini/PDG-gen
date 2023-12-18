public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//input
		//	N枚のモチ(i番目のモチはdiセンチメートル)
		//	◆条件
		//		1<= N <= 100
		//		1<= di <= 100
		//


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		if(N<1 || N>100) {
			System.out.println("N is illegal");
			System.exit(1);
		}

		int d[] = new int[N];


		for(int i =0 ;i<N;i++) {
			int d_i = scan.nextInt();
			if(d_i < 1 || d_i > 100 ) {
				System.out.println("d[i] is illegal");
				System.exit(1);
			}
			d[i] = d_i;

		}

		//logic(組み合わせ問題)
		//①重複なしで、モチの直径をソートして、現時点で積み上げたモチの直径より小さいモチがあれば積み上げる
		//②

		int num_stage = 0;


		Arrays.sort(d);//昇順にソート
		int diameter = d[N-1];//直径が一番大きいモチの積み上げ
		num_stage = num_stage + 1;

		for(int i = 2;i < N +1 ;i++) {

			if(d[N-i] < diameter) {//一段積み上げ
				diameter = d[N-i];
				num_stage = num_stage + 1;

			}

		}


		//output
		//	最大で何段重ねのモチを作れるか
		System.out.println(num_stage);
	}

}
