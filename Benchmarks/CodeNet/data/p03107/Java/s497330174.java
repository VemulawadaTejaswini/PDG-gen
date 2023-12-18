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
			boolean loopflg=true;
			int length = temp.length();
			//int LENGTH = length;
			while (loopflg) {
				String tempAftReplace=temp.replace("11","").replace("00","");
				int lengthAftReplace = tempAftReplace.length();
				// replace前後で長さが変わらない場合Loopを抜ける
				if (length==lengthAftReplace) {
					break;
				}
				length = tempAftReplace.length();
			}
			
			System.out.println(temp.length()-length);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
