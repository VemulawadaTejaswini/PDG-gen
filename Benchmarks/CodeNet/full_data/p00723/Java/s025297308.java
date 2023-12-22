import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static String reverse(String str){
		return new StringBuffer(str).reverse().toString();
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				String tomas = sc.next();  // sc.nextInt() と sc.nextLine() は混在しない
				TreeSet<String> pats = new TreeSet<>();
				for(int j=0;j<tomas.length()-1;j++) {
					String head = tomas.substring(0, j+1);
					String tail = tomas.substring(j+1); // tomas.substring(j+1,tomas.length()) と同じ
					pats.add(reverse(head) + tail);
					pats.add(tail + reverse(head));
					pats.add(reverse(tail) + head);
					pats.add(head + reverse(tail));
					pats.add(head + tail);
					pats.add(tail + head);
					pats.add(reverse(head) + reverse(tail));
					pats.add(reverse(tail) + reverse(head));
				}
				System.out.println(pats.size());
			}
		}
	}
}

