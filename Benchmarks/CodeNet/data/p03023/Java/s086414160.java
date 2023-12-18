import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] nums = input.split(" ", 0);
			
			int n = Integer.parseInt(nums[0]);
			
			System.out.println(180*(n-2));
			
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}