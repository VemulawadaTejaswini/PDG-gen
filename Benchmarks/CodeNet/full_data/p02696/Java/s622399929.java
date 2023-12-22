import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long N = sc.nextLong();

		Long max = (long) 0;
		int i;
		for(i = 0; i<=N;i++) {
			Long z = (Long)(A*i/B)-A*(Long)(i/B);
			if(z >= max) {
				max = z;
			}
		}


		System.out.println(max);
	}

}

