import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> hmNbrs = new HashMap<Integer, Integer>();
		ArrayList<Integer> alNotAddNbrs = new ArrayList<Integer>();

		//get
		for(int i = 0; i < 28; i++) {
			hmNbrs.put(Integer.parseInt(bufferedReader.readLine()), 1);
		}

		//pull
		for(int i = 0; i < 30; i++) {
			if(hmNbrs.get(i + 1) == null) alNotAddNbrs.add(i + 1);
		}

		//sort
		int[] arrResult = new int[alNotAddNbrs.size()];

		if(alNotAddNbrs.get(0) < alNotAddNbrs.get(1)) {
			arrResult[0] = alNotAddNbrs.get(0);
			arrResult[1] = alNotAddNbrs.get(1);
		} else {
			arrResult[1] = alNotAddNbrs.get(0);
			arrResult[0] = alNotAddNbrs.get(1);
		}

		for(int i = 0; i < arrResult.length; i++) System.out.println(arrResult[i]);
	}






}
