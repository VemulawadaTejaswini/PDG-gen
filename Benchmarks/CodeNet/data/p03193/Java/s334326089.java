import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long H = Long.parseLong(sc.next());
		long W = Long.parseLong(sc.next());
		long a = 0;
		long b = 0;
		int cnt=0;
		for(int i=0;i<n;i++) {
			a = Long.parseLong(sc.next());
			b = Long.parseLong(sc.next());
			if(a >= H && b>=W) {
				cnt++;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

}
