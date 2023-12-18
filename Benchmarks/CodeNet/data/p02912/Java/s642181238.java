import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//購入する品物数
		int nNum = Integer.parseInt(sc.next());
		//割引券の所持数
		int mNum = Integer.parseInt(sc.next());
		//品物の価格
		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i<nNum; i++) {
    	   q.add(Integer.parseInt(sc.next()));
		}
		//降順ソート　高い順
		for(int i = 0; i<mNum; i++) {
			q.add(q.poll() / 2);
		}
		long sum = 0;
		for (Integer price : q) {
			sum+=price;
		}
		System.out.println(sum);
	}	
}
