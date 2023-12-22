import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		if (n < 48){
			System.out.println("light fly");
		}
		else if (48 < n && n< 51){
			System.out.println("fly");
		}
		else if (51 < n && n< 54){
			System.out.println("bantam");
		}
		else if (54 < n && n< 57){
			System.out.println("feather");
		}
		else if (57 < n && n< 60){
			System.out.println("light");
		}
		else if (60 < n && n< 64){
			System.out.println("light welter");
		}
		else if (64 < n && n< 69){
			System.out.println("welter");
		}
		else if (69 < n && n< 75){
			System.out.println("light middle");
		}
		else if (75 < n && n< 81){
			System.out.println("middle");
		}
		else if (81 < n && n< 91){
			System.out.println("light heavy");
		}
		else if (91 < n ){
			System.out.println("heavy");
		}

	}
}