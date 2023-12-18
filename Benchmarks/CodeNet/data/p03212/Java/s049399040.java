

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	static int n = 0;

	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			n = Integer.parseInt(br.readLine());
			System.out.println(get("0"));
		}
	}
	
	public static int get(String a) {
		boolean[] bools = {false, false, false};
		List<String> num = new ArrayList<>(Arrays.asList(a.split("")));
		int count = 0;
		
		num.remove("0");
		
		if(Integer.parseInt(a) > n) return 0;
		
		for (String s : num) {
			int i = Integer.parseInt(s);
			if(i == 3) bools[0] = true;
			else if(i == 5) bools[1] = true;
			else if(i == 7) bools[2] = true;
			else {
				bools[0] = false;
				break;
			}
		}
		if(bools[0] && bools[1] && bools[2]) count++;
		if(Integer.parseInt(a) == 0) a = "";
		
		for (String ss : "357".split("")) {
			count += get(a + ss);
		}
		return count;
		
	}

}
