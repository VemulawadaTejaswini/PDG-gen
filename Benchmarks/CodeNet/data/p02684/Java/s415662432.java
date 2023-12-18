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
			n = 199999;
			k = 1000000000000000000l;
			k = 1000000000000000000l;
			k = 1;

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = (i%n+1);
//				a[i] = (i%2+1);
			}
		} else if(test == 2) {//テストデータ2
			n = 2;
			k = 2;

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = (i%n+1);
			}
		} else if(test == 3){//テストデータ3
			n = 5;
			k = 12;

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = (i%n+1);
			}
		} else {
			n = sc.nextInt();
			k = sc.nextLong();

			a = new int[n+1];
			for(int i = 1; i < n+1; i++) {
				a[i] = sc.nextInt();
			}
		}

		int s[] = new int[n+1];//町[1]からx回テレポートした先の町を示すショートカットデータ
		boolean passed[] = new boolean[n+1];//通過した町
		for(int i = 1; i < n+1; i++) {
			passed[i] = false;
		}
		int current_town = 1;
		int head = 0;
		int headCount = 0;
		int loop = n;
		boolean isSubLoop = false;
		s[0] = 1;
		passed[0] = true;
		passed[1] = true;
		for(int i = 1; i < n+1; i++) {
			s[i] = a[current_town];
			if (s[i] == 1) {
				loop = i;
				break;
			} else if (passed[s[i]] == true) {
				head = s[i];
				loop = i;
				isSubLoop = true;
				break;
			}
			passed[s[i]] = true;

			current_town = s[i];
		}

		//戦闘以外でループする場合に備える
		if(isSubLoop) {
			for(int i = 1; i < n+1; i++) {
				s[i] = a[current_town];
				if (s[i] == head) {
					headCount = i;
					break;
				}
			}
		}


		int tmpK = (int)(k % (long)loop);
		tmpK -= headCount;
		int res = s[tmpK];

		if (test != 0) {//print
			System.out.printf("n:%d k:%d loop:%d fixedK:%d res:%d\n", n,k,loop,tmpK,res);
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


		System.out.printf("%d", res);
	}
}
