import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder output = new StringBuilder();
		while(true) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a == 0 && b == 0)
				break;
			if (a <= b) {
				output.append(a).append(" ").append(b).append('\n');
			} else {
				output.append(b).append(" ").append(a).append('\n');
			}
		}
		System.out.print(output);
	}

}