import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;

	while (scan.hasNext()) {
	    sum = scan.nextInt() + scan.nextInt();
	    System.out.println((sum+"").length());
	}
    }
}