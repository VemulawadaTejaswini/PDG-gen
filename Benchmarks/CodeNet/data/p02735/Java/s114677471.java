import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = Integer.parseInt(in.next());
		int w = Integer.parseInt(in.next());
		String[] s = new String[h];
		for (int i = 0; i < h; i++) {
			s[i] = in.next();
		}
		int i = 0;
		int j = 0;
		int count = 0;
		
		if (s[0].charAt(0) == '#' && s[h - 1].charAt(w - 1) == '#') {
			count++;
			while (i < h-1 && j < w-1) {
				if (s[i + 1].charAt(j) == '.' && s[i].charAt(j + 1) == '.') {
					count++;
					i++;
				} else if (s[i + 1].charAt(j) == '#' && s[i].charAt(j + 1) == '.') {
					i++;
				} else if (s[i + 1].charAt(j) == '.' && s[i].charAt(j + 1) == '#') {
					j++;
				} else {
					i++;
				}
			}
		} else if (s[0].charAt(0) == '#' || s[h - 1].charAt(w - 1) == '#') {
			count++;
			while (i < h - 1 && j < w-1) {
				if (s[i + 1].charAt(j) == '#' && s[i].charAt(j + 1) == '#') {
					count++;
					i++;
				} else if (s[i + 1].charAt(j) == '.' && s[i].charAt(j + 1) == '#') {
					i++;
				} else if (s[i + 1].charAt(j) == '#' && s[i].charAt(j + 1) == '.') {
					j++;
				} else {
					i++;
				}
			}
		} else {
			while (i < h - 1 && j < w - 1) {
				if(s[i + 1].charAt(j) == '#' && s[i].charAt(j + 1) == '#') {
					count++;
					i++;
				} else if (s[i + 1].charAt(j) == '.' && s[i].charAt(j + 1) == '#') {
					i++;
				} else if (s[i + 1].charAt(j) == '#' && s[i].charAt(j + 1) == '.') {
					j++;
				} else {
					i++;
				}
			}
		}
		
		System.out.println(count);
	}
}