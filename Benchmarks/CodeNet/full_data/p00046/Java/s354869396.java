import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		double max=0, min=0;
		boolean button = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine()) != null) {
			double input2 = Double.parseDouble(input);
			if(button) {
				max = min = input2;
				button = false;
			}
			if(input2 > max) max = input2;
			else if(input2 < min) min = input2;
		}
		System.out.println(max-min);
	}
}