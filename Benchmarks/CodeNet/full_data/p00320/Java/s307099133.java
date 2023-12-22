import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < 12; i++) {
			int num = sc.nextInt();
			list.add(num);
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			} else {
				map.put(num, 1);
			}
		}
		Collections.sort(list);
		boolean ok = true;
		for(int i = 0; i < list.size(); i++) {
			if(map.get(list.get(i)) % 2 != 0) ok = false;
		}
		if(ok) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		
	}
}