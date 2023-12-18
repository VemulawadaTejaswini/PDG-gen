

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		long answer;

		if(k % 2 == 0 || k == 0){
			answer = a-b;
		}else{
			answer = b -a;
		}


		if(answer > Math.pow(10,18)){
			System.out.println("Unfair");
		}else{
		System.out.println(answer);
		}

	}

}
