
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		List<List<String>> list = new ArrayList <>();
		for(int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
			list.get(i).add(sc.next());
			list.get(i).add(sc.next());
		}
		int sum = 0;
		while(list.size() > 0) {
			int time = Integer.parseInt(list.get(0).get(1));
			if(time <= q) {
				sum += time;
				System.out.println(list.get(0).get(0) + " " + sum);
				list.remove(0);
			} else {
				sum += q;
				list.add(list.get(0));
				list.get(list.size() - 1).set(1, Integer.toString(time - q));
				list.remove(0);
			}
		}
		sc.close();
	}

}

