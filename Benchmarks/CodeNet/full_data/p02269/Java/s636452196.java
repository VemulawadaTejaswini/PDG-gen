  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Integer> dictionary = new HashMap<String,Integer>();
		StringBuffer ans = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < n; i++){
			String[] order = br.readLine().split(" ");
			if (order[0].contains("insert")) {
				dictionary.put(order[1], i);
			} else {
				if (dictionary.containsKey(order[1])) {
					ans.append("yes" + "\n");
				} else {
					ans.append("no" + "\n");
				}
			}
		}
		System.out.print(ans.toString());
	}
} 