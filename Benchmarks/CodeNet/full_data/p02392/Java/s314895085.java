import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null){
				String[] temp = line.split(" ");
				put(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}

	private static void put(int a, int b, int c){
		if(a < b && b < c){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}