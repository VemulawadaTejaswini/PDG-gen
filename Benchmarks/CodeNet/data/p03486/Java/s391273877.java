mport java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//入力を取得
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		List<Character> ss =new ArrayList<>();
	    List<Character> tt =new ArrayList<>();
		
	    for (int i = 0; i < s.length(); i++) {
	        	ss.add(s.charAt(i));
	    }
	    for (int i = 0; i < t.length(); i++) {
        	    tt.add(t.charAt(i));
        }
	
		Collections.sort(ss);
		Collections.sort(tt, Comparator.reverseOrder());
		
		int m = Math.min(tt.size(), ss.size());
		if (ss.equals(tt)) {
			System.out.println("No");
		} else {
		    for (int i = 0; i < m; i++) {
			    if (ss.get(i) < tt.get(i)){
				    System.out.println("Yes");
				    break;
			    } else if (ss.get(i) == tt.get(i)){
				    if (tt.size() > ss.size() && tt.get(i) == tt.get(i+1)) {
					    System.out.println("Yes");
				    } else {
				    continue;
				    }
			    } else {
				    System.out.println("No");
			    }
			
		    }
		
		}
	}
}


