import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    int a = Integer.parseInt(inputs[0]);
	    int b = Integer.parseInt(inputs[1]);
	    int c = Integer.parseInt(inputs[2]);
	    int count = 0;
	    for (int i = a; i <= b; i++) {
		if (c % i ==0) {
		    count++;
		}
	    }
	    System.out.println(count);
	}
    }
}