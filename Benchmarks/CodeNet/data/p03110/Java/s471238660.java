import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double[]val = new double [n];
		String[] type = new String[n];
		for(int i= 0;i<n;i++) {
			val[i] = Double.parseDouble(sc.next());
			type[i] = sc.next();
		}
		sc.close();
		long Yen = 0;
		double BTC = 0;
		for(int i=0;i<n;i++) {
			if(type[i].equals("JPY")) {
				Yen += val[i];
			}else if(type[i].equals("BTC")){
				BTC += val[i];
			}
		}

		BTC *= 380000;
		System.out.println(Yen+BTC);
	}

}


