import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int[] list;
		int listSize;
		Scanner keyboard = new Scanner(System.in);
		Scanner integers;
		String inputString;
		
		//get input
		listSize = keyboard.nextInt();
		keyboard.nextLine();
		inputString = keyboard.nextLine();
		
		//initialize list
		list = new int[listSize];
		
		//get integers into our list
		integers = new Scanner(inputString);
		for(int i = 0; i < listSize; i++) {
			list[i] = integers.nextInt();
		}
		
		//output info
		for(int i = 1; i <= listSize; i++) {
			
			System.out.print("node " + i + ": ");
			System.out.print("key = " + list[i-1] + ", ");
			if(i > 1) System.out.print("parent key = " + list[(i/2) - 1] + ", ");
			if(2 * i <= listSize) System.out.print("left key = " + list[(2 * i) - 1] + ", ");
			if((2 * i) + 1 <= listSize) System.out.print("right key = " + list[(2 * i)] + ", ");
			System.out.println();
			
		}
		
		
		
		
	}

}
