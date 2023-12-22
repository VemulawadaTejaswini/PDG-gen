import java.util.Scanner;
import java.util.ArrayList;

class PrintTestCases extends ArrayList<Integer> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrintTestCases() {
		
	}
	
	private void read() {
		final int FINISH_NUMBER = 0;
		Scanner scan = null;
		while (true) {
			scan = new Scanner(System.in);
			int addNum = scan.nextInt();
			if (FINISH_NUMBER >= addNum) {
				break;
			}
			add(addNum);
		}
	}
	
	private String toString(int index) {
		return "Case " + (index + 1) + ":" + get(index);
	}
	
	public void run() {
		read();
		
		for (int i = 0; i < size(); i++) {
			System.out.println(toString(i));
		}
	}
}
public class Main {

	public static void main(String[] args) {

		new PrintTestCases().run();
	}

}

