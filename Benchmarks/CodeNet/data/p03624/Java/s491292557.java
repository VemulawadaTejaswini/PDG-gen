import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String ans = "none";


		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			set.add(String.valueOf(s.charAt(i)));
			if(set.size() == 26) {
				System.out.println("None");
			}else {
			char c = 'a';
			for(int j = 0; j < 26; j++) {
				if(set.contains(String.valueOf(c))) {
					c++;
					continue;
				}
				System.out.println(c);
				break;
			}	
}
	}
	}
	}


