/**
 * 
 */
import java.util.*;
import java.util.regex.Pattern;

/**
 * @author akira
 * 
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			ArrayList<Double> lst = new ArrayList<Double>();
			while (str.length() != 0) {
				int tail = str.indexOf(" ")==-1?str.length():str.indexOf(" ");
				if (Pattern.matches("[0-9]+", str.substring(0,tail))) {
					lst.add(Double.parseDouble(str.substring(0,tail)));
				} else {
					double tmp1 = lst.get(lst.size() - 1), tmp2 = lst.get(lst
							.size() - 2);
					lst.remove(lst.size() - 1);
					lst.remove(lst.size() - 1);
					if (str.charAt(0) == '+') {
						lst.add(tmp2 + tmp1);
					} else if (str.charAt(0) == '-') {
						lst.add(tmp2 - tmp1);
					} else if (str.charAt(0) == '*') {
						lst.add(tmp2 * tmp1);
					} else {
						lst.add(tmp2 / tmp1);

					}
				}
				if(tail + 1 > str.length()){
					str = "";
				}else{
					str = str.substring(tail + 1, str.length());
				}
			}
			System.out.println("" + lst.get(0));
			lst.clear();
		}
	}
}