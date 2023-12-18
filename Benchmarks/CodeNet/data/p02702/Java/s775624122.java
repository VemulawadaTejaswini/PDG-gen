import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long S = scanner.nextLong();
		long XX = 0;
		String S1 = String.valueOf(S);
		long w = S1.length();
		String[] Array = S1.split("");
		long count = 0;

		for (int j = 0; j < w - 2; j++) {
			//System.out.println("Sは" + S);
			XX = S;
			while(XX >= 2019) {

				if (XX % 2019 == 0) {
					//System.out.println(S + "は割り切れる");
					count += 1;
					XX /= 10;
				} else {
					XX /= 10;
				}
			}
			long x = Long.parseLong(Array[j]);
			//System.out.println("xは" + x);
			//System.out.println(w-j+1);
			//System.out.println(Math.pow(10, (w-j-1)));
			S -= x * Math.pow(10, (w-j-1));
		}
		System.out.println(count);
	}
}
