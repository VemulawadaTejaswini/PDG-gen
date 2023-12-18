import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		//ArrayList <Integer> list = new ArrayList <Integer>();
		int Rmin = Integer.MAX_VALUE;
		int Lmax = Integer.MIN_VALUE;
		for (int i = 0; i < M; i++) {
			line = reader.readLine();
			String[] LR = line.split(" ");
			int L = Integer.parseInt(LR[0]);
			int R = Integer.parseInt(LR[1]);
			if (L > Lmax) {
				Lmax = L;;
			}
			if  (R < Rmin) {
				Rmin = R;;
			}
		}
		if (Rmin >= Lmax) {
			System.out.println(Rmin - Lmax + 1);
		}
		else {
			System.out.println(0);
		}
	}
}