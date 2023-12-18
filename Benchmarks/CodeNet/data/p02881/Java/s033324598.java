import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Long n = stdIn.nextLong();
		Long min = Long.MAX_VALUE;

		for(int i = 1; i < n/2; i++) {
			if(n%i == 0) {
				long b = n/i; //商
				long c = compare(i,b);
				if(min > c) {
					min = c;
				}
			}

		}

	
		System.out.println(min);

	}
	static int compare(int a, long b) {  //移動回数の合計を出すメソッド
		int count = 0;
		count += a-1;
		count += b-1;
		return count;
	}


}
