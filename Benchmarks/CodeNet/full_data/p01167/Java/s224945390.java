
import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	String rev(String s) {
		char[] r = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			r[i] = s.charAt(s.length()-1-i);
		}
		return new String(r);
	}

	void run() {
		int s1[][] = new int[1611][1611];
		int dp1[][]= new int[1611][1611];
		int s2[][] = new int[1611][1611];
		int dp2[][]= new int[1611][1611];

		for (;;) {
			String x1 = rev(sc.next());
			if (x1.equals("*"))
				break;
			String y1 = rev(sc.next());
			String zz = sc.next();
			String z1 = rev(zz);
			{
				String y = y1;
				String x = x1;
				String z = z1;

				boolean ok = true;
				for (int i = 0, cnt = 0; i < x.length(); i++) {
					if (x.charAt(x.length() - 1 - i) == z.charAt(z.length() - 1
							- cnt)) {
						cnt++;
						if (cnt == z.length()) {
							break;
						}
					}
					if (i == x.length() - 1)
						ok = false;
				}
				for (int i = 0, cnt = 0; i < y.length(); i++) {
					if (y.charAt(y.length() - 1 - i) == z.charAt(z.length() - 1
							- cnt)) {
						cnt++;
						if (cnt == z.length()) {
							break;
						}
					}
					if (i == y.length() - 1)
						ok = false;
				}
				if (!ok) {
					System.out.println("Impossible");
					continue;
				}
			}

			// System.out.println(x);
			// System.out.println(y);
		
			{
				String y = y1;
				String x = x1;
				String z = z1;

				s1 = new int[x.length() + 1][y.length() + 1];
				dp1  = new int[x.length() + 1][y.length() + 1];
				for (int i = 0; i < x.length(); i++) {
					for (int j = 0; j < y.length(); j++) {
						if (x.charAt(i) == y.charAt(j)) {
							dp1[i + 1][j + 1] = dp1[i][j] + 1;
							s1[i + 1][j + 1] = 1;
						} else {
							if (dp1[i][j + 1] < dp1[i + 1][j]) {
								dp1[i + 1][j + 1] = dp1[i + 1][j];
								s1[i + 1][j + 1] = 0;
							} else {
								dp1[i + 1][j + 1] = dp1[i][j + 1];
								s1[i + 1][j + 1] = -1;
							}
						}
					}
				}
			}

			{
				String y = rev(y1);
				String x = rev(x1);
				String z = rev(z1);
				
				for (int i = 0; i < x.length(); i++) {
					for (int j = 0; j < y.length(); j++) {
						if (x.charAt(i) == y.charAt(j)) {
							dp2[i + 1][j + 1] = dp2[i][j] + 1;
							s2[i + 1][j + 1] = 1;
						} else {
							if (dp2[i][j + 1] < dp2[i + 1][j]) {
								dp2[i + 1][j + 1] = dp2[i + 1][j];
								s2[i + 1][j + 1] = 0;
							} else {
								dp2[i + 1][j + 1] = dp2[i][j + 1];
								s2[i + 1][j + 1] = -1;
							}
						}
					}
				}
			}
			
			LinkedList<Point> lx = new LinkedList<Point>();
			for(int i=0; i<x1.length(); i++) {
				int s = i;
				int e=-1;
				if(x1.charAt(i) == z1.charAt(0)) {
					boolean ok = false;
					int j=i;
					for(int cnt=0; j<x1.length() && cnt<z1.length(); j++) {
						if(x1.charAt(j) == z1.charAt(cnt)) {
							cnt++;
							if(cnt==z1.length()) {
								ok = true;
								break;
							}
						}
					}
					if(ok) {
						e = j;
						lx.add(new Point(s, e));
						i = s+1;
					}else {
						break;
					}
				}
			}
			
			LinkedList<Point> ly = new LinkedList<Point>();
			for(int i=0; i<y1.length(); i++) {
				int s = i;
				int e=-1;
				if(y1.charAt(i) == z1.charAt(0)) {
					boolean ok = false;
					int j = i;
					for(int cnt=0; j<y1.length() && cnt<z1.length(); j++) {
						if(y1.charAt(j) == z1.charAt(cnt)) {
							cnt++;
							if(cnt==z1.length()) {
								ok = true;
								break;
							}
						}
					}
					if(ok) {
						e = j;
						ly.add(new Point(s, e));
						i = s+1;
					}else {
						break;
					}
				}
			}
			
			int max = -1;
			Point mx=new Point(-1,-1), my = new Point(-1,-1);
			
			for(int i=0; i<lx.size(); i++) {
				for(int j=0; j<ly.size(); j++) {
					Point x = lx.get(i);
					Point y = ly.get(j);
					int value = dp1[x.x][y.x] + dp2[x1.length()-1-x.y][y1.length()-1-y.y];
					if(max < value) {
						mx = x;
						my = y;
						max = value;
					}
				}
			}
			if(mx.x == -1) {
				System.out.println("Impossible");
				continue;
			}
			
			for (int a = mx.y, b = my.y; a < x1.length()-1 && b < y1.length()-1;) {
				if (s2[a][b] == 1) {
					System.out.print(x1.charAt(a + 1));
					a++;
					b++;
				} else if (s2[a][b] == 0) {
					b++;
				} else {
					a++;
				}
			}
			
			System.out.print(zz);
			
			for (int a = mx.x, b = my.x; a > 0 && b > 0;) {
				if (s1[a][b] == 1) {
					System.out.print(x1.charAt(a - 1));
					a--;
					b--;
				} else if (s1[a][b] == 0) {
					b--;
				} else {
					a--;
				}
			}
			System.out.println();
			
			// System.out.println(dp[x.length()][y.length()]+z.length());
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}