import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i=1;i<a;i++) {

			int tmpA = i;
			int sum = 0;

			while(tmpA > 0) {
				sum += tmpA%10;
				tmpA = tmpA/10;
			}

			int tmpB = a - i;

			while(tmpB > 0) {
				sum += tmpB%10;
				tmpB = tmpB/10;
			}

			if(sum < min) {
				min = sum;
			}

		}


		System.out.println(min);

	}



}