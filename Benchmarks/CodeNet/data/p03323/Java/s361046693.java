import java.io.InputStream;
2.import java.util.Scanner;
3. 
4.public class Main {
5.	public static void main(String[] args) throws Exception {
6.		InputStream is = System.in;
7.		solve(is);
8.	}
9. 
10.	private static void solve(InputStream is) {
11.		try (Scanner cin = new Scanner(is)) {
12.			int m = cin.nextInt();
13.			int n = cin.nextInt();
14. 
15.			if (m > 8 || n > 8) {
16.				System.out.println(":(");
17.			} else {
18.				System.out.println("Yay!");
19.			}
20.		}
21.	}
22.}
