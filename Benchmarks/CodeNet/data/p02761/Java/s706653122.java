import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int[] number = new int[n];
		List<Integer> chohukuList = new ArrayList<Integer>();
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(s == 1 && c ==0) {
				System.out.println(-1);
				return;
			}
			if(chohukuList.indexOf(s-1) != -1 && number[s-1] != c) {
				System.out.println(-1);
				return;
			}
			number[s-1] = c;
			chohukuList.add(s-1);
		}
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(i == 0 && number[i] ==0) {
				answer.append(1);
			}else {
				answer.append(number[i]);
			}
		}
		System.out.println(answer);

	}
}