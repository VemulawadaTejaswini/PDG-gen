import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input_number  = Integer.parseInt(scan.next());
    int input_number2 = Integer.parseInt(scan.next());
    if (input_number > input_number2) {
      System.out.println(input_number + " > " + input_number2);
    } else if (input_number == input_number2) {
      System.out.println(input_number + " == " + input_number2);
    } else {
      System.out.println(input_number + " < " + input_number2);
    }
	}
}

