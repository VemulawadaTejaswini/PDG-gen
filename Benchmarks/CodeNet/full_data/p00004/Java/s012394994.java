

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		double x, y, tmp0,tmp3;
		List<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);

		for(;;){

			for(i = 0; i < 6; i++) {
				list.add(scanner.nextDouble());
			}
			tmp0 = list.get(0);
			tmp3 = list.get(3);
			for(i = 0; i < 3; i++) {
				list.set(i, list.get(i) * tmp3);
				list.set(i + 3, list.get(i+3) * tmp0);
			}
			list.add(list.get(1) - list.get(4));
			list.add(list.get(2) - list.get(5));
			if(list.get(6) == 0){
				x = 0;
				y = list.get(2) / list.get(1);
			}else {
				y = list.get(7) / list.get(6);
				x = (list.get(2) - list.get(1) * y) / list.get(0);
			}
			if (x == -0) {
				x = 0;
			}
			if (y == -0) {
				y = 0;
			}
			//System.out.println(list);
			System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y) );
			list.clear();
		}
		}
}

