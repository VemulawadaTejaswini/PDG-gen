import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			String[] splitInput = input.split(" ");
			
			List<Integer> inputList = new ArrayList<Integer>();

			inputList.add(Integer.parseInt(splitInput[0]));
			inputList.add(Integer.parseInt(splitInput[1]));
			inputList.add(Integer.parseInt(splitInput[2]));
			
			for (int num : inputList) {
				if (!(num >= 1 && num <= 10000)){
					throw new IllegalArgumentException();
				}
			}
			
			Collections.sort(inputList);
			
			String ans = "";
			for (int num : inputList) {
				ans += String.valueOf(num) + " ";
			}
			System.out.println(ans);

		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}