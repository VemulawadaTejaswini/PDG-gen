import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		boolean flag = false;
		
		String line = "";
		while (sc.hasNext() == true) {
			line = sc.nextLine();

			for (int i = 0; i < 10; i++) {
				flag = check(line.replaceAll("X", "" + i));
				
				if (flag == true) {
					System.out.println(i);
					break;
				}
			}
			if (flag == false) System.out.println("NA");
		}
	}
	
	public boolean check(String formula) {
		String[] number = new String[3];
		
		int p = 0;
		for (int i = 0; i < number.length; i++) {
			number[i] = "";
			
			while (Character.isDigit(formula.charAt(p)) == true) {
				number[i] = number[i] + formula.charAt(p);
				p++;
				
				if (p == formula.length()) break;
			}
			
			if ((number[i].charAt(0) == '0') && (number[i].length() > 1)) return false;
			p++;
		}

		int carry = 0;
		for (int i = 0; i < number[2].length(); i++) {
			int a = 0;
			int b = 0;
			int c = number[2].charAt(number[2].length() - i - 1) - '0';
			
			if (i < number[0].length()) a = number[0].charAt(number[0].length() - i - 1) - '0';
			if (i < number[1].length()) b = number[1].charAt(number[1].length() - i - 1) - '0';
			
			if (((a + b + carry) % 10) != c) return false;
			carry = (a + b + carry) / 10;
		}
		
		return true;
	}
}