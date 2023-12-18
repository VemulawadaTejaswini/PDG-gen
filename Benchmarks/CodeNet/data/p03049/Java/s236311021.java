import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader BF = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = BF.readLine().split("\\s");
			
			int N = Integer.parseInt(input[0]);
			StringJoiner SJ = new StringJoiner("");
			
			for(int x = 1; x<=N; x++) {
				SJ.add(input.length > x ? input[x].toUpperCase() : BF.readLine().toUpperCase());
			}

			System.out.println(SJ.toString().replaceAll("[^AB]", "").split("AB", -1).length-1);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}