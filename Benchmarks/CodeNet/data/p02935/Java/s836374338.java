import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> list = new ArrayList<>();
		while (true) {
			try {
				int ppp = Integer.valueOf(br.readLine());
				for (i = 0 ; i < ppp ; i++) {
					list.add(Double.valueOf(br.readLine()));
				}
				Collections.sort(list);
				double newValue = 0;
				while (list.size() != 1) {
					newValue = list.get(list.size() - 1) + list.get(list.size() - 2);
					list.set(list.size() - 2,newValue);
					list.remove(list.size() - 1);
				}
				System.out.println(list.get(0));
				
			} catch (NumberFormatException | IOException e) {
				return;
			}
		}

	}

}
