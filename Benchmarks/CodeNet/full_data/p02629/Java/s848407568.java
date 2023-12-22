import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		sc.close();

		int count = 1;
		if(N <= 26) {
			int ans = (int) N - 1;
			System.out.println((char)('a' + ans));
			return;
		}
		
		for(int i = 1; ;i++) {
			N -= (int) Math.pow(26, i);
			if(N > 0) {
				count++;
			}else {
				break;
			}
		}

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < count;i++) {
			int mod = (int) N % 26;
			if (mod == 0) {
                N--;
                mod = 25;
            } else {
                mod--;
            }
			sb.append((char)('a' + mod));
			N /= 26;
		}
		System.out.println(sb.toString());

	}

}