import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* PriorityQueue */
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

	/* 入力 */
	int n = scan.nextInt();
	int m = scan.nextInt();
	int[] a = new int[n];
	int[] b = new int[m];
	int[] c = new int[m];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	    pq.offer(a[i]);
	}
	for(int i = 0; i < m; i++){
	    b[i] = scan.nextInt();
	    c[i] = scan.nextInt();
	    for(int j = 0; j < b[i]; j++){
		pq.offer(c[i]);
	    }
	}

	/* PriorityQueue内の要素を大きい順にn個足していく */
	long sum = 0;
	for(int i = 0; i < n; i++){
	    sum += pq.poll();
	}

	/* 出力 */
	System.out.println(sum);
    }
}
       
