import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	private void doit() {
		while (true) {
			int [] data = new int[6];
			boolean flg = true;
			for(int i = 0; i < 6; i++){
				data[i] = sc.nextInt();
				if(data[i] != 0) flg = false;
			}
			if(flg) break;
			int plus = data[0] * 15 + data[1] * 15 + data[2] * 7 + data[3] * 2 + data[0] * 5 * 13 + data[1] * 3 * 13;
			int minus = (data[5] - data[4] - data[0] * 5 - data[1] * 3) * 3;
			System.out.println(plus + 100 - minus);
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}