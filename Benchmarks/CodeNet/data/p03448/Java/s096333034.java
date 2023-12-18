import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();

		int cnt = 0;
		for(int i = a; i >= 0; i--) {
			int suma = i * 500;
			if(suma == x) {
				cnt++;
				continue;
			} else if(suma > x) {
				continue;
			}
			for(int j = b; j >= 0; j--) {
				int sumb = suma + j * 100;
				if(sumb == x) {
					cnt++;
					continue;
				} else if(sumb > x) {
					continue;
				}

				for(int k = c; k >= 0; k--) {
					int sumc = sumb + k * 50;
					if(sumc == x) {
						cnt++;
						continue;
					} else if(sumc > x) {
						continue;
					} else {
						break;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}