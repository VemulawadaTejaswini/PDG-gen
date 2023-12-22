
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String regex = "Hoshino";
		Pattern p = Pattern.compile(regex);
		for(int i = 0 ; i < n;i++){
			String str = br.readLine();
			Matcher m = p.matcher(str);
			m.replaceAll("Hoshina");
			System.out.println(m.replaceAll("Hoshina"));
		}
	}

}