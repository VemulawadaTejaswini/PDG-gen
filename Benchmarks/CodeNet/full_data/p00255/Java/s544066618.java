import java.util.*;
class MyComp implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		if(o1 < o2) {
			return 1; 
		}
		else if(o1 > o2) {
			return -1;
		}
		return 0;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Comparator<Integer> c = new MyComp();
		PriorityQueue <Integer> queJ= new PriorityQueue <Integer> (11,c);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			queJ.clear();
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += stdIn.nextInt();
			}
			for(int i = 0; i < n-1; i++) {
				queJ.add(stdIn.nextInt());
			}
			int max = 0;
			for(int i = 0; i < n-1; i++) {
				if(max < sum *(n-i)) {
					max = sum * (n-i);
				}
				sum += queJ.poll();
			}
			System.out.println(max);
			
			
		}
	}
}