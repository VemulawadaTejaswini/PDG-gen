import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = 0;
		int  n = 0;
		int count = 0;
		boolean noLimit = true;

		try {
			String[] a1 = br.readLine().split(" ");
			n = Integer.valueOf(a1[0]);
			m = Integer.valueOf(a1[1]);
			List<Integer> denominationsList = makeDenominationsList(br);
			int index = denominationsList.size() - 1;
			int checkerDenom = denominationsList.get(index);

			while(noLimit){
				if(n >= checkerDenom){
					count++;
					n -= checkerDenom;
				} else {
					index = index--;
					if(!(index < 0)){
						checkerDenom = denominationsList.get(index--);
					} else {
						noLimit = false;
					}
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			Logger.getGlobal();
			throw new RuntimeException(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				Logger.getGlobal();
			}
		}
	}

	private static List<Integer> makeDenominationsList(BufferedReader br) throws IOException {
		List<Integer> denominationsList = new ArrayList<>();
		String[] denominationsStr = br.readLine().split(" ");
		for(int i = 0; i < denominationsStr.length; i++){
			denominationsList.add(Integer.valueOf(denominationsStr[i]));
		}
		return denominationsList;
	}
}