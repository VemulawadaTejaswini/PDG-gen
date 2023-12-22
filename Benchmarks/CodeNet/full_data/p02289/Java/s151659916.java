
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printer = new PrintWriter(System.out);//今週知った高速化テク２：これを使う事でオートフラッシュを避ける

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(;;) {
			Scanner scanner = new Scanner(br.readLine());
			String order = scanner.next();
			if(order.equals("insert")) {
				queue.offer(Integer.parseInt(scanner.next()));
			}else if(order.equals("extract")) {
				printer.println(queue.poll());
			}else if(order.equals("end")){
				break;
			}
			scanner.close();
		}

		printer.flush();
	}

}

