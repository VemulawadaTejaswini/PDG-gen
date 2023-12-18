import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> city = new ArrayList<>();
		List<String> city_sorted = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String s = in.next();
			int p = 100 - in.nextInt();
			if(p<10) {
				city.add(s + "00" + p);
				city_sorted.add(s + "00" + p);
			}
			else if(p<100) {
				city.add(s + "0" + p);
				city_sorted.add(s + "0" + p);
			}
			else {
				city.add(s + p);
				city_sorted.add(s + p);
			}
			
		}
		Collections.sort(city_sorted);
		for(int i=0;i<n;i++) {
			String s = city_sorted.get(i);
			for(int j=0;j<n;j++) {
				if(s.equals(city.get(j))) {
					System.out.println(j+1);
					break;
				}
			}
		}
		in.close();
	}

}
