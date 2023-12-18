import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int d =0; d < a; d++) {
			int in = sc.nextInt();
			list.add(in);
		}
		int countFirstQuestion = 0;
		int countSecondQuestion = 0;
		int countThirdQuestion = 0;
		for(int youso: list) {
			if(youso <= b) {
				countFirstQuestion++;
			}
			if(youso >= b && youso <= c+1) {
				countSecondQuestion++;
			}
			if(youso >= c+1) {
				countThirdQuestion++;
			}
		}
		int min = countFirstQuestion;
		if (min >=  countSecondQuestion) {
			min = countSecondQuestion;
		}
		if (min >=  countThirdQuestion) {
			min = countThirdQuestion;
		}
		System.out.println(min);
		
	}

}
