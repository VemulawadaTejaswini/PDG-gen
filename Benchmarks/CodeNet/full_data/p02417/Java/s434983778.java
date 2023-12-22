import java.util.*;

class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		char[] num = sc.nextLine().toCharArray();
		int[] count = new int[26];
		for(int i = 0; i < num.length; i++){
			final int code = num[i];
			if('A' <= code && code <= 'Z'){
				count[code - 0x41]++;
			} else if('a' <= code && code <= 'z'){
				count[code - 0x61]++;
			} else {}
		for(int i = 0; i < count.length; i++){
			sb.append(String.valueOf((char)('a'+i))).append(": ").append(count[i]).append(lb);
		}
		System.out.print(sb.toString());
	}
}