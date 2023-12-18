import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]), m = Integer.parseInt(nm[1]);
		String[] line = br.readLine().split(" ");
		ArrayList<Integer> prices = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			prices.add(Integer.parseInt(line[i]));
		}
		Collections.sort(prices,Collections.reverseOrder());
		int indexBig = 0;
		for (int i = 0; i < m; i++) {
			int indexB = indexBig(prices);
			//System.out.println("antes " + prices);
			prices.set(indexB,prices.get(indexB)/2);
			//System.out.println("despues " + prices);
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum+= prices.get(i);
		}
		System.out.println(sum);
		br.close();
	}
	
	public static int indexBig(ArrayList<Integer> ar) {
		int big = 0;
		for (int i = 0; i < ar.size(); i++) {
			if(ar.get(big) < ar.get(i)) {
				big = i;
			}
		}
		return big;
	}

}
