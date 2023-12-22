import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

	public static final int SIZE = 15;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();

			if(a == 0 && b == 0){
				break;
			}
			
			final int sqrt_a = (int) (Math.ceil(Math.sqrt(a)));
			final int sqrt_b = (int) (Math.ceil(Math.sqrt(b)));

			TreeSet<Integer> set = new TreeSet<Integer>(
					Collections.reverseOrder());
			Stack<Integer> stack = new Stack<Integer>();

			long min = Long.MAX_VALUE;
			for (int div_a = 1; div_a <= sqrt_a; div_a++) {
				if (a % div_a != 0) {
					continue;
				}

				stack.push(div_a);
				stack.push(a / div_a);

				for (int div_b = 1; div_b <= sqrt_b; div_b++) {
					if (b % div_b != 0) {
						continue;
					}

					stack.push(div_b);
					stack.push(b / div_b);

					set.clear();
					set.addAll(stack);
					//System.out.println(set);
					
					long prev = -1;
					long sum = 0;
					for (int number : set) {
						if (prev != -1) {
							sum += (prev - number) * (prev - number);
						}
						prev = number;
					}

					min = Math.min(sum, min);
					
					stack.pop();
					stack.pop();
				}
				
				stack.pop();
				stack.pop();
			}

			System.out.println(min);
		}
	}

}