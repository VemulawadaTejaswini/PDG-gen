import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		Dice[] dices = new Dice[n];
		for (int i = 0; i < n; i++) {
			dices[i] = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
		boolean flag = true;
		out2:
		for (int ii = 0; ii < n; ii++) {
			Dice d = dices[ii];
			for (int jj = ii + 1; jj < n; jj++) {
				Dice d2 = dices[jj];

				char[] cmd = "EEEENEEEENEEEENEEEENWNEEEENNEEEE".toCharArray();
				boolean flag2 = false;
				out:
					for (int i = 0; i < cmd.length; i++) {
						if (cmd[i] == 'N') {
							d.N();
						} else if (cmd[i] == 'S') {
							d.S();
						} else if (cmd[i] == 'E') {
							d.E();
						} else if (cmd[i] == 'W') {
							d.W();
						}
						for (int j = 0; j < cmd.length; j++) {
							if (cmd[j] == 'N') {
								d2.N();
							} else if (cmd[j] == 'S') {
								d2.S();
							} else if (cmd[j] == 'E') {
								d2.E();
							} else if (cmd[j] == 'W') {
								d2.W();
							}
							if (d.isSame(d2)) {
								flag2 = true;
								break out;
							}
						}
					}
				if (flag2) {
					flag =false;
					break out2;
				}
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
	
	private static class Dice {
		int[] s;
		int up;
		int north;
		int east;

		Dice(int s1, int s2, int s3, int s4, int s5, int s6) {
			s = new int[6];
			s[0] = s1;
			s[1] = s2;
			s[2] = s3;
			s[3] = s4;
			s[4] = s5;
			s[5] = s6;
			up = 1;
			north = 5;
			east = 3;
		}
		
		public boolean isSame(Dice d2) {
			boolean flag = true;
			for (int i = 0; i < 6; i++) {
				if (s[up - 1] != d2.s[d2.up - 1]
					|| s[7 - up - 1] != d2.s[7 - d2.up - 1]
					|| s[north - 1] != d2.s[d2.north - 1]
					|| s[7 - north - 1] != d2.s[7 - d2.north - 1]
					|| s[east - 1] != d2.s[d2.east - 1]
					|| s[7 - east - 1] != d2.s[7 - d2.east - 1]) {
					flag =false;
				}
			}
			
			return flag;
		}

		void N() {
			int temp = 7 - north;
			north = up;
			up = temp;
		}
		
		void S() {
			int temp = 7 - up;
			up = north;
			north = temp;
		}
		
		void E() {
			int temp = 7 - east;
			east = up;
			up = temp;
		}

		void W() {
			int temp = 7 - up;
			up = east;
			east = temp;
		}
		
//		int now() {
//			return s[up - 1];
//		}

		public int getEast(int upValue, int southValue) {
			int upNow;
			for (upNow = 1; upNow <= 6; upNow++) {
				if (s[upNow - 1] == upValue) {
					break;
				}
			}
			int northNow;
			for (northNow = 1; northNow <= 6; northNow++) {
				if (s[northNow - 1] == southValue) {
					northNow = 7 - northNow;
					break;
				}
			}
			
			char[] cmd = "EEEENEEEENEEEENEEEENWNEEEENNEEEE".toCharArray();
			for (int i = 0; i < cmd.length; i++) {
				if (cmd[i] == 'N') {
					N();
				} else if (cmd[i] == 'S') {
					S();
				} else if (cmd[i] == 'E') {
					E();
				} else if (cmd[i] == 'W') {
					W();
				}
				if (northNow == this.north && upNow == this.up) {
					return s[east - 1];
				} else if (northNow == 7 - this.north && upNow == this.up) {
					return s[7 - east - 1];
				} else if (northNow == this.north && upNow == 7 - this.up) {
					return s[7 - east - 1];
				}
			}
			
			return -1;
		}
	}
}