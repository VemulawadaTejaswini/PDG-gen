import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println(sc.next().matches(".*C.*F.*") ? "Yes" : "No");
		}
	}
}