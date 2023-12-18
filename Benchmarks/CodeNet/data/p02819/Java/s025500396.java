import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		sc.close();
		Main m = new Main();

		while (true) {
			if(m.searchPrime(num)) {
				break;
			}else{
				num++;
			};
		}
		System.out.println(num);

	}

	public boolean searchPrime(int num) {
		//true == prime
		//false == not prime
		boolean isPrimeFlg = true;
		int numsPiv = (int)Math.sqrt(num);
		for (int i = 2; i < numsPiv; i++) {
			if (num % i == 0) {
				isPrimeFlg = false;
				break;
			}
		}

		return isPrimeFlg;
	}
}