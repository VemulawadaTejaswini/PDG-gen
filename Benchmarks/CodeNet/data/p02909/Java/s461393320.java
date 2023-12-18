
import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if(str.contentEquals("Sunny")) {
			System.out.println("Cloudy");
		}
		else if(str.contentEquals("Cloudy")) {
			System.out.println("Rainy");
		}
		else {
			System.out.println("Sunny");
		}
	} 

}
