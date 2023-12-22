import java.util.*;
public class Main {

	public static void main(String[] args) {
		int p, q, r, quot;
		int c_st, c_ed;
		int count;
		boolean flag;
		Scanner scanner = new Scanner(System.in);
		StringBuffer decimalString = new StringBuffer();
		HashMap<Integer, Integer> remainMap = new HashMap<Integer, Integer>();
		
		while (scanner.hasNext()) {
			p = scanner.nextInt();
			q = scanner.nextInt();

			decimalString.setLength(0);
			remainMap.clear();
			flag = true;
			c_st = c_ed = 0;
			count = 0;
			
			p = p % q;
			r = p;
			remainMap.put(r, count);
			
			while (flag && r > 0) {
				count++;
				p *= 10;
				quot = p / q;
				r = p % q;
				p = r;
				decimalString.append(quot);
				
				if (quot != 0 && remainMap.containsKey(r)) {
					c_st = remainMap.get(r);
					c_ed = count;
					flag = false;
				} else {
					remainMap.put(r, count);
				}
			}
			
			if (flag) {
				System.out.println(decimalString.toString());
			} else {
				System.out.println(decimalString.toString());
				StringBuffer str = new StringBuffer();
				for(int i = 0; i < c_st; i++) {
					str.append(" ");
				}
				for(int i = c_st; i < c_ed; i++) {
					str.append("^");
				}
				System.out.println(str.toString());
			}
		}
	}
}