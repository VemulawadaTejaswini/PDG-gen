import java.io.IOException;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int sizeOfList = sc.nextInt();
		List<Integer> values = new ArrayList<Integer>();

		int biggest = -1;
		for (int i = 0; i < sizeOfList; i++) {
			values.add(sc.nextInt());
		}

		for (int i =0; i < values.size(); i++) {
			for (int j = i; j < values.size(); j++) {
				int diff = values.get(j) - values.get(i);
				if (biggest < diff) {
					biggest = diff;
				}
			}
		}
		System.out.println(biggest);
	}
}