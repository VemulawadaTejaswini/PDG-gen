import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
				String dataSet = br.readLine();
				StringBuilder sb = new StringBuilder();
				for(Integer i = 0;  i < dataSet.length(); i++){
					char c = dataSet.charAt(i);
					if(Character.isUpperCase(c)){
						c = Character.toLowerCase(c);
					}else{
						c = Character.toUpperCase(c);
					}
					sb.append(c);
				}
				System.out.println(sb);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}