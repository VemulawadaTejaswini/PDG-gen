import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	private static final int BIG_NUM  = 2000000000;
	private static final int MOD  = 1000000007;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>(1,Collections.reverseOrder());

		String order;
		StringBuilder ans = new StringBuilder();
		int value;

		while(true){

			order = scanner.next();

			if(order.equals("end")){
				break;
			}else if(order.equals("insert")){
				value = scanner.nextInt();
				Q.add(value);
			}else{ //extract
				ans.append(Integer.toString(Q.peek())).append("\n");
				Q.remove();
			}
		}
		System.out.printf(ans.toString());
	}
}


