import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String buf = br.readLine();
			String ans = "";

			for (int i=0;i<buf.length();i++) {
				if (buf.charAt(i)=='p') {
					String t = "";
					for (int j=0;j<5;j++) t = t+buf.charAt(i+j);
					if (t.equals("peach")) {
						ans = ans+"apple";
						i += 4;
					} else {
						ans = ans+buf.charAt(i);
					}
				} else if (buf.charAt(i)=='a') {
					String t = "";
					for (int j=0;j<5;j++) t = t+buf.charAt(i+j);
					if (t.equals("apple")) {
						ans = ans+"peach";
						i += 4;
					} else {
						ans = ans+buf.charAt(i);
					}
				} else {
					ans = ans+buf.charAt(i);
				}
			}
			System.out.println(ans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}