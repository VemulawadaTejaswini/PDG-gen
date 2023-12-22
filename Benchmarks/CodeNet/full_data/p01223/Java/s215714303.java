import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader 	reader  = new BufferedReader(new InputStreamReader(System.in));
		List<Integer[]> list	= new ArrayList<Integer[]>();

		for(int i = 0, loopMax = Integer.parseInt(reader.readLine());i < loopMax; i++){
			int cell = Integer.parseInt(reader.readLine());
			String[] valueListStrings = reader.readLine().split(" ");

			int crime = 0, decent = 0;
			for(int j = 0; j < valueListStrings.length - 1; j++){
				int tmp = (Integer.parseInt(valueListStrings[j]) - Integer.parseInt(valueListStrings[j + 1]));

				if(tmp < crime)			crime = tmp;
				else if(tmp > decent)	decent= tmp;
			}
			list.add(new Integer[]{Math.abs(crime), decent});
		}

		for (Integer[] integers : list) {
			System.out.println(integers[0] + " " + integers[1]);
		}
	}
}