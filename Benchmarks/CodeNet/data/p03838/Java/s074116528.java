import java.util.Scanner;
2.public class Main {
3. 
4.	public static void main(String[] args) {
5.		// TODO 自動生成されたメソッド・スタブ
6.		Scanner stdIn = new Scanner(System.in);
7.		int x = stdIn.nextInt();
8.		int y = stdIn.nextInt();
9.		if (x == y)
10.			System.out.println(0);
11.		if (x < y) {
12.			if (x >= 0 || y <= 0)
13.				System.out.println(y - x);
14.			if (x < 0 && y > 0) {
15.				if ((-x) >= y)
16.					System.out.println(y - x);
17.				else
18.					System.out.println(1 + y +x);
19.			}
20.		}
21.		if (y<x) {
22.			if (y >= 0 || x <= 0)
23.				System.out.println(2+x-y);
24.			if (y < 0 && x > 0) {
25.				if ((-y) >= x)
26.					System.out.println(1-x - y);
27.				else
28.					System.out.println(1 + x +y);
29.			}
30.		}
31. 
32.	}
33.}
