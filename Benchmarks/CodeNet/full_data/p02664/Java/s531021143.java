import java.util.*;

public class Main {

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(text);
		int num = 1;
		for (int a = text.length()-1; a>0; a--) {
			char c = sb.charAt(a);
			if (num == 1) {
				if (c == '?') {
					sb.setCharAt(a, 'D');
				}
				num++;
			} else {
				char c1 = sb.charAt(a+1);
				if (c1 == 'P') {
					sb.setCharAt(a, 'D');
				} else {
					sb.setCharAt(a, 'P');
				}
			}
		}
		System.out.println(sb.toString());
	}
}