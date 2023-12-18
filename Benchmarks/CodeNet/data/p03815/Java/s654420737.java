import java.util.Scanner;

public class Contest053_C {

		public static void main(String[] args) {
			
	        Scanner scan = new Scanner(System.in);
	        String line =  scan.next();
	        
			Long number = Long.parseLong(line);
			Long getNumber = number/6;
			if (number<=6){
				System.out.print(1);
			} else if (number%6==0){
				System.out.println(getNumber);        
			} else {
				System.out.println(getNumber+1);
			}
}
}