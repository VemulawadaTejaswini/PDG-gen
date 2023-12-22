import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] strArrays = str.split("\\s", 0);
			long a = Long.parseLong(strArrays[0]);
			long b = Long.parseLong(strArrays[1]);
			long tmp, r = 1;
			long num = (Long.parseLong(strArrays[0]) * Long.parseLong(strArrays[1])) / r;
			if (a < b) {
				tmp = a;
				b = a;
				a = tmp;
			}

			r = a % b;
			while (r != 0) {
				a = b;
				b = r;
				r = a % b;
			}
			System.out.print(b + " " + num);
			Str = br.readLine();
		}
	}
}