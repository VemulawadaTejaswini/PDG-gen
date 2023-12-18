import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<Character> c = new ArrayList<>();
		int cnt=0;;
		for(int i=0 ; i<s.length(); i++) {
			c.add(s.charAt(i));
		}
		int cns=0;
		for(int i=0 ; i<c.size()-1 ; i++) {
			if(c.get(i) != c.get(i+1)) {
				cnt ++;
				c.remove(i);
				c.remove(i);
				i=0;
				continue;
			}
		}
		System.out.println(cnt*2);
    }
}
