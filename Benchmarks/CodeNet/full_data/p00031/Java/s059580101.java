import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			int sum = Integer.parseInt(sc.nextLine());
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			int n = 1;
			
			while (sum > 0) {
				int mod = sum % 2;
				if (mod == 1) {
					list.add(n);
				}
				
				sum = sum / 2;
				n = n * 2;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(list.get(0));
			for (int i = 1; i < list.size(); i++) {
				sb.append(" " + list.get(i));
			}
			System.out.println(sb.toString());
		}
	}
}