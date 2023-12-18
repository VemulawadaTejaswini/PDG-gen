

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
					int num0 = 0;
					int num1 = 0;
					int num2 = 0;
					if(a>=b) {
						if(c>=a) {
							num0 = c;
							num1 = a;
							num2 = b;
						}else if(c>=b) {
							num0 = a;
							num1 = c;
							num2 = b;
						}else {
							num0 = a;
							num1 = b;
							num2 = c;						}
					}else {
						//b>a
						if(c>=b) {
							num0 = c;
							num1 = b;
							num2 = a;
						}else if(c>=a) {
							num0 = b;
							num1 = c;
							num2 = a;
						}else {
							num0 = b;
							num1 = a;
							num2 = c;
						}
					}
					ArrayList<Integer> divisor = new ArrayList<>();
					for(int i = 1; i <= num2; i++) {
						if(num2%i == 0) {
							divisor.add(i);
						}
					}
					for(int j = 0; j < divisor.size();j++) {
						if(num0%divisor.get(j)==0) {
							if(num1%divisor.get(j)==0) {
								t = divisor.get(j);
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
