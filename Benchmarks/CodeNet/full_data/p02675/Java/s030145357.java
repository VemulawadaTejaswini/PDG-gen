package abc168;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N = N % 10;
		String ret = "hon";
		if(N == 3){
			ret = "bon";
		}else if(N == 0 || N == 1 || N == 6 || N == 8){
			ret = "pon";
		}
		System.out.println(ret);
	}
}
