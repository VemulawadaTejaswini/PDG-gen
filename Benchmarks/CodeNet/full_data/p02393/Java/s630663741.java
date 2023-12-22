import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null){
				String[] temp = line.split(" ");
				sortAndPut(temp);
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}

	private static void sortAndPut(String[] temp){
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int n = 0; n <= temp.length; n++){
			x.add(Integer.parseInt(temp[n]));
		}
		Collections.sort(x);
		System.out.println(x);
	}
}