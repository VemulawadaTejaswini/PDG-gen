import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		x = Math.abs(x);
		long k = sc.nextLong();
		long d = sc.nextLong();
		
		long answer = 0;
		int count = 0;
		long temp = x;
		if(k * d <= x) answer =  x - k * d;
		else {
			for(int i = 0; i < k; i++) {
				temp -= d;
				count++;
				if(temp < 0) {
					count--;
					break;
				}
			}
			
			if((k - count) % 2 == 0) {
				answer = x - d * count;
			}
			else {
				answer = Math.abs(x - d * ++count);
			}
			
		}
		System.out.println(answer);
	}

}
