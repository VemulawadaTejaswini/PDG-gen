import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    int a = Integer.parseInt(inputs[0]);
	    int b = Integer.parseInt(inputs[1]);
	    int d = a / b;
	    int r = a % b;
	    double f = (double)a / (double)b;
	    System.out.println(d + " " + r);
	    System.out.println(String.format("%.5f", f));
	}
    }
}