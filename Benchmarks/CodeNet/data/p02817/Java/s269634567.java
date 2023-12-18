public class Main {

	public static void main(String[] args) throws IOException {
		// s, tを取得
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s_t = in.readLine();

		// 半角スペースで区切られたs, tを取得
		int spaceIndex = s_t.indexOf(" ");
		String s = s_t.substring(0, spaceIndex);
		String t = s_t.substring(spaceIndex + 1);

		// T, S の順に空白を空けずに連結して標準出力
		System.out.println(t + s);

	}

}
