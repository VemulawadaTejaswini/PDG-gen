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
		int count = 0;

		String s = String.valueOf(num.get(0));
		if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) count++;
		if(s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3)) count++;
		
		if(count >= 1){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}