

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] stack = new String[1000];
		int pointer = 0;
		while(scan.hasNext()) {
			String[] aaa = scan.nextLine().split(" ");
			if (aaa[0].equals("push")) {
				stack[pointer] = aaa[1];
				pointer++;
			} else if (aaa[0].equals("pop")) {
				pointer--;
				System.out.println(stack[pointer]);
			} else if (aaa[0].equals("quit")) {
				break;
			} else {
				System.out.println("Error");
				break;
			}
		}
	}

}