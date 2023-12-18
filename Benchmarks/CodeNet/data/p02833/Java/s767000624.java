import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if(N < 2 || N % 2 == 1){
			System.out.println(fnika(N));
		}else{
			System.out.println(fnijou(N));
		}
	}

	private static int fnika(int n) {// n<2のとき
		return 0;
	}

	private static int fnijou(int n) {// n>=2のとき
		int baisu = 0;
		for (int i = n; i >= 2; i -= 2) {
			if (i % 5 == 0) {
				baisu++;
			}
		}
		return baisu;
	}
}
