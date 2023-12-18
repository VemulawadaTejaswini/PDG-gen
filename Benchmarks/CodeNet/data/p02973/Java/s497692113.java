
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int n = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<n;i++) {
			int num = scan.nextInt();
			boolean did = false;
			for (int j=0;j<list.size();j++) {
				if (list.get(j) < num) {
					list.set(j, num);
					did = true;
					break;
				}
			}
			if (did)
				continue;
			list.add(num);
		}
		
		System.out.println(list.size());
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}
