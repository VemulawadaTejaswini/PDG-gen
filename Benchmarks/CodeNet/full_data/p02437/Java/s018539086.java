import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			List<Queue<Integer>> array = new ArrayList<>();
			for(i = 0; i < n; i++) {
				array.add(new PriorityQueue<Integer>(4 ,Comparator.reverseOrder()));
			}
			for(i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				int t = sc.nextInt();
				//命令1と2は配列が空なら処理しない
				if(array.get(t).isEmpty() && order_number != 0) {
					continue;
				}
				switch(order_number) {
				case 0 :
					array.get(t).add(sc.nextInt());
					break;
				case 1 :
					System.out.println(array.get(t).peek());
					break;
				case 2 :
					array.get(t).remove();
					break;
				}
			}
		}
	}
}
