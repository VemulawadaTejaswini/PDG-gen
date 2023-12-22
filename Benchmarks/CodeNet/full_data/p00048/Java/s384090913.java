import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> ans = new ArrayList<String>();
		
		String[] msg = {"light fly","fly","bantam","feather","light","light welter",
						"welter","light middle","middle","light heavy","heavy"};
		double[] w = {48,51,54,57,60,64,69,75,81,90};
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			
			double weight = Double.parseDouble(s);
			for (int i = 0; i < w.length; i++) {
				if (weight <= w[i]) {
					ans.add(msg[i]);
					break;
				}
			}
			
		}
		
		for (String a : ans)
			System.out.println(a);

	}

}