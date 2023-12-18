import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<String> weather = new ArrayList<String>();
		while(sc.hasNextLine()) {
			weather.add(sc.next());
		}

		int weatherCount = weather.size();
		int weatherCountOk = 0;
		for(int i = 0; weatherCount < i ; i++) {
			if(weather.get(i).substring(i, i+1).equals(weather.get(i+1).substring(i, i+1))) {
				weatherCountOk++;
			}
		}
		System.out.println(weatherCountOk);
		sc.close();

	}
}
