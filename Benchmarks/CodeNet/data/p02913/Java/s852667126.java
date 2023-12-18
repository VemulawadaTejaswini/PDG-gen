import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=1;i<N-1;i++){
			for(int j=0;j<i-1;j++){
				String B = S.substring(j,i);
				String C = S.substring(i,N);
				if(C.contains(B)){pq.add(B.length());}
			}
		}
		System.out.println(pq.poll());
	}
}
