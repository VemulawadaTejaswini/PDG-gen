import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < count; i++) {

			int call = sc.nextInt();
			if(list.indexOf(call) != -1) {
				list.remove(list.indexOf(call));
			}else {
				list.add(call);
			}

		}

		System.out.println(list.size());
	}
}
