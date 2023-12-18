import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = 1000;
		String temp = s;
		boolean bool = true;
		for (int i =1;i<s.length();i++) {
			if (s.charAt(i)!=s.charAt(0)) {
				bool= false;
				break;
			}
		}
		if (bool) {
			System.out.println(0);
			return ;
		}
		for (char c= 'a';c<='z';c++) {
			boolean b = false;
			int count =0;
			temp = s;
			while (!b) {
				b = true;
				StringBuffer sb = new StringBuffer();
				for (int i=0;i<temp.length()-1;i++) {
					if (temp.charAt(i)==c||temp.charAt(i+1)==c) {
						sb.append(c);
					} else {
						sb.append(temp.charAt(i));
						b = false;
					}
				}
				temp = sb.toString();
				count ++;
			}
			if (count<min) {
				min = count;
			}
		}
		System.out.println(min);
	}
}