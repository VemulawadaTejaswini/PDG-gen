import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int cnt=0;
		for(int i=a;i<=b;i++) {
			//n1: iを反転した１つ目の桁
			int n1 = i%10,n5=i/10000%10;
			int n2 = i/10%10,n4=i/1000%10;
			if(n1==n5&&n2==n4)cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
