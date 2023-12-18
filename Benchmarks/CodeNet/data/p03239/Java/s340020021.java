import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int minTime = Integer.parseInt(args[0].substring(1, 2));
		List<Integer> costs = new ArrayList<Integer>();
		for(int i=1;i<args.length-1; i++) {
			if(Integer.parseInt(args[i].substring(1, 2))<=minTime) {
				costs.add(Integer.parseInt(args[i].substring(0, 1)));
			}
		}
		if(costs.size()==0) {
			System.out.println("TLE");
			return;
		}
		Collections.sort(costs);
		System.out.println(costs.get(0));

	}
}