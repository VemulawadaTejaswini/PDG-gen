import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		if(size == 0) {
			System.out.println(target);
			sc.close();
			return;
		}

		for (int i=0;i < size;i++) {
			list.add(sc.nextInt());
		}
		sc.close();

		Collections.sort(list);
		int tmp = list.indexOf(target);

		if(tmp < 0) {
			System.out.println(target);
			return;
		}

		int count = 1;
		int max_tmp = tmp;
		int min_tmp = tmp;
		while(target - count > 0 ||  target + count <= list.get(size-1)) {

			min_tmp = list.indexOf(target - count);
			if(min_tmp < 0 && (target - count) > 0) {
				System.out.println(target - count);
				return;
			}

			max_tmp = list.indexOf(target + count);
			if(max_tmp < 0 && (target + count) <= list.get(size-1)) {
				System.out.println(target + count);
				return;
			}

			count++;

		}

		if(list.get(size-1) <= 100) {
			System.out.println(target);
		}else {
			System.out.println(0);
		}


		return;
	}

}