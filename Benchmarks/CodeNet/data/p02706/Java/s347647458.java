import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int N = scan.nextInt(); //夏休みは　Ｎ　日間
		int M = scan.nextInt(); //宿題はM個
		while(true) {
			if(i == M) break;
			int A = scan.nextInt(); //日数
			N -= A;
			i++;
		}
		System.out.println(N);
	}

}
