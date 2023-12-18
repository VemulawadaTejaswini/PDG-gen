import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> list = new ArrayList<>();
		while (true) {
			try {
				Integer.valueOf(br.readLine());
				String aaa = br.readLine();
				String[] bbb = aaa.split(" ");
				List<String> tmp = Arrays.asList(bbb);
				ArrayList<String> tmp2 = new ArrayList<String>(tmp);
				for (String t : tmp2) {
					list.add(Double.parseDouble(t));
				}
				
				Collections.sort(list);
				Collections.reverse(list);
				double newValue = 0;
				while (list.size() != 1) {
					newValue = list.get(list.size() - 1) + list.get(list.size() - 2);
					newValue = newValue / 2.00;
					list.set(list.size() - 2,newValue);
					list.remove(list.size() - 1);
					Collections.sort(list);
					Collections.reverse(list);
				}
				System.out.println(list.get(0));
				
			} catch (NumberFormatException | IOException e) {
				return;
			}
		}

	}

}
