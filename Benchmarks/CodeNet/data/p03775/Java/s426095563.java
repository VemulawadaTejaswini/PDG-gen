import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> num = new ArrayList<Long>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextLong()) {
				num.add(sc.nextLong());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Long> num, ArrayList<String> param) {
		long min = 999999999999999999l;
		long calc = 999999999999999999l;

		for(long i = num.get(0) / 2; i > 0; i--){
			if(num.get(0) % i == 0){
				calc = Math.max(String.valueOf(num.get(0) / i).length(),String.valueOf(i).length());
				if(min > calc){
					min = calc;
				}
			}
		}
		System.out.println(min);
	}
}