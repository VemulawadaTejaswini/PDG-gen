import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(in.readLine());
			for (int i = 0; i < n; i++) {
				String str = in.readLine();
				str = str.replaceAll("Hoshino", "Hoshina");
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}