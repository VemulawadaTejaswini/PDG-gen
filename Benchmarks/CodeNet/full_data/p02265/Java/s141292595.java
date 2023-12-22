import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Deque<Integer> list = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			 String command = sc.nextLine();

			 if(command.charAt(0) == 'i') {
				 list.push(Integer.parseInt(command.substring(7)));
			 } else if (command.charAt(6) == ' ') {
				 list.remove(Integer.parseInt(command.substring(7)));
			 } else if (command.charAt(6) == 'F') {
				 list.removeFirst();
			 } else {
				 list.removeLast();
			 }
			command = null;

		}
		sc.close();

		System.out.print(list.poll());
		while (list.size() != 0) {
			System.out.print(" " + list.poll());
		}
		System.out.println();

	}
}