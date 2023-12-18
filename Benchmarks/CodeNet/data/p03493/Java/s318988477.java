import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int answer = 0;
		String[] input = sc.next().split("");
		for(int i =0; i < 3; i++) {
			if(input[i].equals("1")) {
				answer++;
			}
		}
		System.out.println(answer);


	}
}