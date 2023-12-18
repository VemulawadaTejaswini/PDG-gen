import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();

		long answer = 0;
		for(int a = 1; a <= K; a++) {
			for(int b = 1; b <= K; b++) {
				for(int c = 1; c <= K; c++) {
					int t = 0;
					int num2 = Math.min(a, Math.min(b, c));
					int num1 = 0;
					int num0 = Math.max(c,Math.max(a, b));

					/*
					if(a>=b) {
						if(c>=a) {
							num1 = a;
						}else if(c>=b) {
							num1 = c;
						}else {
							num1 = b;
						}
					}else {
						//b>a
						if(c>=b) {
							num1 = b;
						}else if(c>=a) {
							num1 = c;
						}else {
							num1 = a;
						}
					}
					*/
					ArrayList<Integer> divisor = new ArrayList<>();
					for(int i = 1; i <= num2; i++) {
						if(num2%i == 0) {
							divisor.add(i);
						}
					}
					for(int j = 0; j < divisor.size();j++) {
						if(a%divisor.get(j)==0) {
							if(b%divisor.get(j)==0) {
								if(c%divisor.get(j)==0) {
									t = divisor.get(j);
								}
							}
						}
					}
					answer += t;

				}
			}
		}

		System.out.println(answer);
	}
}
