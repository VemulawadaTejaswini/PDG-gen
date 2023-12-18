import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

		public static void main(String[] args) {
			BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
			String line;
			
			try{
			line = reader.readLine();
			int number = Integer.parseInt(line);
            int quotient = number/6;
			int remainder = number%6;
			if (number<=6){
				System.out.print(1);
			} 
			
			switch (remainder){
			case 0:
				System.out.println(quotient);
				break;
				
			default :
				System.out.println(quotient+1);
			}
			} catch(IOException e){
				System.out.print(e);
			}
			
}
}