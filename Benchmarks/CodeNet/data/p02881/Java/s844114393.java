import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		int k = 0;
		
		for(int i = 1; i <= n/2; i++) {
			if(n%i == 0) {
				int b = n/i; //商
				a.add(compare(i,b));
				k++;
			}

		}

		int min = Integer.MAX_VALUE;

		
		for(int i = 0; i < a.size(); i++) {
			int d = a.get(i);
			if(min > d) {
				min = d;
			}
		}
		System.out.println(min);

	}
	static int compare(int a, int b) {  //移動回数の合計を出すメソッド
		int count = 0;
		count += a-1;
		count += b-1;
		return count;
	}


}
