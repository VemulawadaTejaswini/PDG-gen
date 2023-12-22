import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class　Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				line.trim();
				
				String[] words = line.split("\\s");
				ArrayList<Integer> num = new ArrayList<Integer>();
				for(String s : words) num.add(Integer.parseInt(s));
				
				Collections.sort(num);
				Collections.reverse(num);

				String str = num.toString();
				str = str.replaceAll("[\\[\\],]", "");
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}