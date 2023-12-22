import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int d = sc.nextInt();
			if (w == 0) {
				break;
			}
			int[] hw = new int[w];
			int[] hd = new int[d];
			for(int i=0;i<w;i++) {
				hw[i] = sc.nextInt();
			}
			for(int i=0;i<d;i++) {
				hd[i] = sc.nextInt();
			}
			boolean[] ok = new boolean[w];
			int cost = 0;
			for(int i=0;i<d;i++) {
				for(int j=0;j<w;j++) {
					if (hd[i] == hw[j] && !ok[j]) {
						ok[j] = true;
						break;
					}
				}
				cost += hd[i];
			}
			for(int j=0;j<w;j++) {
				if (!ok[j]) {
					cost += hw[j];
				}
			}
			System.out.println(cost);
		}

	}

}