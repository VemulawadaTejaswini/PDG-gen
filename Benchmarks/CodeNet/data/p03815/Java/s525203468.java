import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String line =  scan.next();
		Long number = Long.parseLong(line);
 
		Long count=0L;
		if (number<=6){
			System.out.print(1);
		} else {
		    count = number/5;
		
		}
		System.out.print(count+1);
		
 
	}
 
}