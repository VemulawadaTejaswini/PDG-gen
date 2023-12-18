import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Main{
	public static void main(String[] args){
		try{
			File file = new File("input.txt");
			Scanner sc = new Scanner(file);
			Integer num1 = Integer.parseInt(sc.next());
			Integer num2 = Integer.parseInt(sc.next());
			
			Integer ans = num1 * num2;
			
			if (ans % 2 == 0){
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		} catch (FileNotFoundException e){
			System.out.println(e);
		}
	}
}

