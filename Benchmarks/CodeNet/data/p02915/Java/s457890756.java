import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Integer input = Integer.parseInt(scan.nextLine());
 
        if(input == 1) {
        	System.out.println(1);
        } else {
        	int passKindCount = passKindCountCalc(input);
        	System.out.println(passKindCount);
        }
        scan.close();
	}
	
	private static int passKindCountCalc(int passKind) {
		
		int num = passKind ^ 3;
		return num;
		
	}

}
