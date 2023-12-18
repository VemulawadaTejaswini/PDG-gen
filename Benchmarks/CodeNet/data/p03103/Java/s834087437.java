import java.util.*;

public class Main {
	
	public static class MyPair implements Comparable<MyPair> {
		int cost;
		int supply;
		
		public MyPair(int cost, int supply) {
			this.cost = cost;
			this.supply = supply;
		}
		
		@Override
		public int compareTo(MyPair other) {
			return (this.cost - other.cost);
		}
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long totalCost = 0;
		
		MyPair[] costAndSupply = new MyPair[N];
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			costAndSupply[i] = new MyPair(A, B);
		}
		Arrays.sort(costAndSupply);
		
		int ptr = 0;
		while (M > 0) {
			MyPair mp = costAndSupply[ptr];
			if (M >= mp.supply) {
				M -= mp.supply;
				totalCost += ((long)mp.supply)*mp.cost;
			} else {
				totalCost += ((long)M)*mp.cost;
				M = 0;
			}
			ptr++;
		}
		
    	System.out.println(totalCost);
    }
  
}
