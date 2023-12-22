import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 1;
		while(true) {
			if (count > 3000) {
				break;
			}
					
			String input = br.readLine();
			String[] inputList = input.split(" ");
			int a = Integer.parseInt(inputList[0]);
			int b = Integer.parseInt(inputList[1]);
			
			if (a == 0 && b == 0) break;
			
			if (!((a >= 0 && a <= 10000) && (b >= 0 && b <= 10000)))
				throw new IllegalArgumentException();
	
			if (a > b)
				sb.append(a + " " + b + "\n");
			else
				sb.append(b + " " + a + "\n");
			
			count++;
		}
		
		System.out.println(sb.toString());
	}
}