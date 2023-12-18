import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean isNine = false;
		String inputN = scan.nextLine();
		if(isNumber(inputN)) {
			int n = scan.nextInt();

			int tens = (n / 10) % 10; // (n % 100) / 10
	        int ones = n % 10;
	        if(tens == 9) {
	        	isNine = true;
	        	//System.out.println("Yes");
	        }
	        if(ones == 9) {
	        	isNine = true;
	        	//System.out.println("Yes");
	        }
	        if(isNine == true) {
	        	System.out.println("Yes");
	        }else{
	        	System.out.println("No");
	        }
			}

		}


	public static boolean isNumber(String num) {
	    try {
	        Integer.parseInt(num);
	        return true;
	        } catch (NumberFormatException e) {
	        return false;
	    }
	}
}