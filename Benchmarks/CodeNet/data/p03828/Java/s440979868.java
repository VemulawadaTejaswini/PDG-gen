
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		Main instance = new Main();
		sc = instance.new Scanner();
		instance.solve();
	}

	private void solve() {
		try {
			Integer N = sc.nextInt();
			HashMap<String, Integer> soinsuMap = new HashMap<>();

			for (int i = N;i>=2;i--) {
				soinsuMap = soinbunkai(soinsuMap,i);
			}

			long ret =1;
			for(int i : soinsuMap.values()) {
				ret = ret * (i+1) % 1000000007;
			}

			System.out.println(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private HashMap<String,Integer> soinbunkai(HashMap<String,Integer> map, int n){
		HashMap<String, Integer> ret;
		if (map == null) ret = new HashMap<>();
		else ret = map;

		int nnum = n;
		for (int i=2;i<=n;i++){
			while (nnum%i==0) {
				nnum/=i;
				String stri = Integer.toString(i);
				if (ret.containsKey(stri)) ret.put(stri, ret.get(stri)+1);
				else ret.put(stri, 1);

				if (nnum == 1) break;
			}
		}
		return ret;
	}

	private class Scanner {
		String[] s;
		int i;
		BufferedReader br;
		String regex = " ";

		public Scanner() {
			s = new String[0];
			i = 0;
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				destruction();
			}
		}

		private void destruction() throws IOException {
			if (br != null)
				br.close();
		}

		public String next() throws IOException {
			if (i < s.length)
				return s[i++];
			String st = br.readLine();
			while (st == "")
				st = br.readLine();
			s = st.split(regex, 0);
			i = 0;
			return s[i++];
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public Long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public Double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
