import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		ArrayList<Character> strs = new ArrayList<Character>();
		ArrayList<Integer> str_nums = new ArrayList<Integer>();
		
		int index;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((index = strs.indexOf(c)) == -1) {
				strs.add(c);
				str_nums.add(1);
			}else {
				str_nums.set(index, str_nums.get(index) + 1);
			}
		}
		
		int count = 0;
		char last = 's';
		ArrayList<Character> kaibun = new ArrayList<Character>();
		for (int i = 0; i < str_nums.size(); i++) {
			if (str_nums.get(i) % 2 == 1) {
				count++;
				last = strs.get(i);
			}else {
				for (int j = 0; j < str_nums.get(i)/2; j++) kaibun.add(strs.get(i));
			}
			if (count >= 2) {
				System.out.println("-1");
			}
		}
		
		if(count <= 1) {
			char[] strA = str.toCharArray();
			int i = 0, j = strA.length-1, k;
			for (i = 0; i < strA.length / 2; i++) {
				if(strA[i] != strA[j]) {
					k = i+1;
					while(strA[j] != strA[k])k++;
					strA = charMove(strA, k, i);
					count += k - i;
				}
				j--;
			}
			//System.out.println(strA);
			System.out.println(count);
		}
	}
	
	public static char[] charMove(char[] str, int start, int end) {
		char t;
		if(end - start > 0) {
			for(int i = start; i < end-1; i++) {
				t = str[i];
				str[i] = str[i+1];
				str[i] = t;
			}
		}else {
			for(int i = start; i >= end+1; i--) {
				t = str[i];
				str[i] = str[i-1];
				str[i-1] = t;
			}
		}
		return str;
	}
}
