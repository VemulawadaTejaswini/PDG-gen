import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int[] data = getIntArry(st);
		int m = data[0];
		int t = data[1];
		int cnt = 1;
		int t2 = m;
		while(t2 < t) {
			t2+=(m - 1);
			cnt++;
		}
		if (t == 1) {
			cnt = 0;
		}
		anser(cnt);
	}
 
	private static int[] getIntArry(BufferedReader st) throws Exception, IOException {
		String line = st.readLine();
		String[] strData = line.split(" ");
		int[] intData = new int[strData.length];
		for (int i = 0; i < strData.length; i++) {
			intData[i] = Integer.parseInt(strData[i]);
		}
		return intData;
	}
 
	private static void anser(int num) {
		System.out.println(num);
	}
}