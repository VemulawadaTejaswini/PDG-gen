import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		long wat = 0, sug = 0, max = 0;

		for (int i = 0; a * i * 100 < f ; i++) {
			for (int j = 0; (a * i * 100 + b * j * 100) < f ; j++) {
				for (int n = 0; (a * i * 100 + b * j * 100 + c * n) < f ; n++) {
					for (int m = 0; (a * i * 100 + b * j * 100 + c * n + d * m) < f ; m++) {
						if ((a * i * 100 + b * j * 100) == 0) {
							continue;
						}
						if ((c * n + d * m) * 100 / (a * i * 100 + b * j * 100 + c * n + d * m) > max && (c * n + d * m) * 100 / (a * i + b * j) <= e * 100) {
							max = (c * n + d * m) * 100 / (a * i * 100 + b * j * 100 + c * n + d * m);
							wat = a * i * 100 + b * j * 100;
							sug = c * n + d * m;
						}
					}
				}
			}
		}
		
		System.out.println((wat + sug)+" "+sug);

		sc.close();
	}
}
