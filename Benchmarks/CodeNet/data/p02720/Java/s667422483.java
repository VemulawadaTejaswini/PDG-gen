
import java.util.Scanner;

public class Main {

	static long Calc(long n) {
		int keta = Long.toString(n).length();
		int[] text = new int[keta + 1];
		for(int i = 0; i < keta; i++) {
			text[i] = (int) (n % 10);
			n /= 10;
		}
		text = Add(keta, text, 0);
		long ans = 0;
		for(int i = keta; i > -1; i--) {
			ans += text[i];
			ans *= 10;
		}
		ans /= 10;
		return ans;
	}

	static int[] Add(int keta, int[] text, int pos) {
		if(pos == keta) {
			text[pos] = 1;
			return text;
		}
		if(text[pos] < 9) {
			if(keta - 1 != pos && text[pos] <= text[pos + 1]) {
				text[pos]++;
			} else if(keta - 1 == pos) {
				text[pos]++;
			} else {
				text = Add(keta, text, pos + 1);
				if(text[pos + 1] > 0)
					text[pos] = text[pos + 1] - 1;
				else
					text[pos] = 0;
			}
		} else {
			text = Add(keta, text, pos + 1);
			if(text[pos + 1] > 0)
				text[pos] = text[pos + 1] - 1;
			else
				text[pos] = 0;
		}

		return text;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long ans = 0;
		for(int i = 0; i < k; i++) {
			ans = Calc(ans);
		}
		System.out.println(ans);

	}

}
