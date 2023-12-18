import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long [] list = new long [5];

		//グループ人数
		long n = Long.parseLong(sc.next());
		//最小人数
		long min = (long) Math.pow(10, 15);
//		System.out.println("N: " + n);



		for (int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(sc.next());
			long v = list[i];
			if(v < min) {
				min = v;
			}
//			System.out.println("MIN: " + min);

		}

		if(n / min <= 1) {
			System.out.println(5);
		}else {
			if(n % min == 0){
				long ans = (long)Math.ceil(n / min) + 4 ;
				System.out.println(ans);
			}else {
				long ans = (long)Math.ceil(n / min) + 5;
				System.out.println(ans);
		}
		}
	}

}
