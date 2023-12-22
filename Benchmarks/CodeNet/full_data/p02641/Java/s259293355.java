import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int k = 0;
		int s = 1;
		boolean mini = true;
		boolean large = true;
		int[] p = new int[n];
		if(n == 0) {
			System.out.println(x);
			System.exit(0);
		}
		for(int i = 0; i < p.length; i++) {
			int num = sc.nextInt();
			p[i] = num;
			if(num == x) {
				k += 1;
			}
		}
		if(k == 0) {
			System.out.println(x);
			System.exit(0);
		}
		while(true) {
			int min = x - s;
			int lar = x + s;
			for(int i = 0; i < p.length; i++) {
				if(min == p[i]) {
					mini = false;
				}
				if(lar == p[i]) {
					large = false;
				}
			}
			if(mini == true) {
				System.out.println(min);
				break;
			}
			if(large == true) {
				System.out.println(lar);
				break;
			}
			s++;
			mini = true;
		    large = true;
		}
	}

}