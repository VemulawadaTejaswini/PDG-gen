import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int				number;
		BufferedReader 	reader = new BufferedReader(new InputStreamReader(System.in));


		while((number = Integer.parseInt(reader.readLine())) != 0){
			int sum = 0;
			for(int i = 1; i * 2< number; i++){
				if(number % i == 0) sum += i;
			}

			if	   (number == 1)	System.out.println("deficient number");
			else if(number < sum)	System.out.println("deficient number");
			else if(number > sum)	System.out.println("abundant number");
			else 					System.out.println("perfect number");
		}
	}
}