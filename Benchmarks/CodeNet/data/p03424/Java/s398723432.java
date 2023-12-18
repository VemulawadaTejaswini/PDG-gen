import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] f = new int [4];
		for(int i=0;i<n;i++) {
			String a = sc.next();
			if(a.equals("P"))f[0]=1;
			if(a.equals("W"))f[1]=1;
			if(a.equals("G"))f[2]=1;
			if(a.equals("Y"))f[3]=1;
		}
		sc.close();
		int cnt = 0;
		for(int i=0;i<4;i++)cnt += f[i];
		System.out.println(cnt==3?"Three":"Four");
	}
}

