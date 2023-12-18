import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り　0:ON　1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if(system==0) param.add(sc.next());
				if(system==1) param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		num.remove(0);
		
		Optional<Integer> max = num.stream().max(Comparator.naturalOrder());
		Optional<Integer> min = num.stream().min(Comparator.naturalOrder());
		
		System.out.println(max.get() - min.get());
	}
}