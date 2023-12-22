import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				StringTokenizer st = new StringTokenizer(br.readLine());
				ArrayList<Integer> a = new ArrayList<Integer>();

				for (int i=0;i<n;i++) a.add(Integer.parseInt(st.nextToken()));
				Collections.sort(a);

				boolean end = false;
				for (int i=0;i<n;) {
					int count = 1;
					int j = a.get(i);
					i++;
					while (i<a.size()&&j==a.get(i)) {
						count++;i++;
					}
					if (count>n/2) {
						System.out.println(a.get(j));
						end = true;
					}
					if (end) break;
				}
				if (!end) {
					System.out.println("NO COLOR");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}