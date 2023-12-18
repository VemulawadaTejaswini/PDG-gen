import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

	    int input1 = scanner.nextInt();
	    int input2 = scanner.nextInt();

	    if(input1<=8 && input2<=8){
	    	System.out.println("Yay!");
	    } else System.out.println(":(");

	    scanner.close();
    }

}
