import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(true) {
			String rank;
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1) break;
			if(m == -1) m = 0;
			if(f == -1) f = 0;
			if(m + f >= 80) rank = "A";
			else if (m + f >= 65) rank = "B";
			else if (m + f >= 50) rank = "C";
			else if (m + f >= 30) {
				if(r >= 50) rank = "C";
				else rank = "D";
			} else rank = "F";
		System.out.println(rank);
		}
	}
}