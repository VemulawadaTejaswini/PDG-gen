import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int count = 0;
		for(int i = 357; i <= max; i ++) {
			boolean is753 = true;
			boolean has3 = false;
			boolean has5 = false;
			boolean has7 = false;
			int tmp = i;
			cal: while(tmp > 0) {
				switch(tmp % 10) {
					case 3: has3 = true; break;
					case 5: has5 = true; break;
					case 7: has7 = true; break;
					default: is753 = false; break cal;
				}
				tmp = (int) Math.floor(tmp / 10.0);
			}
			if(is753 && has3 && has5 && has7) {
				count ++;
			}
		}
		System.out.println(count);
	}
}