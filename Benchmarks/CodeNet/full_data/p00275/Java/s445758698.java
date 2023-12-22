import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			char card[] = sc.next().toCharArray();
			int slave = 0;
			int turn = 0;
			int p[] = new int[N];
			for (int i = 0; i < 100; i++) {
				turn = i % N;
				switch (card[i]) {
				case 'M':
					p[turn]++;
					break;
				case 'S':
					p[turn]++;
					slave += p[turn];
					p[turn] = 0;
					break;
				case 'L':
					p[turn]++;
					p[turn] += slave;
					slave = 0;
					break;
				default:
					break;
				}
			}
			Arrays.sort(p);
			for(int i=0;i<N;i++) {
				System.out.print(p[i]+" ");
			}
			System.out.println(slave);
		}

	}

}