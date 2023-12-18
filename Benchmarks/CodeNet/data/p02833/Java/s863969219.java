import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		if(N < 2 || N % 2 == 1){
			System.out.println(fnika(N));
		}else{
			System.out.println(fnijou(N));
		}
	}

	private static long fnika(long n) {// n<2のとき
		return 0;
	}

	private static long fnijou(long n) {// n>=2のとき
		long baisu = 0;
		for (long i = n; i >= 2; i -= 2) {
			if (i % 5 == 0) {
				baisu++;
			}
		}
		return baisu;
	}
}
