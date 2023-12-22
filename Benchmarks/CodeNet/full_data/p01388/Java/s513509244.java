import java.util.Scanner;

public class Main {

	/**
	 *AOJテァツ板ィテ」ツδ療」ツδュテ」ツつクテ」ツつァテ」ツつッテ」ツδ?
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
		Scanner scan = new Scanner(System.in);
		int k = 0, u = 0, p = 0, c = 0;
		String str;
		str = scan.next();
		char chr;
		int a = 0;
		for (int i = 0; i < str.length(); i++) {
			chr = str.charAt(i);
			switch (chr) {
			case 'K':
				k++;
				break;
			case 'U':
				u++;
				break;
			case 'P':
				p++;
				break;
			case 'C':
				c++;
				break;
			default:
				break;
			}
		}
		a = Math.min(k, u);
		a = Math.min(a, p);
		a = Math.min(a, c);
		System.out.println(a);
	}
}