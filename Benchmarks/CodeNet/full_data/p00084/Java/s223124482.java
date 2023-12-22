import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for(String s : array) {
			String[] data = s.split("[, .]");
			String answer = null;
			for(String word : data) {
				if(word.length() <= 6 && word.length() >= 3) {
					if(answer == null) {
						answer = word;
					} else {
						answer += " " + word;
					}
				}
			}
			System.out.println(answer);
		}
	}

}