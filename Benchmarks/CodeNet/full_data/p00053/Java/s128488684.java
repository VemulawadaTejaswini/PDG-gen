import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	int max = 100000000;

	boolean[] Prime = new boolean[max];
	private void mainrun() {
		scan = new Scanner(System.in);
		Arrays.fill(Prime, true);

		Prime[0] = Prime[1] = false;
		
		for(int i = 2;i < Math.sqrt(max);i++) {
			if(Prime[i]) {
				for(int j = i * 2;j < max;j += i) {
					Prime[j] = false;
				}
			}
		}

		for(int N = scan.nextInt();N != 0;N = scan.nextInt()){
			int Ans = 0;
			int count = N;
			for(int i = 2; i < max && count != 0;i ++) {
				if(Prime[i]) {
					Ans +=i ;
					count--;
				}
			}
			System.out.println(Ans);
		}

	}
}
