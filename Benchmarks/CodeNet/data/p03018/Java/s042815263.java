import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");
		String s = "";

		for (int i = 0; i < str.length-1; ++i) {
			if (str[i].equals("B") && str[i + 1].equals("C")) {
				s += "Z";
				i++;
			} else {
				s += str[i];
			}
		}

		String ss[] = s.split("");

		long tmp = 0;
		long ans = 0;

		for (int i = 0; i < ss.length; i++) {
			if (ss[i].equals("A")) {
				tmp++;
			} else if (ss[i].equals("Z")) {
				ans += tmp;
			} else {
				tmp = 0;
			}
		}

		System.out.println(ans);
	}

}