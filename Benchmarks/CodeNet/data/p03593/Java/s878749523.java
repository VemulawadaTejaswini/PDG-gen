import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<Character,Integer> map = new HashMap<Character, Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int kake = H * W;
		boolean isOne = H == 1 || W == 1 ? true : false;
		int bai4 = 0;
		int bai2 = 0;
		int bai1 = 0;
		int Kbai4 = 0;
		int Kbai2 = 0;
		int Kbai1 = 0;
		if(kake >= 4 && !isOne) {
			bai4 = kake / 4;
			kake %= 4;
		}
		if(kake >= 2) {
			bai2 = kake / 2;
			kake %= 2;
		}
		if(kake == 1) {
			bai1 = 1;
		}
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			char[] chars = s.toCharArray();
			for(int m = 0; m < chars.length; m++) {
				AddMap(chars[m]);
			}
		}
		Iterator<Integer> iterator = map.values().iterator();
		while (iterator.hasNext()) {
		    Integer num = iterator.next();
		    if(num >= 4) {
				Kbai4 += num / 4;
				num %= 4;
			}
			if(num >= 2) {
				Kbai2 += num / 2;
				num %= 2;
			}
			if(num == 1) {
				Kbai1 += 1;
			}
		}
		if(bai4 >= Kbai4) {
			bai2 += 2 * (bai4 - Kbai4);
		} else {
			System.out.println("No");
		}
		if(bai2 >= Kbai2) {
			bai1 +=  2 * (bai2 - Kbai2);
		} else {
			System.out.println("No");
		}
		if(bai1 == Kbai1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	static void AddMap(Character c) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c) + 1);
		} else {
			map.put(c, 1);
		}
	}
}