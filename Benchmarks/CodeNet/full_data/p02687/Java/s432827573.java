import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
		String asw = "ABC";
 
		if (str.equals(asw)) {
			System.out.println("ARC");
		} else {
			System.out.println("ABC");
		}
        scan.close();
    }
}