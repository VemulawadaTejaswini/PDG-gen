import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		if(a > b) {
			answer = getMinimumValue(a,b);
		}else {
			answer = getMinimumValue(b,a);
		}
		System.out.println(answer);
	}

	private static int getMinimumValue(int big, int small) {
		int answer = small;
		int counter = 1;
		while(true) {
			answer = small * counter;
			if(answer % big ==0) {
				break;
			}
			counter++;
		}
		return answer;
	}
}