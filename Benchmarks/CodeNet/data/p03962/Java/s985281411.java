import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String[] dailyColors = br.readLine().split("\\s");

			int sizeOfColorList = getSizeOfColorList(dailyColors);

			System.out.println(sizeOfColorList);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public static int getSizeOfColorList(String[] dailyColors) {
		
		Set<String> colorList = new HashSet<>();
		
		for(String color : dailyColors) {
			colorList.add(color);
		}
		
		return colorList.size();
	}
}