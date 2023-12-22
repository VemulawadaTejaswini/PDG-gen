

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>(); //Stack???????????£????????§?????????
		
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArr = line.split(" ");
        
        
		for(String item: lineArr){
			if (item.equals("+")) {
				int first = stack.pollFirst();
				int second = stack.pollFirst();
				stack.offerFirst(second + first);
			}else if (item.equals("-")) {
				int first = stack.pollFirst();
				int second = stack.pollFirst();
				stack.offerFirst(second - first);
			}else if (item.equals("*")) {
				int first = stack.pollFirst();
				int second = stack.pollFirst();
				stack.offerFirst(second * first);
			}else { // ??°???
				stack.offerFirst(Integer.parseInt(item));
			}
		}
		System.out.println(stack.pollFirst());
		sc.close();
	}

	
}