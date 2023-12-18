import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
        try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, String> tmp = new HashMap<String, String>();
		for(String s : str.split(" ")){
			tmp.put(s, s);
		}
		System.out.println(tmp.size());
	}
}
