import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	while (scan.hasNext()) {
	    String number = scan.nextLine();
	    if (number.equals("0")) {
		break;
	    }
	    System.out.println(sum(number));
	}
    }
    public static int sum (String number) {
	int sum = 0;
	for (int i = 0; i < number.length(); i++) {
	    sum += Integer.valueOf(number.substring(i, i+1));
	}
	return sum;
    }
}