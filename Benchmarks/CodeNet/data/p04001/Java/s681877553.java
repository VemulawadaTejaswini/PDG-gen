import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String[] strs = str.split("");

		long temp = 0;
		long answer = 0;
		for(int i=0; i<(1<<strs.length-1); i++) {
			temp = Integer.parseInt(strs[0]);
			for(int j=0; j<strs.length-1; j++) {
				if((1&(i>>j)) == 1) {
					answer += temp;
					temp = 0;
				}
				temp = temp*10 + Integer.parseInt(strs[j+1]);
			}
			answer += temp;
		}
		System.out.println(answer);
	}
}