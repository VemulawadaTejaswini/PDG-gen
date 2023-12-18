import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) {
		String line = "";
		try {
			line = readLine();

			StringTokenizer st = new StringTokenizer(line, " ");
			String s = st.nextToken();
			//String tempS = st.nextToken();

			//int k = Integer.parseInt(tempK);
			//int s = Integer.parseInt(tempS);
			
			String result="";
			for (int i =0;i<s.length();i++) {
				if (i % 2 == 0) {
					result = result + s.charAt(i);	
				}
			}
			
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
