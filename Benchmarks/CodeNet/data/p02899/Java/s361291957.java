import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		String[] data = getStrArry(st);
		int[] ans = new int[n];
		for(int i=0;i<n;i++) {
			ans[Integer.parseInt(data[i]) - 1] = i + 1;
		}
		anser(ans);
	}

	private static int getInt(BufferedReader st) throws Exception, IOException {
		int num = Integer.parseInt(st.readLine());
		return num;
	}

	private static String[] getStrArry(BufferedReader st) throws Exception, IOException {
		String line = st.readLine();
		String[] strData = line.split(" ");
		return strData;
	}

	private static void anser(int[] numData) {
		for (int i = 0; i < numData.length; i++) {
			System.out.print(numData[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}