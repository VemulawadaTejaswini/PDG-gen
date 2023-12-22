import java.util.Scanner;

//https://atcoder.jp/contests/abc179/tasks/abc179_b
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean threeTimes = false;
		int time = 0;
		int d1,  d2;
		int i = 0;
		while(!threeTimes && i < N) {
			
			d1 = sc.nextInt();
			d2 = sc.nextInt();
			i++;
			if(d1 ==  d2) {
				time++;
				if(time == 3) {
					threeTimes = true;
					System.out.println("YES");
					return;
				} 
			}else {
				time = 0;
			}
		}
		System.out.println("NO");
	}
}
