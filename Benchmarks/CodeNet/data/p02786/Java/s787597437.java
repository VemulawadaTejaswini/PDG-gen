import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long h = stdIn.nextLong(); //モンスターの体力
		
		double aa = Math.log(h)/Math.log(2);
		int a = (int)aa;

		long cnt = 0;
		
		for(int i = 0; i <= a; i++) {
			cnt += Math.pow(2, i);
		}
		System.out.println(cnt);
	}

}
