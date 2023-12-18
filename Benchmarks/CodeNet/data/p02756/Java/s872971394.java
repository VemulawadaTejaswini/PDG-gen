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
			char[] que = scan.nextLine().toCharArray();
			if(que[0] == '1') {
				reverse = ! reverse;
			} else {
				if(que[2] == '1') {
					if(reverse) {
						end ++;
						list[end] = que[4];
					} else {
						start--;
						list[start] = que[4];
					}
				} else {
					if(reverse) {
						start--;
						list[start] = que[4];
					} else {
						end ++;
						list[end] = que[4];
					}
				}
			}
		}


		StringBuilder sb = new StringBuilder();
		for(int i = start;i < end + 1;i ++) {
			sb.append(list[i]);
		}
		
		if(reverse) {
			sb.reverse();
		}
		System.out.println(sb.toString());
	}
	
	static Random rand = new Random();
	
	public static String get() {
		int num = rand.nextInt(3);
		if(num == 0) {
			return "1";
		} else if (num == 1) {
			return "2 1 s";
		} else {
			return "2 2 k";
		}
	}
}
