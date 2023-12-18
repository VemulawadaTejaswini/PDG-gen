import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String temp = br.readLine();
			int slength = temp.length();
			int slengthAft = temp.length();
			//String tempAftReplace="";
			while (true) {
				int tempLength=temp.length();
				temp=temp.replace("01","").replace("10","");
				// replace前後で長さが変わらない場合Loopを抜ける
				if (tempLength==temp.length()) {
					break;
				}
			}
			
			System.out.println(slength-temp.length());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
