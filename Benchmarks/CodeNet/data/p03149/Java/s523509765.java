import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int count =0; count < 4; count++) {
			list.add(a);
			list.add(b);
			list.add(c);
			list.add(d);
		}
		int mitasu = 0;
		int countAns = 0;
		boolean one = false;
		boolean seven = false;
		boolean nine = false;
		boolean forth = false;
		
		for(int youso: list) {
			if(youso == 1 && !one) {
				one = true;
				countAns++;
			}
			if(youso == 7 && !seven) {
				seven = true;
				countAns++;
			}
			if(youso == 9 && !nine) {
				nine = true;
				countAns++;
			}
			if(youso == 7 && !forth) {
				forth = true;
				countAns++;
			}
		}
		
		if(countAns == 4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
