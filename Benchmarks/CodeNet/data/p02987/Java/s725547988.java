
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<Character, Integer> list = new HashMap<>();
		for(int i = 0; i < 4; i++) {
			char tmp = s.charAt(i);
			if(list.containsKey(tmp)) {
				int val = list.get(tmp);
				val++;
				list.put(tmp, val);
			} else {
				list.put(tmp, 1);
			}
		}
		boolean flag = true;
		for(Map.Entry<Character, Integer> e : list.entrySet()) {
			if(e.getValue() != 2) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

class Pair {
	private char c;
	private int num;

	protected Pair(char c, int num) {
		super();
		this.c = c;
		this.num = num;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}