import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer maxC = n / 4;
		Integer maxD = n / 7;
		String answer = "No";

		for(int ic = 0; ic <= maxC; ic ++) {
			for(int id = 0; id <= maxD; id ++) {
					int total = ic * 4 + id * 7;
					if(total == n) {
						answer = "Yes";
					}
				}
			}
		System.out.println(answer);
	}
}