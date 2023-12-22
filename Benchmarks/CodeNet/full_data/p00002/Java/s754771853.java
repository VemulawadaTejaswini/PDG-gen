import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang.StringUtils;
class Main{
    public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String strArray[];
		String str;
		while (StringUtils.isNotEmpty(line)) {
			strArray = line.split(" ");
			str = String.valueOf(Integer.valueOf(strArray[0]) + Integer.valueOf(strArray[1]));
			char[] charArray = str.toCharArray();
			System.out.println(charArray.length);
			line = br.readLine();
		}
    }
}