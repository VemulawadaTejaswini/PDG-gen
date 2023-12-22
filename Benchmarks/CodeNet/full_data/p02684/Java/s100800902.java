import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		long k;
		int a[];
		int test = 0;

		if(test == 0) {
			n = sc.nextInt();
			k = sc.nextLong();

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = sc.nextInt();
			}
		} else if(test == 1) {//テストデータ1
			n = 200000;
			k = 1000000000000000000l;
			k = 100000000000l;

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = (i%n+1);
			}
		} else if(test == 2) {//テストデータ2
			n = 2;
			k = 1;

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = (i%n+1);
			}
		} else {//テストデータ3
			n = 5;
			k = 12;

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = (i%n+1);
			}
		}

		int s[] = new int[n+1];//町[1]からx回テレポートした先の町を示すショートカットデータ
		int current_town = 1;
		int loop = n;
		s[0] = 1;
		for(int i = 1; i < n+1; i++) {
			s[i] = a[current_town];
			if (s[i] == 1) {
				loop = i;
				break;
			}
			current_town = s[i];
		}

		if (false) {//print
			System.out.printf("%d %d %d\n", n,k,loop);
			for(int i = 1; i < n+1; i++) {
				System.out.printf(" %d", a[i]);
				if(i>100) break;
			}
			System.out.println();
			for(int i = 1; i < n+1; i++) {
				System.out.printf(" %d", s[i]);
				if(i>100) break;
			}
			System.out.println();
		}

		int tmpK = (int)(k % (long)loop);
		int res = s[tmpK];

		System.out.printf("%d", res);
	}
}
