import java.util.Scanner;

public class Main {
	public static final String[] PREFIX = {"yotta","zetta","exa","peta","tera","giga","mega","kilo","hecto","deca","deci","centi","milli","micro","nano","pico","femto","ato","zepto","yocto"};
	public static final int[] SCALE = {24,21,18,15,12,9,6,3,2,1,-1,-2,-3,-6,-9,-12,-15,-18,-21,-24};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t=0;t<T;t++) {
			String[] s = sc.nextLine().split(" ");
			int scale = 0;
			if (s.length == 2) {
				scale = 0;
			}else{
				for(int j=0;j<PREFIX.length;j++) {
					if (s[1].equals(PREFIX[j])) {
						scale = SCALE[j];
						break;
					}
				}
				s[1] = s[2];
			}
			if (s[0].indexOf('.') >= 0) {
				scale -= s[0].length() - 1 - s[0].indexOf('.');
			}
			s[0] = s[0].replace(".", "");
			for(int j=0;j<s[0].length();j++) {
				if (s[0].charAt(j) != '0') {
					s[0] = s[0].substring(j);
					break;
				}
			}
			scale += s[0].length() - 1;
			if (s[0].length() == 1) {
				System.out.print(s[0] + " * ");
			}else{
				System.out.print(s[0].charAt(0) + "." + s[0].substring(1) + " * ");
			}
			System.out.println("10^" + scale + " " + s[1]);
		}
	}

}