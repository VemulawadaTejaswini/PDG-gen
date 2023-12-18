import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(),w = sc.nextInt();
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(char c : s.toCharArray()) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				} else {
					map.put(c, 1);
				}
			}
		}
		int one = 0,two = 0,four = 0;
		four = w/2 * (h/2);
		if(h%2==1&&w%2==1) {
			one = 1;
			two = w/2 + h/2;
		} else if(h%2==0&&w%2==1) {
			two = h/2;
		} else if(w%2==0&&h%2==1) {
			two = w/2;
		}
		//System.out.println(String.format("one=%d two=%d four=%d", one,two,four));
		Iterator<Integer> itr = map.values().iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			//System.out.println(i);
			while(i>0) {
				if(i>=4&&four>0) {
					four--;
					i-=4;
				} else if(i>=2&&two>0) {
					two--;
					i-=2;
				} else if(i>=1&&one>0) {
					one--;
					i-=1;
				} else {
					break;
				}
			}
			//System.out.println(i);
		}
		//System.out.println(String.format("one=%d two=%d four=%d", one,two,four));
		if(one!=0||two!=0||four!=0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}