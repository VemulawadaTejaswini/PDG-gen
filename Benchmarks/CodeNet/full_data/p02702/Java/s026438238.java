import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String S;
	int[] s;
	int[] mods;
	long count = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		S = in.readLine();
		s = new int[S.length()];
		for (int i = 0; i < S.length(); ++i) {
			s[i] = Integer.parseInt(S.substring(i, i + 1));
		}
		mods = new int[S.length()];
		int baseMod = 1;
		mods[mods.length - 1] = (s[mods.length - 1] * baseMod) % 2019;
		for (int i = mods.length - 2; i >= 0; --i) {
			baseMod = baseMod * 10 % 2019;
			mods[i] = (baseMod * s[i] + mods[i + 1]) % 2019;
		}
	}

	void calc() {
		long[] counts = new long[2019];
		Arrays.fill(counts, 0);
		for (int i = 0; i < mods.length; ++i) {
			counts[mods[i]]++;
		}
		count = counts[0];
		for (int i = 0; i < counts.length; ++i) {
			if (counts[i] > 1) {
				count += counts[i] * (counts[i] - 1) / 2;
			}
		}

	}

	void showResult() {
		System.out.println(count);
	}

}
