import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ?????????????????????
 *
 * @author B7078
 *
 */
class Exception { // ?????¶,????¨??????°3???????????????
	static int flag = 0;

	public static int constrains(int[] box) {
		for (int x = 0; x < box.length; ++x) { // ???????????????????????????????????°??????????????????
			if ((x < 2 && box[x] > 50) || box[x] < -1) {
				flag = 1;
			} else if ((x == 2 && box[x] > 100) || box[x] < -1) {
				flag = 1;
			}
		}
		return flag; // ??¶?´??????¶????????????1???????????????.??£???????????????0?????????.
	}
}

/**
 * ?¨?????????????
 * 
 * @author B7078
 *
 */
class Calculator {
	static int sum = 0;
	static int count = 0;
	static int fail = 0;
	static int trash = 0; // ???????¨?????????°???????¨????????????????????????????????????¨.

	public static void cal(Queue<Integer> results, int n) {
		while (!results.isEmpty()) { // ?????\??????????´?????????????????????§?????????
			sum = 0;
			count = 0;
			for (int i = 0; i < n - 1; ++i) { // ???????¨?????????§?¨????
				if (results.peek() == -1) { // ????????????????¨????????????????????¬????????????´????????????"F"
					fail = 1;
				}
				sum += results.poll();
			}
			if (results.peek() == -1) { // ???????¨??????????(i)??¨
				count = 1;
			}
			trash = results.poll();
			trash = 0;
			Judge.jud(sum, count, fail);
		}
	}
}

/**
 * ?????????????????¨??¨????????????
 * 
 * @author B7078
 *
 */
class Judge {
	public static void jud(int sum, int count, int fail) {
		if (sum >= 80) {
			System.out.println("A");
		} else if (65 <= sum && sum < 80) {
			System.out.println("B");
		} else if (50 <= sum && sum < 65) {
			System.out.println("C");
		} else if ((30 <= sum && sum < 50) && count == 1) {
			System.out.println("C"); // (i)???????¨????50?????\??????????????????"C"
		} else if (30 <= sum && sum < 50) {
			System.out.println("D");
		} else if (sum < 30) {
			System.out.println("F");
		} else if (fail == 1) {
			System.out.println("F");
		}
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		/**
		 * ?????°??¨???????????£?¨?
		 */
		int m = 0, f = 0, r = 0; // ??????,??????,???????¨?????????°????????°
		int n = 3; // ????¨???°:?????????3?????????????¨?.?????´???.
		int temp = 0;
		String str;
		String[] box = new String[n];
		int[] consult = new int[n]; // ??????????????¨??´??°?????????
		Queue<Integer> results = new LinkedList<Integer>();
		/**
		 * ???????????\???
		 */
		while (true) { // ???????????????.???????????¶????????????"-1 -1 -1"
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			str = input.readLine();
			if (str.equals("-1 -1 -1")) { // ????????????????????\??????"-1 -1 -1"????????????
				break;
			}
			box = str.split(" ", 0);
			for (int i = 0; i < n; ++i) { // String ??? Int??????
				temp = Integer.parseInt(box[i]);
				consult[i] = temp; // Exception??????????????¨
				results.offer(temp); // ?????\?????????????????????????????\
			}
			if (Exception.constrains(consult) == 1) {
				System.exit(0);
			}
		}
		/**
		 * ?????????????????????????????????
		 */
		Calculator.cal(results, n); // ?¨?????????????????????\??????????????????
	}

}