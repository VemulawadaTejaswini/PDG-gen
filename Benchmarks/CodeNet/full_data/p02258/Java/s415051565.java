import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int max_profit(ArrayList<Integer> arr) {
		int min_val = arr.get(0);
		int max_val = -Integer.MIN_VALUE;
		
		int i = 1;
		while(i < arr.size()) {
			max_val = Math.max(max_val, arr.get(i) - min_val);
			min_val = Math.min(min_val, arr.get(i));
			i++;
		}
		
		
		return max_val;
	}
	public static void main(String [] args) {
		Scanner br = new Scanner(System.in);
		int len;
		
		len = br.nextInt();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int val = 0;
		while(len > 0) {
			val = br.nextInt();
			arr.add(val);
			len --;
		}
		
		
		//invoke the computation part
		System.out.println(max_profit(arr));
		br.close();
		
	}
	
}