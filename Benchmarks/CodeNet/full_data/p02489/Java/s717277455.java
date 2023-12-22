import java.util.Scanner;

class Main {
	
	public static void main (String[] args) {
		int i = 1;
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int num = s.nextInt();
			switch (num) {
			case 0:
				s.close();
				return;
			default:
				System.out.println("case "+i+": "+num);
				i++;
			}
		}
	}
}