import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		int[] ps = new int[101];
		boolean borderZero = x <= 50 ? true : false; 
		
		for (int i = 0; i < n; i++) {
			ps[sc.nextInt()] = 1;
		}
		
		for (int i = 0; ; i++) {
			if (x - i == 0) {
				if (borderZero) {
					System.out.println(0);
					break;
				}
			} else if (x + i == 101) {
				if (!borderZero) {
					System.out.println(101);
					break;
				}
			}
			if (ps[x-i] == 0) {
				System.out.println(x-i);
				break;
			} else if (ps[x+i] == 0) {
				System.out.println(x+i);
				break;
			}
			
		}


		
	}
}
