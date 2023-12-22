import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 3; i <= n; i++) {
			if(i % 3 == 0) {
				list.add(i);
			}else {
				String num = Integer.toString(i);
				for(int j = 0; j < num.length(); j++) {
					char c = num.charAt(j);
					if(c == '3') {
						list.add(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
		System.out.println();
	}
}
