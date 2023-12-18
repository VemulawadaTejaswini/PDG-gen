import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nmArr = sc.nextLine().split(" ");
		String[] priceStrArr = sc.nextLine().split(" ");
		sc.close();
		
		int n = Integer.parseInt(nmArr[0]);
		int m = Integer.parseInt(nmArr[1]);
		
		
		PriorityQueue<Integer> prioqueue = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i = 0; i < n; i++) {
			prioqueue.add(new Integer(priceStrArr[i]));
		}
		
		for(int i = 0; i < m; i++) {
			Integer maxPrice = prioqueue.poll();
			prioqueue.add(maxPrice/2);
		}
		
		long sumprice = 0;
		
		for(int i = 0; i < n; i++) {
			sumprice = sumprice + prioqueue.poll();
		}
		System.out.println(sumprice);
		
	}
	
	public static int getMaxIndex(int[] intArr,int start, int end) {
		int maxPriceIndex = start;
		for(int i = start; i <= end; i++) {
			if(intArr[maxPriceIndex] < intArr[i]) {
				maxPriceIndex = i;
			}
		}
		return maxPriceIndex;
	}

}
