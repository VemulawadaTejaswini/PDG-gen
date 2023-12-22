import java.io.*;
import java.util.StringTokenizer;

class Index {
	String str;
	int num = 1;
	int length;

	Index(String s) {
		this.str = s;
		this.length = s.length();
	}

	void add() {
		this.num++;
	}

	boolean check(String s) {
		if (this.str.equals(s)) return true;
		else return false;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String buf = br.readLine();
			Index i[] = new Index[1000];
			StringTokenizer st = new StringTokenizer(buf);
			int c = 0;
			boolean isNotAdded = true;

			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				for (int j=0;j<c;j++) {
					if (i[j].check(s)) {
						i[j].add();
						isNotAdded = false;
					}
				}
				if (isNotAdded) i[c++] = new Index(s);
				isNotAdded = true;
			}
			int mfw = 0;
			int mlw = 0;
			for (int j=0;j<c;j++) {
				if (i[j].num>mfw) mfw = i[j].num;
				if (i[j].length>mlw) mlw = i[j].length;
			}
			String MFW = "";
			String MLW = "";
			for (int j=0;j<c;j++) {
				if (mfw==i[j].num) MFW = i[j].str;
				if (mlw==i[j].length) MLW = i[j].str;
			}
			System.out.println(MFW+" "+MLW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}