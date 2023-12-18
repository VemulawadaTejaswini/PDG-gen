// D - Powerful Discount Tickets

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.nextLine();
		List<Integer> AList = new ArrayList<>();
		PriorityQueue<Integer> AQueue = new PriorityQueue(Comparator.reverseOrder());
		for(int i=0;i<N;i++){
			AQueue.add(sc.nextInt());
		}

		
		for(int i=0; i<M;i++){
			int m = AQueue.poll();
			AQueue.add((int)(m/2));
		}

		int sum = 0;
		Iterator<Integer> it = AQueue.iterator();
		while(it.hasNext()){
			sum += it.next();
		}
		System.out.println(sum);	
	}
}