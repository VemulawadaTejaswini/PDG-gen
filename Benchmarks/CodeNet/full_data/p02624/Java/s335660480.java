

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			sum = sum + i * countNumber(i);
		}

		System.out.println(sum);
	}

    public static int countNumber(int num) {
    	int count = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        return count;
    }

}
