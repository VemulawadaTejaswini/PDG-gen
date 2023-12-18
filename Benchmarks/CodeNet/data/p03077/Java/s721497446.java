import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long res = 0;
		long[] M = new long[5];
		for(int i = 0;i<5;i++) {
			M[i] = sc.nextLong();
		}
		long min = M[0];
		int num = 0;
		for(int i = 1;i<5;i++) {
			if(min>M[i]) {
				min = M[i];
				num = i;
			}
		}

		if(N%min==0) {
			res = N/min + 4;
		}else {
			res = N/min +5;
		}


		System.out.println(res);
	}
}