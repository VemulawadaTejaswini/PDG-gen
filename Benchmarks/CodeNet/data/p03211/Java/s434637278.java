import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//line = br.readLine();
			String s= br.readLine();
			//StringTokenizer st = new StringTokenizer(line, "");
			int min = 999999999;
			for (int i =0;i < s.length()-3;i++) {
				int temp = Integer.parseInt(s.substring(i, i+3));
				if (753-temp < min) {
					min= Math.abs(753-temp);
				}
			}
			
			System.out.println(min);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
