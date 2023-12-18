import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] origin = scan.nextLine().toCharArray();
		int num = Integer.parseInt(scan.nextLine());
		
		//List<Character> list = new LinkedList<>();
		char[] list = new char[500000];
		int start = 200000;
		int end = start + origin.length - 1;
		
		for(int i = 0;i < origin.length;i ++) {
			list[start + i] = origin[i];
		}
		
		boolean reverse = false;
		
		for(int i = 0;i < num;i ++) {
			String que = scan.nextLine();
			if(que.charAt(0) == '1') {
				reverse = ! reverse;
			} else {
				if(que.charAt(2) == '1') {
					if(reverse) {
						end ++;
						list[end] = que.charAt(4);
					} else {
						start--;
						list[start] = que.charAt(4);
					}
				} else {
					if(reverse) {
						start--;
						list[start] = que.charAt(4);
					} else {
						end ++;
						list[end] = que.charAt(4);
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