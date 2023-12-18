import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out);) {
			String[] AB = br.readLine().split(" ");
			int A = Integer.parseInt(AB[0]);
			int B = Integer.parseInt(AB[1]);
			String S = br.readLine();
			if (S.length() - 1 == A + B && S.indexOf("-") == A) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
			pw.flush();
		} catch (Exception e) {
		}
	}
}