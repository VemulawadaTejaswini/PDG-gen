import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		int count = 0;

		if(b - a <= k) {
			if(c -a <= k) {
				if(d-a <= k) {
					if(e-a <= k) {
						if (c-b<=k) {
							if(d-b <= k) {
								if(e-b <= k) {
									if (d-c<=k) {
										if(e-c<=k) {
											if(e-d<=k) {
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if(count == 0) {
			System.out.print(":(");
		}else {
			System.out.println("Yay!");
		}
	}
}
