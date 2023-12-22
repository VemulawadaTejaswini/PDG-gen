import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			while (true) {
				String dataSet = br.readLine();
				if(dataSet.equals("0")){
					break;
				}
				int answer = 0;
				for(Integer i = 0;  i < dataSet.length(); i++){
					answer += Integer.parseInt(dataSet.substring(i, i+1));
				}
				System.out.println(answer);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}