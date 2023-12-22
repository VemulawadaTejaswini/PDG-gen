import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		while(true) {
			String m = as.next();
			if(m.equals(".")) {
				break;
			}
			int s = 0;
			boolean ss = false;
			String m2 = as.next();
			Pattern p = Pattern.compile("^\"");
			if(p.matcher(m).find()) {
				m = "a" + m;
				m2 = "a" + m2;
			}
			String[] mm = m.replace("\"", "-a").split("-");
			String[] mm2 = m2.replace("\"", "-a").split("-");
			if(mm.length == mm2.length) {
				for(int i = 0; i < mm.length; i++) {
					if(!mm[i].equals(mm2[i])) {
						if(i % 2 == 0) {
							s += 2;
							break;
						}else {
							if(ss) {
								s++;
								break;
							}else {
								s++;
								ss = true;
							}
						}
					}
				}
				if(s == 0) {
					System.out.println("IDENTICAL");
				}else if(s == 1) {
					System.out.println("CLOSE");
				}else {
					System.out.println("DIFFERENT");
				}
			}else {
				System.out.println("DIFFERENT");
			}
		}
	}
}
