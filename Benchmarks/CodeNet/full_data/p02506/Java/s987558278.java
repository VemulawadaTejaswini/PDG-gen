import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String w = sc.nextLine();
		String t = "";
		int cnt = 0;
		
		w = w.toUpperCase();
		while(!(t.equals("END_OF_TEXT"))) {
			t = sc.next();
			if(!(t.equals("end_of_text"))) {
				t = t.toUpperCase();
			}
			String[] tArray = t.split(" ", 0);
			for(int i = 0; i < tArray.length; i++) {
				if(tArray[i].equals(w)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}