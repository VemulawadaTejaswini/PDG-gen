import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}
			int l = sc.nextInt();

			char[] dir = new char[n];
			int[] place = new int[n];
			for (int i = 0; i < n; i++) {
				dir[i] = sc.next().charAt(0);
				place[i] = sc.nextInt();
			}

			int time = 0;
			while (true) {
				time++;
				for (int i = 0; i < n; i++) {
					if (place[i] < 1 && place[i] >= l) {
						continue;
					}
					if (dir[i] == 'R') {
						place[i]++;
					} else {
						place[i]--;
					}
				}

				ArrayList<Integer> inside = new ArrayList<Integer>();
				for (int p = 1; p < l; p++) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					for (int ant = 0; ant < n; ant++) {
						if (place[ant] == p) {
							list.add(ant);
							inside.add(ant);
						}
					}

					// ぶつかった奴は向きを変える
					if (list.size() >= 2) {
						for (Integer ant : list) {
							if (dir[ant] == 'R') {
								dir[ant] = 'L';
							} else {
								dir[ant] = 'R';
							}
						}
					}
				}

				if (inside.size() == 1) {
					// 最後に残っているアリが1匹いた場合
					int ant = inside.get(0);
					if (dir[ant] == 'R') {
						// 右向きならtimeにplace[ant]がlになるまでの時間を足す
						int rest = l - place[ant];
						System.out.println((time + rest) + " " + (ant + 1));
					} else {
						// 左向きならtimeにplace[ant]が0になるまでの時間を足す
						System.out.println((time + place[ant]) + " "
								+ (ant + 1));
					}
					break;
				} else if (inside.size() == 2) {
					int antL = inside.get(0);
					int antR = inside.get(1);

					if (dir[antL] == 'L' && place[antL] == 1
							&& dir[antR] == 'R' && place[antR] == l - 1) {
						// 2匹同時退出の場合、左側のアリを出力
						System.out.println((time + 1) + " " + (antL + 1));
						break;
					}
				}

			}

		}

	}
}