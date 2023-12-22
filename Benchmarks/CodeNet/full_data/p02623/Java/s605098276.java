import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lengthFirst = scanner.nextInt();
		int lengthSecond = scanner.nextInt();
		int maximum = scanner.nextInt();
		int result = 0;
		int sum = 0;
		Stack<Integer> books1 = new Stack<Integer>();
		Stack<Integer> books2 = new Stack<Integer>();
		
		for(int i = 0; i < lengthFirst; i++)
			books1.add(scanner.nextInt());
		for(int i = 0; i < lengthSecond; i++)
			books2.add(scanner.nextInt());
		
		for(int i = 0; i < lengthFirst + lengthSecond; i++) {
			if(books1.get(0) > books2.get(0)) {
				sum += books2.get(0);
				books2.remove(0);
			}
			else if(books1.get(0) < books2.get(0)) {
				sum += books1.get(0);
				books1.remove(0);
			}
			else if(books1.get(0) == books2.get(0)) {
				
				sum += books1.get(0);
				books1.remove(0);
			}
			if(sum > maximum)
				break;
			result++;
		}
		System.out.println(result);
	}
}
