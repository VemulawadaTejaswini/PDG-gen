import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String result = "";
		if("A".equals(line)) {
			result = "T";
		}else if("T".equals(line)) {
			result = "A";
		}else if("C".equals(line)) {
			result = "G";
		}else if("G".equals(line)) {
			result = "C";
		}
			


		
		
		System.out.println(result);

		
		
		
	}
}
	
	