import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean ans = true;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i=0; i<n; i++){
			String str = scanner.next();
			if (ans) {
				if (list.contains(str)) {
					ans = false;
				}else {
					if (list.isEmpty()){
						list.add(str);
					}else {
						String last = list.get(list.size()-1);
						if (str.startsWith(last.substring(last.length()-1))){
							list.add(str);
						}else {
							ans = false;
						}
					}
				}
			}
		}
		if (ans) System.out.println("Yes");
		else System.out.println("No");
	}
}