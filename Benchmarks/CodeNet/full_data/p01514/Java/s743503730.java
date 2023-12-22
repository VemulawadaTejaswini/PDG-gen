import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new B().doIt();
	}

	class B {
		class Data {
			int Team, accept, time;

			public Data(int Team, int accept, int time) {
				this.Team = Team;
				this.accept = accept;
				this.time = time;
			}
		}

		void doIt() {
			while (true) {
				int T = sc.nextInt();
				int P = sc.nextInt();
				int R = sc.nextInt();
				if(T+P+R == 0)break;
				int ans[][] = new int[T + 1][R + 1];
				int allTime[] = new int[T + 1];
				int ac[] = new int[T + 1];
				Data data[] = new Data[T + 1];
				for (int i = 1; i < T + 1; i++) {
					data[i] = new Data(i, 0, 0);
				}
				for (int i = 0; i < R; i++) {
					int Ti = sc.nextInt();
					int Pr = sc.nextInt();
					int Time = sc.nextInt();
					String n = sc.next();
					if (n.equals("WRONG"))
						ans[Ti][Pr]++;
					else {
						allTime[Ti] = allTime[Ti] + (ans[Ti][Pr] * 1200) + Time;
						ac[Ti]++;
					}
				}
				for (int i = 1; i <= T; i++) {
					data[i] = new Data(i, ac[i], allTime[i]);
				}
				for (int i = 1; i < T; i++) {
					Data temp;
					for (int j = i + 1; j > 1; j--) {
						if (data[j].accept > data[j - 1].accept) {
							temp = data[j];
							data[j] = data[j - 1];
							data[j - 1] = temp;
						} else if (data[j].accept == data[j - 1].accept) {
							if (data[j].time < data[j - 1].time) {
								temp = data[j];
								data[j] = data[j - 1];
								data[j - 1] = temp;
							}
						}
					}
				}
				for (int i = 1; i <= T; i++) {
					System.out.println(data[i].Team + " " + data[i].accept+ " " + data[i].time);
				}
			}
		}
	}
}