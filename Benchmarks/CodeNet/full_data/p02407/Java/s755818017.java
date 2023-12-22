import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String input = scan.nextLine();
	String[] sequence = input.split(" ");
	for (int i = n - 1; i > 0; i--) {
	    System.out.print(sequence[i] + " ");
	}
	System.out.println(sequence[0]);
    }
}