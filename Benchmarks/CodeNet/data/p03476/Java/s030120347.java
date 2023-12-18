import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] p = new Point[n];
		boolean[] isSosu = new boolean[100010];

		for(int i = 0; i < n; i++) {
			int li = sc.nextInt();
			int ri = sc.nextInt();
			p[i] = new Point(li,ri);
		}

		for(int i = 2; i < 100010; i++) {
			int warare = i;
			boolean isSo = true;
			for(int warusu = 2; warusu < warare; warusu++) {
				if(warare%warusu==0) {
					isSo = false;
					break;
				}
			}
			isSosu[i]=isSo;
		}
		boolean[] isLike2017 = new boolean[100010];
		for(int i = 1; i < 100000; i+=2) {
			if(isSosu[i]==true&&isSosu[(i+1)/2]==true) {
				isLike2017[i] = true;
			}
		}
		Long count = 0L;
		int st, en;
		for(int i = 0; i < n; i++) {
			count = 0L;
			for(int j = (int) p[i].getX(); j <= p[i].getY(); j++) {
				if(isLike2017[j]==true) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}