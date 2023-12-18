import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		
		String a = stdIn.next();
		
		if(a.equals("Sunny")) {
			System.out.println("Cloudy");
		}
		if(a.equals("Cloudy")) {
			System.out.println("Rainy");
		}
		if(a.equals("Rainy")) {
			System.out.println("Sunny");
        }		
	}

}
