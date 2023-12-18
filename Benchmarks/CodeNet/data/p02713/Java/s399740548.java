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
					ArrayList<Integer> numList = new ArrayList<>();
					if(a>=b) {
						if(c>=a) {
							numList.add(c);
							numList.add(a);
							numList.add(b);
						}else if(c>=b) {
							numList.add(a);
							numList.add(c);
							numList.add(b);
						}else {
							numList.add(a);
							numList.add(b);
							numList.add(c);
						}
					}else {
						//b>a
						if(c>=b) {
							numList.add(c);
							numList.add(b);
							numList.add(a);
						}else if(c>=a) {
							numList.add(b);
							numList.add(c);
							numList.add(a);
						}else {
							numList.add(b);
							numList.add(a);
							numList.add(c);
						}
					}
					ArrayList<Integer> divisor = new ArrayList<>();
					int num2 = numList.get(2);
					for(int i = 1; i <= num2; i++) {
						if(num2%i == 0) {
							divisor.add(i);
						}
					}
					int t = 0;
					int num0 = numList.get(0);
					int num1 = numList.get(1);

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
