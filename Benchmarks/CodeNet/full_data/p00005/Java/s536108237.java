import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		long 			x, y, origX, origY;
		String			buffer;
		BufferedReader 	reader = new BufferedReader(new InputStreamReader(System.in));

		while((buffer = reader.readLine()) != null){
			x = Long.parseLong(buffer.split(" ")[0]);
			y = Long.parseLong(buffer.split(" ")[1]);

			origX = x;
			origY = y;

			if(x < y){
				long tmp = x;
				x = y;
				y = tmp;
			}

			long mod;
			while((mod = x % y) != 0){
				x = y;
				y = mod;
			}

			System.out.println(y + " " + (origX * origY / y));
		}


	}

}