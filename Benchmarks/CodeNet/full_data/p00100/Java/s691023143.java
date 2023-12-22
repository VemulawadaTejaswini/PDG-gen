import java.util.*;

public class SaleResult {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int THRESHOLD = 1000000;
		final int MAX_EMPLOYEE = 3999;
		
		Map<Integer, Integer> data = new HashMap<Integer, Integer>(3999);
		
		int n;
		int id, numOfSale, price;
		int count;
		while((n=in.nextInt()) != 0) {
			for(int i=0; i<n; i++) {
				id = in.nextInt();
				price = in.nextInt();
				numOfSale = in.nextInt();
				
				if(data.containsKey(id)) {
					data.put(id, data.get(id)+(price*numOfSale));
				} else {
					data.put(id, price*numOfSale);
				}
			}
			count = 0;
			for(int x: data.keySet()) {
				if(data.get(x)>=THRESHOLD) {
					System.out.println(x);
					count++;
				}
			}
			if(count==0) System.out.println("NA");
			
			data.clear();
		}
		
	}

}