import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] s = sc.nextLine().split("[,. ]");
			List<String> list = new ArrayList<String>();
			for(String k : s) {
				if(k.length() >= 3 && k.length() <= 6) {
					list.add(k);
				}
			}
			for(int i = 0; i < list.size(); i++) {
				if(i == list.size() - 1) {
					System.out.println(list.get(i));
				}else {
					System.out.print(list.get(i) + " ");
				}
			}
		}
		sc.close();
	}
}
