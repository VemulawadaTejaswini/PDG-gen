
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static int search_ACGT(String s,int start) {
		int result = 0;
		String target = "[ACGT]";
		Pattern p = Pattern.compile(target);
			for(int i = start; i < s.length(); i++) {
				Matcher m = p.matcher(s.substring(i,i+1));
				if(m.find()) {
					result++;
				}else {
					break;
				}
			}
		return result;
		
	}
	public static int max_ACGT(String s) {
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			int get_ACGT_num = search_ACGT(s,i);
			if(get_ACGT_num > 1) {
				max = Math.max(max,get_ACGT_num);
				i += get_ACGT_num-1;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		System.out.println(max_ACGT(S));
		sc.close();
	}

}
