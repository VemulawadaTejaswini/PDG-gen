import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(Objects.equals(str.charAt(2), str.charAt(3)) && Objects.equals(str.charAt(4), str.charAt(5))) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		};
		
		
	}
}