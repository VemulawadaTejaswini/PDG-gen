import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int min = 10000;
		int kouho = 0;
		ArrayList<Integer> forbiddenList = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			forbiddenList.add(sc.nextInt());
		}
		for(int i = -3 ; i < 105 ; i++) {
			if((forbiddenList.contains(i)))
				continue;
			int sa = Math.abs(i - x) ;
			if(sa > min)
				continue;
			if(sa < min)
				kouho = i;
			if(sa == min)
				kouho = Math.min(kouho, i);

			min = sa;
		}
		System.out.println(kouho);
	}


}

