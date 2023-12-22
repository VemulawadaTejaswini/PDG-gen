import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		for(int i=1;i<=X; i++) {
			int t = i*2;
			int k = (X-i)*4;
			if(t+k == Y) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
