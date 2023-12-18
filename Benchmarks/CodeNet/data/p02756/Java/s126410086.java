import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		
		List<Character> list = new LinkedList<>();
		for(char c : s.toCharArray()) {
			list.add(c);
		}
		
		boolean reverse = false;
		
		for(int i = 0;i < num;i ++) {
			String que = scan.nextLine();
			if(que.charAt(0) == '1') {
				reverse = ! reverse;
			} else {
				if(que.charAt(2) == '1') {
					if(reverse) {
						list.add(que.charAt(4));
					} else {
						list.add(0, que.charAt(4));
					}
				} else {
					if(reverse) {
						list.add(0, que.charAt(4));
					} else {
						list.add(que.charAt(4));
					}
				}
			}
		}


		StringBuilder sb = new StringBuilder();
		for(char c : list) {
			sb.append(c);
		}
		
		if(reverse) {
			sb.reverse();
		}
		System.out.println(sb.toString());
	}
}