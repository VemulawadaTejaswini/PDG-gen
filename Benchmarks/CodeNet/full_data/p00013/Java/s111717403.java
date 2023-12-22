import java.util.ArrayDeque;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayDeque<Integer> k = new ArrayDeque<Integer>();
		while(stdIn.hasNext()) {
			int tmp = stdIn.nextInt();
			if(tmp == 0) {
				System.out.println(k.pop());
			}
			else {
				k.push(tmp);
			}
		}
	}
}