import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {		

		try(BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in))) {
			String[] input = br.readLine().split("\\s");
			Optional<String> N = Optional.ofNullable(input[0]);
			Optional<String> K = Optional.ofNullable(input[1]);
			if(!K.isPresent()) {
				K = Optional.of(br.readLine());
			}
			
			int output = (Integer.parseInt(N.get()) - Integer.parseInt(K.get())) + 1;
			
			System.out.println(output);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
