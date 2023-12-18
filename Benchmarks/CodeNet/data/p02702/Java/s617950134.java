import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Long sum = 0L;

		if (s.length() < 4) {
			System.out.println(0);
			System.exit(0);
		}


		for (int i = 0; i < s.length() - 4; i++) {
			for (int j = i + 3; j < s.length(); j++) {
				String str = null;
				String buf = null;
				int index = 0;
				int num = 0;
				str = s.substring(i, j + 1);
				if(str.length() > 14) {
					while(index < str.length()) {
						if(buf == null) {
							buf = str.substring(index, index + 14);
						}else {
							buf += str.substring(index, index + 14);
						}
						num = Integer.parseInt(buf) % 2019;
						buf = String.valueOf(num);
						index += 14;
					}
					if(Integer.parseInt(buf) % 2019 == 0) sum++;
				}else {
					if(Long.parseLong(str) % 2019 == 0) {
						sum++;
					}
				}
			}
		}

		System.out.println(sum);
		sc.close();
	}
}